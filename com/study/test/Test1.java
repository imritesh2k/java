package com.study.test;

public class Test1 {
	public static void main(String[] args) {
		/*String s1 = "xyz";
		String s2 = new String("xyz");
		System.out.println(s1==s2);
		s2.intern();
		System.out.println(s1==s2);*/
		
		//sum(10,20);
		
		int i=0;
		while(true){
			if(i++==4){
				break;
			}
			++i;
		}
		System.out.println(i++);
	}

	/*static void sum(long i, long j) {
		System.out.println("L");
	}
	
	static void sum(float i, float j) {
		System.out.println("F");
	}*/

}
