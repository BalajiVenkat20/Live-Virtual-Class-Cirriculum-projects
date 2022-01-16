package com.balaji.myAssignments;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidationOfEmail {
	public static boolean isaValidEmail(String email) {
		   String regex = "^(.+)@(.+)$";
		 //initialize the Pattern object
	       Pattern pattern = Pattern.compile(regex);
	       Matcher matcher = pattern.matcher(email);
	       return matcher.matches();
	   }

	   public static void main(String[] args) {
		   List<String> emails = new ArrayList<String>();
	       // valid email addresses
	       emails.add("balaji@myapps.com");
	       emails.add("balajiven@myapps.com");
	       emails.add("balaji@myapps.me.org");
	       //invalid email addresses
	       emails.add("ramani.myapps.com");
	       emails.add("nimi.myapps.com");
	       emails.add("rohit.myapps.com");


	       for (String value : emails) {
	           System.out.println("The Email address " + value + " is " + (isaValidEmail(value) ? "valid" : "invalid"));
	       }
	       
	       System.out.println("Enter any email address to check");
	       try (Scanner scan = new Scanner(System.in)) {
			String input = scan.nextLine();
			   System.out.println("The Email address " + input + " is " + (isaValidEmail(input) ? "valid" : "invalid"));
		}
	       
	   }
	   
}
	


