package Package2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import Package1.ModifiersCheck;

public class P3 extends ModifiersCheck  {
	
	public static void main(String[] args)
	{
		P3 m = new P3();
		System.out.println(m.a);
		System.out.println(m.b); // special note:
		//System.out.println(m.c);
	//	System.out.println(m.d);
		
		
		ModifiersCheck mc = new ModifiersCheck();
//		System.out.println(mc.a);
//		System.out.println(mc.b); 
//		System.out.println(mc.c);
//		System.out.println(mc.d);
		
	// if i use Parent reference then i won't be able to access protected in child class in outside package
	}

	
	
}


