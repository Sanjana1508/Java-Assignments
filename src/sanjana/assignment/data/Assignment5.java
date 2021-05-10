package sanjana.assignment.data;

public class Assignment5 {

	public static void main(String[] args) {
		Assignment5Class1 assign = new Assignment5Class1();
		assign.print();
		assign.method();
		Assignment5Class2 assign2 = Assignment5Class2.getInstance("Hello");
		assign2.print();
	}

}
