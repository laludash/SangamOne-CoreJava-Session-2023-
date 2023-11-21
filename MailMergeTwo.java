package com.javaprogram.com;

public class MailMergeTwo {

	public static void main(String[] args) {
	
   String str = "Dear $1salutation $2name ,You are kindly requested to make a payment of $3amount by $4date";
 
   String str3=str;
   String str2 = str;
   String str4 = str;
   str = str.replace("$1salutation", "Mr.");
  str = str.replace("$2name", "James");
  str = str.replace("$3amount", "Rs 1000");
  str = str.replace("$4date", "01-Dec-2024").concat("(M)");
  System.out.println(str);
  str2 = str2.replace("$1salutation", "Ms.");
  str2 = str2.replace("$2name", "Swati");
  str2 = str2.replace("$3amount", "Rs 2000");
  str2 = str2.replace("$4date", "01-Dec-2024").concat("(F)");
  System.out.println(str2);
  str3 = str3.replace("$1salutation", "Mr.");
  str3 = str3.replace("$2name", "Khan");
  str3 = str3.replace("$3amount", "Rs 3000");
  str3 = str3.replace("$4date", "03-Dec-2024").concat("(M)");
  System.out.println(str3);
  str4 = str4.replace("$1salutation", "Ms.");
  str4 = str4.replace("$2name", "Asha");
  str4 = str4.replace("$3amount", "Rs 4000");
  str4 = str4.replace("$4date", "03-Dec-2024").concat("(F)");
  System.out.println(str4);
	}

}
