package pascal.frontend;

public class EofToken extends Token{
    public EofToken(Source source)
        throws Exception
    {
        super(source);
    }

    /**
     * Do nothing. Do not consume any source characters.
     * @param source the source from where to fetch the token's characters.
     * @throws Exception if an error occurred.
     */
    protected void extract(Source source)
        throws Exception
    {
        
    }
}
