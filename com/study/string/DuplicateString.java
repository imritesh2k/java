package com.study.string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateString {
	public static void main(String[] args) {
		String s = "my name is ritesh kumar";
		Map<Character,Integer> m = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(m.containsKey(c)){
				int count = m.get(c);
				m.put(c,++count);
			}else{
				m.put(c,1);
			}
		}
		System.out.println(m);
	}
}
