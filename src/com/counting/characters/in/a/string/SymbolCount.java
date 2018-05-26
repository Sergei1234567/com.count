package com.counting.characters.in.a.string;

class SymbolCount {

	public String toSentence(String sentence) {
		char[] characters = sentence.toCharArray();
		String result = "";
		char[] uniqueCharacters = new char[characters.length];
		for(int i = 0; i < characters.length; i++) {
			int counter = 0;
			char c = characters[i];
			for(char tempTi : characters) {
				if(tempTi == c) {
					counter++;
				}
			}
			
			if(counter == 1) {
				uniqueCharacters[i] = c;
			}
		}
		
		for (char calc :uniqueCharacters) {
			int counter = 0;
			for(char tempCalc : characters) {
				if(tempCalc == calc) {
					counter++;
				}
			}
			System.out.println(calc + " -> " + counter);
		}
		return result;
		
	}
}