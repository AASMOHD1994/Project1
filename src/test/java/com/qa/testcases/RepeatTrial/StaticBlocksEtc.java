package com.qa.testcases.RepeatTrial;

public class StaticBlocksEtc {
	
	static int a=10;
	int b=20;
	
	static
	{
		a=100;
	}
	
	public static void main(String [] args)
	{
		
		StaticBlocksEtc obj =new StaticBlocksEtc();
		StaticBlocksEtc obj2 = new StaticBlocksEtc();
		System.out.println(a);
		obj.a=50;
		obj2.b=30;
		
		System.out.println(a);
		System.out.println(obj.b);
		System.out.println(obj2.b);
		System.out.println();
		System.out.println(obj.a);
		System.out.println(obj2.a);
		obj2.a=30;
		System.out.println();
		System.out.println(obj.a);
		System.out.println(obj2.a);
	}

}
