package com.occ.java;

import java.util.Arrays;

public class CalculateNames {
	final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	private String textFileNames;
	
	public CalculateNames(String textFileNames) {
		this.textFileNames = textFileNames;
	}

	public long getTotal() {
		String[] namesArray = textFileNames.split(",");
		long entireScore = 0;
		int multiply = 1;

		Arrays.sort(namesArray);

		for (String getNameValue : namesArray) {
			String nameAfterQuotes = getNameValue.replaceAll("^\"+|\"+$", "");
			nameAfterQuotes = getNameValue.toUpperCase();
			/*
			 * getting the sum for each getNameValue 
			 */
			int values = nameValue(nameAfterQuotes);
			//System.out.println(nameAfterQuotes + "," + values + "," + multiply + "," + values * multiply);
			entireScore += values * multiply;
			multiply++;
			
		}
		return entireScore;
	}

	public int nameValue(String nameAfterQuotes) {
		int values = 0;
		for (int i = 0; i < nameAfterQuotes.length(); i++) {
			int alphabetValue = alphabet.indexOf(nameAfterQuotes.charAt(i)) + 1;
			values += (alphabetValue);
		}
		return values;
	}

}
