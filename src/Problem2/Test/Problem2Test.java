package Problem2.Test;

import Problem2.Source.Problem2;

public class Problem2Test {

	public static void main(String[] args)
	{
		Problem2Test caller = new Problem2Test();
		caller.Test1();
		caller.Test2();
		caller.Test3();
		caller.Test4();
		caller.Test5();
		caller.Test6();
	}
	public boolean Test1()
	{
		Problem2 obj = new Problem2();
		boolean expected =  true;
		boolean actual = obj.permutation("hello", "hello");
		System.out.println("Actual solution is : " + actual );
		System.out.println("Expected solution is : " + expected);
		if (actual == expected)
			System.out.println("Test case 1 : Passed");
		else
			System.out.println("Test case 1 : Failed");
		System.out.println();
		return false;
		
	}
	public boolean Test2()
	{
		Problem2 obj = new Problem2();
		boolean expected =  false;
		boolean actual = obj.permutation("hellow", "hello");
		System.out.println("Actual solution is : " + actual );
		System.out.println("Expected solution is : " + expected);
		if (actual == expected)
			System.out.println("Test case 2 : Passed");
		else
			System.out.println("Test case 2 : Failed");
		System.out.println();
		return false;
		
	}
	public boolean Test3()
	{
		Problem2 obj = new Problem2();
		boolean expected =  true;
		boolean actual = obj.permutation("olleh", "hello");
		System.out.println("Actual solution is : " + actual );
		System.out.println("Expected solution is : " + expected);
		if (actual == expected)
			System.out.println("Test case 3 : Passed");
		else
			System.out.println("Test case 3 : Failed");
		System.out.println();
		return false;
		
	}
	public boolean Test4()
	{
		Problem2 obj = new Problem2();
		boolean expected =  false;
		boolean actual = obj.permutation("", "hello");
		System.out.println("Actual solution is : " + actual );
		System.out.println("Expected solution is : " + expected);
		if (actual == expected)
			System.out.println("Test case 4 : Passed");
		else
			System.out.println("Test case 4 : Failed");
		System.out.println();
		return false;
		
	}
	public boolean Test5()
	{
		Problem2 obj = new Problem2();
		boolean expected =  true;
		boolean actual = obj.permutation("", "");
		System.out.println("Actual solution is : " + actual );
		System.out.println("Expected solution is : " + expected);
		if (actual == expected)
			System.out.println("Test case 5 : Passed");
		else
			System.out.println("Test case 5 : Failed");
		System.out.println();
		return false;
		
	}
	public boolean Test6()
	{
		Problem2 obj = new Problem2();
		boolean expected =  false;
		boolean actual = obj.permutation(null, "");
		System.out.println("Actual solution is : " + actual );
		System.out.println("Expected solution is : " + expected);
		if (actual == expected)
			System.out.println("Test case 6 : You have enterd null, passed.");
		else
			System.out.println("Test case 6 : Failed");
		System.out.println();
		return false;
		
	}
}
