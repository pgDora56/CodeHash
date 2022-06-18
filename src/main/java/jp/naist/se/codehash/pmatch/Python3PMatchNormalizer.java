package jp.naist.se.codehash.pmatch;


import java.util.HashMap;
import org.antlr.v4.runtime.Token;

import jp.naist.se.commentlister.lexer.Python3Lexer;


public class Python3PMatchNormalizer implements PMatchNormalizer {

	public static final String NORMALIZED_TOKEN = "$";

	@Override
	public String normalize(Token t, HashMap<String, String> map) {
		switch (t.getType()) {
		case Python3Lexer.NAME:
			if(map.containsKey(t.getText())) {
				return map.get(t.getText());
			} else {
				String token = NORMALIZED_TOKEN + map.size();
				map.put(t.getText(), token);
				return token;
			}
		}
		return t.getText();
	}
}
