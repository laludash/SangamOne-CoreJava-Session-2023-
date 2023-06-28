package com.javaprogram.com;

public class CalculatePercentage {

	public static void main(String[] args) {
		
		
	 //InterestRateCalculation(1000,5);
	 System.out.println("I-rate" +  InterestRateCalculation(1000,5));
	 System.out.println("I-rate " +  InterestRateCalculation(1000,2));
	 System.out.println("I-rate" +  InterestRateCalculation(1000,4));
	 System.out.println("I-rate" +  InterestRateCalculation(1000,6));
	 System.out.println("I-rate" +  InterestRateCalculation(1000,7));
		
		
		
	}

	public static double InterestRateCalculation(double value, double irate)
	{
		return (value * irate/100);
	}
	
}
