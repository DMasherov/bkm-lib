package mpei.bkm.parsing.ls.parseinfo;

/**
 * Helper class for memorizing line and position number of a symbol in text.
 */
public class Positioning {
    private int line;
    private int charPositionInLine;

    public Positioning(int line, int charPositionInLine) {
        this.line = line;
        this.charPositionInLine = charPositionInLine;
    }

    /**
     * Gets line number of a symbol in text.
     * @return Line number
     */
    public int getLine() {
        return line;
    }

    /**
     * Gets line position number of a symbol in text.
     * @return Position on a line
     */
    public int getCharPositionInLine() {
        return charPositionInLine;
    }
}
