package com.counting.characters.in.a.string;

public class TestSymbolCount {
	public static void main(String[] args) {
	SymbolCount count = new SymbolCount();
	String sentence = count.toSentence("Hello World!");
	System.out.println(sentence);
	}
}
