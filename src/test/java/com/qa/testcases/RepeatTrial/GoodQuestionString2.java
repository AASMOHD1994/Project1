package com.qa.testcases.RepeatTrial;

public class GoodQuestionString2 {

	public static void main(String[] args) {

		// abc de f   i/p
		// fed cb a   o/p

		String s = "abc de f";
		String[] arr = s.split(" ");

		String n = s.replaceAll(" ", "");
		int strLen = n.length();
		String gg = "";
		
		for (String k : arr) {

			for (int i = 0; i < k.length(); i++) {
				// System.out.print("*");
				gg = gg + n.charAt(strLen - 1);
				strLen--;

			}

			gg = gg + " ";

		}

		System.out.print(gg.trim());

	}

}
