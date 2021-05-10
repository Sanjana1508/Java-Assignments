package Assignment6;

public class OverLoadedConstructerDemo {
	int a;
	int b;
	public OverLoadedConstructerDemo(int a) {
		this.a =a;
	}
	public OverLoadedConstructerDemo(int a,int b) {
		this(a);
		this.b = b;
	}
	public static void main(String[] args) {
		OverLoadedConstructerDemo oc = new OverLoadedConstructerDemo(1,2);
	}
}
