package com.study.string;

import java.util.HashMap;
import java.util.Map;

public class RepeatedWord {
	public static void main(String[] args) {
		String s = "dog is an animal and dog runs very as fast as possible";
		Map<String,Integer> m = new HashMap<String,Integer>();
		for(String s1 : s.split(" ")){
			if(m.containsKey(s1)){
				int count = m.get(s1);
				m.put(s1, ++count);
			}else{
				m.put(s1, 1);
			}
		}
		System.out.println(m);
	}
}
