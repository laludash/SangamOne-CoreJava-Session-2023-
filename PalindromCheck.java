package com.javaprogram.com;

public class PalindromCheck {

	public static void main(String[] args) {
		
		
		// call the palindrome number without create the object of the class
	    
	    // I am goinf to check the palindrome number  like 121, 12321
		System.out.println(isPalindrome(12321));
		System.out.println(isPalindrome(1001));
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(12345));
		System.out.println(isPalindrome(54321));
		

	}

	public static boolean isPalindrome(int number)
	{
		int reverse = 0;
		int orinum =  number; 
		while(number != 0)
		{
			int Digit = number % 10;
		    reverse = (reverse * 10) + Digit;
			number /= 10; 
		}
		return orinum == reverse;  // palindrom number 121 == 121 (true)
	}
	
}
