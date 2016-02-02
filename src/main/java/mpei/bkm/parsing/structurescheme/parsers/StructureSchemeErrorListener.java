package mpei.bkm.parsing.structurescheme.parsers;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for collecting error messages when parsing text.
 */
public class StructureSchemeErrorListener extends BaseErrorListener {
    private List<String> errorMessages = new ArrayList<String>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        errorMessages.add(String.format("Error at line %d:%d; %s", line, charPositionInLine, msg));
    }

    /**
     * Gets list of all error messages encountered.
     * @return List of error messages
     */
    public List<String> getErrorMessages() {
        return errorMessages;
    }
}
