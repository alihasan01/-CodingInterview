package Problem6.Source;

import java.util.Scanner;

public class Question6_StringCompression {
	
	public String StringCompression(String str1){
		
		if (str1 == null)
			return "";
		int count = 0;
		StringBuilder builder = new StringBuilder(); //String builder is used instead of string concatenation because string concatenation take extra time. 
		for (int i = 0 ; i < str1.length()  ; i++)
		{
			count++;
			if (i+1 >= str1.length() || str1.charAt(i) != str1.charAt(i + 1 ) )
			{
				builder.append(str1.charAt(i));
				builder.append(count);
				count = 0;
			}
		}
		System.out.print(builder);
		if (builder.length() >= str1.length())
			return str1;
		return builder.toString();
		
	}
	public static void main(String args[]) {
		
		String string1 = "";
		System.out.println("Enter string : ");
		Scanner sc = new Scanner(System.in);
		string1 = sc.nextLine();
		
		Question6_StringCompression obj = new Question6_StringCompression();
		obj.StringCompression(string1);
		
	}

}
