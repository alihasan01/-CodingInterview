package Problem1.Source;

import java.util.Scanner;

public class Problem1 {

	public static boolean IsUniqueOptimal(String str)                //This solution is better and actual solution because having linear time complexity and constant space complexity.
	{
		if (str == null) {
			return false;
		}
		if (str.length() > 128 )  //If string has more than 128 characters then it must have repetition because in ASCII we have not more than 128 characters.
			return false;
		boolean charArray[] = new boolean[128]; 
		for (int i = 0 ; i < str.length() ; i++)
		{
			int val = str.charAt(i);
			if(charArray[val])        //Condition to check if character already present then return false.
			{
				return false;
			}
			charArray[val] = true;
		}
		return true;
	}
	
	public boolean isUnique(String str) {
		
		boolean unique =  true;
		int stringLength = str.length();
		for (int i = 0 ;  i < stringLength && unique ; i++ ) {
			char ch = str.charAt(i);
			for(int  j = 0 ; j < stringLength ; j++) {
				if (ch == str.charAt(j) && i != j ) {         // if any same character found again in string then make flag false and break the loop  
					unique = false;
					break;
				}
			}	
		}
		return unique;
	}
	public static void main(String args[]) {

		String str;
		System.out.println("Enter String ");                    //Taking string Input from user
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		Problem1 object = new Problem1(); 
		boolean check  = Problem1.IsUniqueOptimal(str);
		
		if (check == true) {
			System.out.println("String " + str + " has all unique characters. ");
		}
		else {
			System.out.println("String \"" + str + "\" has not all unique characters. ");
		}
	}
}
