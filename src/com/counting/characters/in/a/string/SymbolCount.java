package com.counting.characters.in.a.string;

import java.io.*;
import java.util.Arrays;
//java.lang.Character;

class SymbolCount {

	public String toSentence(String sentence) {
		char[] characters = sentence.toCharArray();
		sentence = "";
		for (char calc : characters) {
				sentence += calc;
		}
		return sentence;
	}
}
