package com.javaprogram.com;

public class InheritCodeOne {

   int i,j; 
	void showij()
	{
		System.out.println("I and J" +i+" " +j);
	}
		
 class B extends InheritCodeOne
 {
	 
	 int k; 
	 
	 void showk()
	 {
		 System.out.println((i+j+k));
	 }
	 
	 
	 void showij()
		{
			System.out.println("I and J" +i+" I " +j+ " J " +k+ "K");
		}
 }
	
}
