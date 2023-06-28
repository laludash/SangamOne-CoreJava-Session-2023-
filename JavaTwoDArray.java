package com.javaprogram.com;

public class JavaTwoDArray {

	public static void main(String[] args) {
		
		int[][] array = new int[4][5];
		
		int i, j, k = 0;
		
		for(i=0;i<4;i++)  //--> outer for loop
			for(j=0;j<5;j++)  // -> inside for loop
			{
				array[i][j] = k;
				k++;
			}
		
		for(i=0; i<4; i++)
		{	
			for(j=0; j<5; j++)
				System.out.println(array[i][j] +" ");
			   
				System.out.println("\t");
		
		}
		
	}

}
