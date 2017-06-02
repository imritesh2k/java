package com.study.string;

import java.util.Arrays;

public class String1 {
	public static void main(String[] args) {
		String str = "KANNADA";
		String str1 = "DANANAK";
		char[] ch = str.toCharArray();
		char[] ch1 = str1.toCharArray();
		//System.out.println(ch);
		//System.out.println(ch1);
		Arrays.sort(ch);
		Arrays.sort(ch1);
		//System.out.println(ch);
		//System.out.println(ch1);
		String s1 = new String(ch);
		String s2 = new String(ch1);
		//System.out.println(s1);
		//System.out.println(s2);
		if(s1.equals(s2)){
			System.out.println("Both words are anagram with each other");
		}else{
			System.out.println("Both words are not anagram with each other");
		}

	}

}
