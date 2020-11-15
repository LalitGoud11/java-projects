package com.occ.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Appliction {

	public static void main(String[] args) throws CustomException, IOException {
		BufferedReader bufferReader = null;
		try {
		    if (args.length > 0) {
			FileReader filePath = new FileReader(args[0]);
			bufferReader = new BufferedReader(filePath);
			} else {
			 throw new CustomException("Pass path as command line arguments.");
			}
			String namesList = bufferReader.readLine();
			CalculateNames totalScore = new CalculateNames(namesList);
			System.out.println("Total score for entire file: " + totalScore.getTotal());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (bufferReader != null) {
				bufferReader.close();
			}
		}
	}
}
