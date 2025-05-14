package javaBasics;

public class Palindrome {

	public static void main(String[] args) 
	
	{
		 String input = "Madam";
		 char[] a = input.toCharArray();
		 String output = "";
		 int length = input.length();
		 
		 for (int i= length-1; i>=0; i--)
		 {
			 output = output + a[i];
			 		 }
		 System.out.println(output);
		 if (input.equalsIgnoreCase(output))
		 {
			 System.out.println("Palindrome");
		 }
		 else
		 {
			 System.out.println("not palindrome");
		 }

	}

}
