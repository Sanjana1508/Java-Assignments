package Assignment6;

public class ConstructerDemo {
	
	public ConstructerDemo(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
	ConstructerDemo arr[];
	ConstructerDemo cd = new ConstructerDemo("Hello");
	ConstructerDemo cd2 = new ConstructerDemo("World");
	arr =new ConstructerDemo[2];
	arr[0]=cd;
	arr[1]=cd2;
	}

}
