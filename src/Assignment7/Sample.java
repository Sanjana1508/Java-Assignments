package Assignment7;

public class Sample  extends ParentSample implements InterfaceFour{

	@Override
	public void methodIOne1() {
		System.out.println("methodIOne1 of InterfaceOne");
		
	}

	@Override
	public void methodIOne2() {
		System.out.println("methodIOne2 of InterfaceOne");
		
	}

	@Override
	public void methodITwo1() {
		System.out.println("methodITwo1 of InterfaceTwo");
		
	}

	@Override
	public void methodITwo2() {
		System.out.println("methodITwo2 of InterfaceTwo");
		
	}

	@Override
	public void methodIThree1() {
		System.out.println("methodIThree1 of InterfaceThree");
		
	}

	@Override
	public void methodIThree2() {
		System.out.println("methodIThree2 of InterfaceThree");
		
	}

	@Override
	public void newMethod() {
		System.out.println("newMethod of InterfaceFour");
		
	}
	public void m1(InterfaceOne iOne) {
		System.out.println("In m1()");
	}
	public void m2(InterfaceTwo iTwo) {
		System.out.println("In m2()");
		
	}
	public void m3(InterfaceThree iThree) {
		System.out.println("In m3()");
	}
	public void m4(InterfaceFour iFour) {
		System.out.println("In m4()");
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.m1(s);
		s.m2(s);
		s.m3(s);
		s.m4(s);
		
	}
}

class ParentSample{
	ParentSample(){
		System.out.println("In ParentSample Constructor");
	}
}
