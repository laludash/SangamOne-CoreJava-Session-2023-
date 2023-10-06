package com.javaprogram.com;

public class LoanCalculation {

	public static void main(String[] args) {
		String name1 = "James";
		String name2  = "Peter";
		String name3  = "Susan"; 
		
		int loan1 = 10000;
		int interestRate1 = 8;
		int year1 = 3;

		int loan2  = 8000;
		int interestRate2 = 7; 
		int  year2 = 2;
		
		int loan3 = 5000;   // principal 
		int interestRate3 = 6;
		int year3 = (int) 1.5;
		
		int interest4 = loan1 * interestRate1 * year1/100;
		int interest5 = loan2 * interestRate2 * year2 /100;
		int interest6  = loan3 * interestRate3 * year3 / 100;
		int total = interest4 + interest5 + interest6; 
		int totalpayble1  = loan1 +total;
		int totalpayble2 = loan2 + total;
		int totalpayble3 = loan3 + total;
		int EMIPerMonth1  = totalpayble1/(year1 * 12);
		int EMIPerMonth2 = totalpayble2 /(year2 * 12);
		int EMIperMonth3  = totalpayble3 /(year3 * 12);
		
		
		System.out.println("-------Loan Amount Calculation Of Silicon Valley Bank--------"); 
		System.out.println("name1 - > "+name1+" - >interest4 ->"+interest4+ " ->name2 ->"+name2 + "->interest5 ->" +interest5+ "->name3->"+name3+"->interest6 ->" + interest6 +" -> TotalPayable ->"+ 
				totalpayble1 +"->TotalPayable ->" +totalpayble2+ "->totalpayble3 ->"+ totalpayble3);
		System.out.println("EMI per Month is --"+name1+" : "+EMIPerMonth1+"\n");
		System.out.println("EMI per Month is --"+name2+" : "+EMIPerMonth2+"\n");
		System.out.println("EMI per Month is --"+name3+" : "+EMIperMonth3+"\n");
		
		

	}

}
