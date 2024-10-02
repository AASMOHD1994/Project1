package com.qa.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TopTwoFrequentElements {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 6, 6, 6, 7, 5, 1, 1, 1, 1 };
		HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
		hm = findTopTwo(arr);
		int sec = findTheSecondLargest(hm);
		hm.remove(sec);
		findTheSecondLargest(hm);

	}

	public static HashMap<Integer, Integer> findTopTwo(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (Integer k : arr) {
			if (hm.containsKey(k)) {
				hm.put(k, hm.get(k) + 1);
			}

			else {
				hm.put(k, 1);
			}
		}

		return hm;

	}

	public static int findTheSecondLargest(HashMap<Integer, Integer> hm) {

		int max = Collections.max(hm.values());

		for (Map.Entry<Integer, Integer> en : hm.entrySet()) {

			if (max == en.getValue()) {
				System.out.println("Key is " + en.getKey() + " , and value is " + en.getValue());
				return en.getKey();
			}

		}

		return max;

	}

}
