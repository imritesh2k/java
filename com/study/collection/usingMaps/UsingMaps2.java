package com.study.collection.usingMaps;

import java.util.HashMap;
import java.util.Map;

public class UsingMaps2 {
	public static void main(String[] args) {
		Map<Student,Double> m = new HashMap<Student,Double>();
		Student s1 = new Student(101, "Ritesh", 69.58);
		Student s2 = new Student(101, "Ritesh", 69.58);
		Student s3 = new Student(103, "Shyam", 87.85);
		m.put(s1, s1.getMarks());
		m.put(s2, s2.getMarks());
		m.put(s3, s3.getMarks());
		
		System.out.println(m);
		
		

	}

}


