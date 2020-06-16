package Problem5.Source;

import java.util.Scanner;

public class Question5_OneAway {
	
	public boolean insertRemove(String string1, String string2) {
		
		int count = 0 , count1 = 0;
		
		while (count <  string1.length() && count1 < string2.length()) {
			
			if (string1.charAt(count) != string2.charAt(count1)) {
				
				if (count != count1)
				{
					return false;
				}
				count1++;
			}
			else {
				count++;
				count1++;
			}
		}
		
		return true;
	}
	public boolean oneReplace(String string1, String string2){
		
		int i = 0;
		boolean oneEdit = false;
		while(i  < string1.length()) {
			
			if (string1.charAt(i) != string2.charAt(i)) {
				
				if (oneEdit) {
					
					return false;
				}
				oneEdit = true;
				
			}
			i++;
		}
		return true;
	}
	
	public boolean oneAway(String string1, String string2) {
		
		if(string1 == null || string2 == null) {
			return false;
		}
		else if (string1.equals(string2)) {
			return true;
		}
		else if (string1.length() == string2.length()) {
			return oneReplace(string1 , string2);
		}
		else if (string1.length() + 1 == string2.length() ) {
			return insertRemove(string1 , string2);
		}
		else if(string1.length() - 1 == string2.length()) {
			return insertRemove(string2 , string1);
		}
		
		
		return false;
	}
	
	public static void main(String args[]) {
		
		
		String string1 = "" , string2 = "";
		System.out.println("Enter first string : ");
		Scanner sc = new Scanner(System.in);
		string1 = sc.nextLine();
		
		System.out.println("Enter second string : ");
		string2 = sc.nextLine();
		
		Question5_OneAway object = new Question5_OneAway();
		
		boolean answer = object.oneAway(string1 , string2);
		
		if (answer) {
			
			System.out.println("True, strings are one edit away");
			
		}
		else
		{
			System.out.println("False, strings are not one edit away");
		}
		
		
		
		
	}

}
