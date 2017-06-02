package com.study.string;

public class String2 {
	public static void main(String[] args) {
		String s1 = "KANNADA";
		char[] c1 = s1.toCharArray();
		for(int i=0;i<c1.length;i++){
			for(int j=i+1;j<c1.length;j++){
				if(c1[i] == c1[j]){
					System.out.println(c1[i]);
				}else{
					break;
				}
			}
		}
	}

}
