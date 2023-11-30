package FunWithProgramming;

import java.util.Scanner;

public class NumberToWordCode {

	private static final String[] units = {
			   "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
	            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
			
	};
	
	
	private static final String[] tens = {
			"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
	};
	
	
	private static String convert(long number) {
        if (number == 0) {
            return "Zero";
        }

        if (number < 0 || number > 10000000000L) {
            return "Number out of range";
        }

        String result = "";
        String[] suffixes = {"", "Thousand"};
//"Million", "Billion"
        int index = 0;
        while (number > 0) {
            if (number % 1000 != 0) {
                result = convertLessThanThousand((int) (number % 1000)) + suffixes[index] + " " + result;
            }
            number /= 1000;
            index++;
        }

        return result.trim();
    }

	private static String convertLessThanThousand(int number) {
		
		if(number ==  0)
		{
			return "";
		}
		if(number < 20 )
		{
			return units[number];
		}
		if(number < 100)
		{
			return tens[number / 10] + ((number % 10 != 0) ? " " + units[number % 10] : "");
		}
		
		return units[number / 100] + " Hundred" + ((number % 100 != 0) ? " and " + convertLessThanThousand(number % 100) : "");
	}

	public static void main(String[] args) {
		
		
		Scanner sc2  = new Scanner(System.in);
		System.out.println("Enter a number ");
		if(sc2.hasNextLong())
		{
			long number = sc2.nextLong();
			String result = convert(number);
			System.out.println("In word -> "+result);
			
		}
		else
		{
			System.out.println("Invalid Number");
		}
				

	}

}
