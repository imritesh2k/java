package com.study.collection.usingMaps;

public class Student {
	private Integer sid;
	private String sname;
	private Double marks;
	
	public Student(Integer sid, String sname, Double marks) {
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	
	@Override
	public int hashCode() {
		int result = 15;
		result = result+sid.hashCode();
		result = result+sname.hashCode();
		result = result+marks.hashCode();
		return result;
	}
	
	public boolean equals(Object o){
		if(o instanceof Student && (((Student) o).sid.equals(sid) && ((Student) o).sname.equals(sname) && ((Student) o).marks.equals(marks))){
			return true;
		}else{
			
		}return false;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks
				+ "]";
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}
	
}
