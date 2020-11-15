package com.springTesting.DemoSpringProjectLearning.testing;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MathUtils {
	
	private DecimalFormat df2 = new DecimalFormat("#.##");
	
	public int add(int a , int b) {
		return a+b;			
	}
	
	public int divide(int a, int b) throws Exception{
		return a/b;
	}
	
	public double areaOfCircle(int radius) {
		double area =  Math.PI*radius*radius;
		df2.setRoundingMode(RoundingMode.DOWN);
		return  Double.valueOf(df2.format(area));
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public int subtract (int a, int b) {
		return a-b;
	}
}
