package Assignment7;

import Assignment7.Class1.InnerClass1;

public class Class1 {

	class InnerClass1{
		int a;
		
		InnerClass1(int a){
			this.a = a;
		}
		
		public void fun() {
			System.out.println("Inside InnerClass1 fun()");
		}
	}
}
class Class2{
	
	class InnerClass2 extends InnerClass1{

		InnerClass2(Class1 class1, int a) {
			class1.super(a);
		}
	}
}