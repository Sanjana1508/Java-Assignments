package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment12 {

	public static void main(String[] args) {
		List<Student> st = new ArrayList<>();
		
		st.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
		st.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
		st.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
		st.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
		st.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
		st.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
		st.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
		st.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
		st.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
		st.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
		st.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
		st.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
		st.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
		st.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
		st.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
		st.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
		st.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
		
		st.stream().map(d -> d.getEngDepartment()).distinct().forEach(System.out::println);
		System.out.println();
		
		st.stream().filter(e -> e.getYearOfEnrollment()>2018).map(e ->e.getName()).forEach(System.out::println);
		System.out.println();
		
		List<Student> l = st.stream().filter(s -> s.getEngDepartment().equals("Computer Science"))
		.filter(s -> s.getGender().equals("Male"))
		.collect(Collectors.toList());
		for(Student s : l)
		System.out.println(s);
		System.out.println();
		
		Map<Object, List<Student>> h = st.stream().collect(Collectors.groupingBy(s -> s.getGender()));
		for(Object o : h.keySet())
			System.out.println(o+" "+h.get(o).size());
		System.out.println();
		
		double avg = st.stream().collect(Collectors.averagingDouble(s ->s.getAge()));
		System.out.println("Avg age = "+avg);
		System.out.println();
		
		Optional<Student> s=st.stream().max(Comparator.comparing(Student::getPerTillDate));
		System.out.println(s);
		System.out.println();
		
		Map<Object,List<Student>> stuDept = st.stream().collect(Collectors.groupingBy(e -> e.getEngDepartment()));
		for(Object o : stuDept.keySet())
			System.out.println(o+" "+stuDept.get(o).size());
		System.out.println();
		
		Map<String,Double> avgDept = st.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.averagingDouble(Student::getPerTillDate)));
		System.out.println(avgDept);
		System.out.println();
		
		Optional<Student> youngest = st.stream().filter(e -> e.getGender().equals("Male") && e.getEngDepartment().equals("Electronic")).min(Comparator.comparingInt(Student::getAge));
		System.out.println(youngest);
		System.out.println();
		
		Map<String,Long> count = st.stream().filter(e ->e.getEngDepartment().equals("Computer Science"))
				.collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));
		System.out.println(count);
	}
	

}
class Student{
	//id,name,age,gender,engDepartment,year of enrollment ,perTillDate
	private int id;
	private int age;
	private String name;
	private String gender;
	private String engDepartment;
	private int yearOfEnrollment;
	private double perTillDate;
	
	Student(int id,String name,int age,String gender,String engDepartment,int yearOfEnrollment,double perTillDate){
		this.id = id;
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.engDepartment = engDepartment;
		this.yearOfEnrollment = yearOfEnrollment;
		this.perTillDate = perTillDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEngDepartment() {
		return engDepartment;
	}

	public void setEngDepartment(String engDepartment) {
		this.engDepartment = engDepartment;
	}

	public int getYearOfEnrollment() {
		return yearOfEnrollment;
	}

	public void setYearOfEnrollment(int yearOfEnrollment) {
		this.yearOfEnrollment = yearOfEnrollment;
	}

	public double getPerTillDate() {
		return perTillDate;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + ", engDepartment="
				+ engDepartment + ", yearOfEnrollment=" + yearOfEnrollment + ", perTillDate=" + perTillDate + "]";
	}

	public void setPerTillDate(double perTillDate) {
		this.perTillDate = perTillDate;
	}
	
}
