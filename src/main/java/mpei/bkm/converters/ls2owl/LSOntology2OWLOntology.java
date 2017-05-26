package mpei.bkm.converters.ls2owl;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.logic.LSOntology;
import mpei.bkm.model.logic.statement.Statement;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LSOntology2OWLOntology implements Converter<LSOntology, OWLOntology> {
    private final String ONTOLOGY_URI = "http://mpei.ru/bkm/";

    @Override
    public OWLOntology convert(LSOntology lsOnt) throws UnconvertableException {
        try {
            OWLOntologyManager manager = OWLManager.createOWLOntologyManager();

            IRI ontIRI;
            if (lsOnt.getName() == null || lsOnt.getName().isEmpty()) {
                ontIRI = IRI.getNextDocumentIRI(ONTOLOGY_URI + "generated/");
            } else {
                LocalDateTime now = LocalDateTime.now();
                ontIRI = IRI.create(String.format("%s/%d/%d/%d/%s",
                        ONTOLOGY_URI,
                        now.getYear(), now.getMonthValue(), now.getDayOfMonth(),
                        lsOnt.getName()));
            }
            OWLOntology ont = manager.createOntology(ontIRI);

            // TODO: actually declaring classes and axioms explicitly is redundant since owlapi declares classes itself
            Concepts2OWL conceptsConverter = new Concepts2OWL(manager, ont);
            ont.addAxioms(conceptsConverter.convert(lsOnt));

            Statement2OWL statementConverter = new Statement2OWL(manager, ont);
            Set<String> failedConversions = new HashSet<>();
            for (Statement s : lsOnt.getStatements()) {
                try {
                    ont.addAxioms(statementConverter.convert(s));
                }
                catch (UnconvertableException e) {
                    failedConversions.addAll(e.getReasons());
                }
            }

            if (!failedConversions.isEmpty()) {
                throw new UnconvertableException(
                    failedConversions.toArray(
                            new String[failedConversions.size()]
                    )
                );
            }
            return ont;
        } catch (OWLOntologyCreationException e) {
            throw new UnconvertableException(e);
        }
    }
}