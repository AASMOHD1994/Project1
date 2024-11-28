package com.qa.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProgramIndexes {

	public static void main(String[] args) {

		String[] s = { "This is good for rogrammer to work from ip 127.0.0.1.123 and get the marks 27.5 and 65",
				"This is good for rogrammer to work from ip 127.0.0.1.123 and get the marks 27.5 and 65",
				"This is good for rogrammer to work from ip 127.0.0.1.176 and get the marks 92 and 65.787",
				"This is good for rogrammer to work from ip 127.0.0.1.123 and get the marks 27.76 and 65",
				"This is good for rogrammer to work from ip 7.0.0.1.123 and get the marks 27.5 and 65.97",
				"This is good for rogrammer to work from ip 127.0.0.1.123 and get the marks 21 and 65" };

		StringProgramIndexes sp = new StringProgramIndexes();

		for (Double dd : sp.checkAnagrams(s)) {
			System.out.println(dd);
		}

	}

	public ArrayList<Double> checkAnagrams(String[] gg) {

		ArrayList<Double> dl = new ArrayList<Double>();
		for (String s : gg) {
			String k = "[0-9]+[.][0-9]+[.][0-9]+[.][0-9]+[.][0-9]+";

			Pattern mt = Pattern.compile(k);
			Matcher m = mt.matcher(s);
			String n = "";

			while (m.find()) {
				System.out.println(m.group());
				n = s.replace(m.group(), "");
			}

			Pattern p = Pattern.compile("[0-9]+[.]*[0-9]*");
			Matcher m2 = p.matcher(n);

			Double d = 0.0;
			while (m2.find()) {
				d = d + Double.parseDouble(m2.group());
			}

			dl.add(d);
		}	return dl;

	}

}
