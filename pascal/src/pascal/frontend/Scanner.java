package pascal.frontend;


/**
 * <h1>Scanner</h1>
 *
 * <p>A language-independent framework class. This abstract scanner class
 * will be implemented by language-specific subclasses.</p>
 */
public abstract class Scanner {
    protected Source source;        // source
    private Token currentToken;     // current token

    /**
     * Constructor
     * @param source the source to be used with this scanner.
     */
    public Scanner(Source source)
    {
        this.source = source;
    }

    /**
     * @return the current token
     */
    public Token currentToken()
    {
        return currentToken;
    }

    /**
     * Return next token from the source.
     * @return the next token.
     * @throws Exception if an error occured
     */
    public Token nextToken()
        throws Exception
    {
        currentToken = extractToken();
        return currentToken;
    }

    protected abstract Token extractToken()
        throws Exception;

    public char currentChar()
        throws Exception
    {
        return source.currentChar();
    }

    public char nextChar()
        throws Exception
    {
        return source.nextChar();
    }
}
