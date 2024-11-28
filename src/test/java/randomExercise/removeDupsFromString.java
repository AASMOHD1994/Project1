package randomExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.google.common.collect.Multiset.Entry;

public class removeDupsFromString {

	public static void main(String[] args) {
		
		String s="i love programming";
		
		char [] arr = s.toCharArray();
	

		HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
		
		hm.put('a', 1);
		hm.put('b', 4);
		hm.put('c', 1);
		hm.put('d', 89);
		hm.put('e', 72);
		hm.put('f', 4);
		hm.put('g', 1);
		
		List<Integer> al = new ArrayList<Integer>(hm.values());
		Collections.sort(al); // if no dups
//
//		int len=0;   // if dups
//		for(int i: hm.values())
//		{
//			if(i!=Collections.max(hm.values()))
//			 len= Math.max(len, i);
//		}
//		
//		final int lenn=len;
		
		hm.values().removeIf(valued-> valued==al.get(al.size()-1));// removig highest element

		
		System.out.println(hm);
		
		
		

	}

}
