package com.qa.pages;

import java.util.HashMap;

public class Inter {

	public static void main(String[] args) {
		String s= "Welcome to Automation";
	      s=s.replace(" ","");
	      char [] arr = s.toCharArray();
	      HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	      
	      for(Character c: arr)
	      {
	    	  if(Character.isLowerCase(c))
	    	  {
	    		  c=Character.toUpperCase(c);
	    	  }
	       
	              if(hm.containsKey(c))
	          {
	              hm.put(c,hm.get(c)+1);
	          }
	          else
	          {
	              hm.put(c,1);
	          }
	          
	          
	          
	      }
	      System.out.print(hm);

	}

}
