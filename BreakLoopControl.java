package com.javaprogram.com;

public class BreakLoopControl {

	public static void main(String[] args) {
		
		outer:
			  for(int i = 0; i<3; i++) 
			  {
				  System.out.print("pass=> "+i);
				  for(int j=0;j<100;j++)
				  {
					  if(j==10)
						  break outer; // break label statement
					  System.out.print(j +" ");   //space between numbers
					  
				  }  
				  //System.out.println("This will not print");
			  }
		
		 System.out.println("loop complete");
	    }
 
	
}
