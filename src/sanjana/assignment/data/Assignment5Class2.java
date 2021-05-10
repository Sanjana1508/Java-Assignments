package sanjana.assignment.data;

public class Assignment5Class2 {
	String s;
	static Assignment5Class2 getInstance(String s) {
		//this.s = s;
		//Cannot instantiate non static variable in a static method.Static method uses static variables.
		Assignment5Class2 assign = new Assignment5Class2();
		return assign;
	}
	void print() {
		System.out.println(s);
	}
}
