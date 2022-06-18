package jp.naist.se.codehash.pmatch;

import java.util.HashMap;

import org.antlr.v4.runtime.Token;

public interface PMatchNormalizer {
    public String normalize(Token t, HashMap<String, String> map);
}
