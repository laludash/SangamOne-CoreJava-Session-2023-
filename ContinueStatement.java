package com.javaprogram.com;

public class ContinueStatement {

	public static void main(String[] args) {
		
		Outer: 
			for(int i=0;i<10;i++)
			{
				
				for(int j=0;j<10;j++)
				{
					if(j>i)
					{
						System.out.println(); // this for next line
						continue Outer;  
						
					}
					System.out.print(" "+(i*j));	
			}
		}

		System.out.println();
	}

}
