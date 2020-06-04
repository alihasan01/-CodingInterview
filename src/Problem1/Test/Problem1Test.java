package Problem1.Test;

import Problem1.Source.Problem1;

public class Problem1Test {
	public static void main(String[] args)
	{
		Test1();
		Test2();
		Test3();
		Test4();
	}
	public static void Test1()
	{
		Problem1 obj = new Problem1();
		boolean actual = obj.IsUniqueOptimal("Ali");                           
		boolean expected =  true;
		System.out.println("Actual solution is : " + actual );
		System.out.println("Expected solution is : " + expected);
		if (actual == expected)
			System.out.println("Test case 1 : Passed");
		else
			System.out.println("Test case 1 : Failed");
	}
	public static void Test2()
	{
		Problem1 obj = new Problem1();
		boolean actual = obj.IsUniqueOptimal("Hasan");                           
		boolean expected =  false;
		System.out.println("Actual solution is : " + actual );
		System.out.println("Expected solution is : " + expected);
		if (actual == expected)
			System.out.println("Test case 2 : Passed");
		else
			System.out.println("Test case 2 : Failed");
	}
	public static void Test3()
	{
		Problem1 obj = new Problem1();
		boolean actual = obj.IsUniqueOptimal("");                           
		boolean expected =  true;
		System.out.println("Actual solution is : " + actual );
		System.out.println("Expected solution is : " + expected);
		if (actual == expected)
			System.out.println("Test case 3 : Passed");
		else
			System.out.println("Test case 3 : Failed");
	}
	public static void Test4()
	{
		Problem1 obj = new Problem1();
		boolean actual = obj.IsUniqueOptimal(null);                           
		boolean expected =  false;
		System.out.println("Actual solution is : " + actual );
		System.out.println("Expected solution is : " + expected);
		if (actual == expected)
			System.out.println("Test case 4 : Passed");
		else
			System.out.println("Test case 4 : Failed");
	}
}
