package Problem3.Source;

import java.util.Scanner;

import Problem2.Source.Problem2;

public class Problem3ReplaceSpaces {
	
	public char[] ReplaceSpaces(String strtoReplace) {
		
		int acc = 0 , counter = 0;
		char a[] = strtoReplace.toCharArray();
		for (int i= 0 ; i < a.length ; i++)
		{
			if (a[i] == ' ')
				counter++;
		}
		char b[] = new char[strtoReplace.length() + counter*2]; // New array to handle the spaces
		
		for (int i = 0 ; i < b.length  ; i++)
		{
			if (a[acc] == ' ')
			{
				b[i] = '%';
				b[i+1] = '2';
				b[i+2] = '0';
				i = i+2; 
				acc++;
			}
			else
			{
				b[i] = a[acc];
				acc++;
			}
		}
		System.out.println(b);
		return b;
		
	}
	
	public static void main(String []args) {
		
		String firstString = "";
		System.out.println("Enter first String ");                    //Taking first string Input from user
		Scanner sc = new Scanner(System.in);
		firstString = sc.nextLine();
		
		
		
		Problem3ReplaceSpaces object = new Problem3ReplaceSpaces(); 
		char [] answer = object.ReplaceSpaces(firstString);
		
		
//		if (answer == true ) {
//			System.out.println("Firsr string " + firstString  + "  is permutation to other "  +secondString);
//		}else{
//			System.out.println("Firsr string " + firstString  + "  is not permutation to other "  +secondString);
//		}
	}
}
