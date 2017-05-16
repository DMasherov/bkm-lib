package mpei.bkm.converters.ls2owl;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lls1.LSOntology;
import mpei.bkm.model.lls1.statement.Statement;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import java.time.LocalDateTime;

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
            Concepts2OWLConverter conceptsConverter = new Concepts2OWLConverter(manager, ont);
            ont.addAxioms(conceptsConverter.convert(lsOnt));

            Statement2OWLConverter statementConverter = new Statement2OWLConverter(manager, ont);
            for (Statement s : lsOnt.getStatements()) {
                ont.addAxioms(statementConverter.convert(s));
            }

            return ont;
        } catch (OWLOntologyCreationException e) {
            throw new UnconvertableException(e);
        }
    }
}