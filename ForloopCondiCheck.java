package com.javaprogram.com;

public class ForloopCondiCheck {

	public static void main(String[] args) {
	
		int j = 1; 
		boolean isReady  = false; 
		do
		{
			if(j>10)
			{
				break; 
			}
			System.out.println(j);
			isReady = ( j > 0);
			j--;				
			
		}while(isReady);
		
		
		
	}

}
