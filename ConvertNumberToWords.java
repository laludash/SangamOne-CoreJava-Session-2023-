package FunWithProgramming;

import java.util.Scanner;

public class ConvertNumberToWords {

	public static void main(String[] args) {
	
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number"); 
		int n = sc1.nextInt();
		if(n<0 || n>99)
		{
			System.out.println(" Wrong Input");
		}
		else
		{
			int lastdigit = n%10; //3rd digit
			int lastdigit1 = n /10;
			int seconddigit = lastdigit1%10; // second 
			int thirddigit  = n/100; // 1st
			String[] unitNumber1 ={"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
			String[] teen = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
		            "Seventeen", "Eighteen", "Nineteen"};
			String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
			String hw = "Hundred";
			if(n<20)
			{
				System.out.println(unitNumber1[n]);
			}
			else if(n<100)
			{
				System.out.println(tens[seconddigit]+unitNumber1[lastdigit]);
			}
			else
			{
				System.out.println(unitNumber1[thirddigit]+hw+tens[seconddigit]+unitNumber1[lastdigit]);
			}
			
			
			
		}
		
		
		
		
		
		
		

	}

}
