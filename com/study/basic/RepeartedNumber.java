package com.study.basic;

import java.util.HashMap;
import java.util.Map;

public class RepeartedNumber {
	public static void main(String[] args) {
		int a[] = {10,5,8,21,10,5,6,9,15,2,5,8,2,1,9,15};
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		for(Integer i : a){
			if(m.get(i)!= null){
				int count = m.get(i);
				m.put(i, ++count);
				
			}else{
				m.put(i, 1);
			}
		}
		System.out.println(m);
	}

}
