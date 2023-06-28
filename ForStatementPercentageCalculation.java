package com.javaprogram.com;

public class ForStatementPercentageCalculation {

	public static void main(String[] args) {
		
		calculationInterest();
		
	}

	public static void calculationInterest()
	{
		for( double amount =7.5; amount<10; amount+=0.25)
		{
			double interestAmount = calculationInterest(10000,amount);
			System.out.println("InterestAmount of 10000 " + "is " +interestAmount);
		}
			
		
		
	}
	
	public static double calculationInterest(double amount, double interestRate)
	{
		return (amount * (interestRate / 100));
	}
	
	
	
}
