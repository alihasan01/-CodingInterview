package Problem2.Source;

import java.util.Scanner;

import Problem1.Source.Problem1;

public class Problem2 {
	
	//Time complexity Linear O(n)
	//Space complexity constant
	
	public static boolean permutation(String str1 , String str2)
	{
		if (str1 == null || str2 == null ) {
			return false;
		}
			
		if (str1.length() != str2.length())
			return false;
		int []letters = new int[128];
		char []charArray = str1.toCharArray();
		for (char ch : charArray)
		{
			letters[ch]++;
		}	
		for(int i = 0 ;  i < str2.length() ; i++ )
		{
			char ch = str2.charAt(i);
			letters[ch]--;
			if (letters[ch] < 0)
				return false;
		}
		return true;
		
	}
	
	//Time complexity is quadratic O(n^2)

	
	public boolean CheckPermutation(String firstString , String  secondString) {
		
		if (firstString.length() !=  secondString.length())
			return false;
		char[] a = firstString.toCharArray();
		char[] b = secondString.toCharArray();		
		for (int i = 0 ; i < firstString.length() ; i++) //These two loops are for sorting purpose
		{										  //We can use Java library function "sort" to to sort the array. 	
			char ch = a[i];
			int index = i;
			for (int j = i+1 ; j < firstString.length() ; j++ )
			{
				if (ch < a[j])
				{
					ch = a[j];
					index = j;
				}
			}
			char tmp = a[i];
			a[i] = ch;
			a[index] = tmp;
			
		}
		for (int i = 0 ; i < secondString.length() ; i++)
		{
			char ch = b[i];
			int index = i;
			for (int j = i+1 ; j < secondString.length() ; j++ )
			{
				if (ch < b[j])
				{
					ch = b[j];
					index = j;
				}
			}
			char tmp = b[i];
			b[i] = ch;
			b[index] = tmp;
			
		}
		boolean checking = true;
		for (int i = 0 ; i < a.length ; i++)
		{
			if (a[i] != b[i])
			{
				checking = false;
				break;
			}
		}
		if (checking)
			return true;
		else
			return false;
		
		
	}
	
	public static void main(String []args) {
		
		String firstString = "" , secondString = "";
		System.out.println("Enter first String ");                    //Taking first string Input from user
		Scanner sc = new Scanner(System.in);
		firstString = sc.nextLine();
		
		System.out.println("Enter first String ");                    //Taking first string Input from user
		secondString = sc.nextLine();
		
		
		Problem2 object = new Problem2(); 
		boolean answer = object.CheckPermutation(firstString, secondString);
		
		
		if (answer == true ) {
			System.out.println("Firsr string " + firstString  + "  is permutation to other "  +secondString);
		}else{
			System.out.println("Firsr string " + firstString  + "  is not permutation to other "  +secondString);
		}
	}

}
