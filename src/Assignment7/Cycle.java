package Assignment7;

public class Cycle {

	public void balance() {
		System.out.println("In Cycle balance method");
	}
	public static void main(String[] args) {
		Cycle cy[] = new Cycle[3];
		cy[0]=(Cycle)new Unicycle();
		cy[1]=(Cycle)new Bicycle();
		cy[2]=(Cycle)new Tricycle();
		for(int i=0;i<3;i++)
			cy[i].balance();
		System.out.println();
		cy[0]=new Unicycle();
		cy[1]=new Bicycle();
		cy[2]=new Tricycle();
		for(int i=0;i<3;i++)
			cy[i].balance();
	}
}

class Unicycle extends Cycle{
	
	public void balance() {
		System.out.println("In Unicycle balance method");
	}
}

class Bicycle extends Cycle{
	public void balance() {
		System.out.println("In Bicycle balance method");
	}
}

class Tricycle extends Cycle{
	
}
