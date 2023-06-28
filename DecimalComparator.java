package com.javaprogram.com;

public class DecimalComparator {

	public static void main(String[] args) {
		
		//areEqualByThreeDecimal(-3.123, 3.123);
		System.out.println(areEqualByThreeDecimal(32345.123, 3.123));

	}
	
	public static boolean areEqualByThreeDecimal( double number1, double number2)
	{
		
		double num1 = number1 * 1000;
		double num2 = number2 * 1000;
		if(num1 == num2)
		{
			
			return true;
			
		}
		else
		{
		
		return false;
		}
		
	}

}
