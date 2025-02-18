package jp.naist.se.codehash;


/**
 * A simple token reader that provides a sequence of tokens.
 */
public interface TokenReader {

	/**
	 * Read the next token.
	 * This method must be called before reading the first token.
	 * @return true if there exists a token.
	 */
	public boolean next();
	
	/**
	 * @return the current token.  This method returns null if the reader reached EOF (next() returned false).
	 */
	public String getText();

	/**
	 * @return a normalized text of the current token. 
	 */
	public String getNormalizedText();

	/**
	 * @return a normalized text of the current token using P-Match. 
	 */
	public String getPMatchNormalizedText();
	
	/**
	 * @return the line of the current token.
	 */
	public int getLine();

	/**
	 * @return the position of the current token.
	 */
	public int getCharPositionInLine();

	/**
	 * @return the number of tokens read by the reader.
	 */
	public int getTokenCount();
	
	/**
	 * @return the token type of the current token.
	 * The meaning depends on an underlying lexer.
	 */
	public int getTokenType();
}
