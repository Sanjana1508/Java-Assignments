package Assignment7;

public abstract class Rodent {
	Rodent(){
		System.out.println("Rodent Constructor");
	}
	public void eat() {
		System.out.println("In base class: Rodent eat");
	}
	
	public void run() {
		System.out.println("In base class: Rodent run");
	}
	public abstract boolean liveOnGround();
	public abstract boolean useInLab();
	
	public static void main(String[] args) {
		Rodent r[] = new Rodent[3];
		Rodent m = new Mouse();
		Rodent g = new Gerbil();
		Rodent h = new Hamster();
		r[0]=m;
		r[1]=g;
		r[2]=h;
		for(int i=0;i<3;i++) {
		r[i].eat();
		r[i].run();
		}
	}
}

class Mouse extends Rodent{
	Mouse(){
		System.out.println("Mouse Constructor");
	}
	public void eat() {
		System.out.println("In child class : Mouse eat");
	}
	public void run() {
		System.out.println("In child class: Mouse run");
	}
	public boolean liveOnGround() {
		return true;
	}
	public boolean useInLab() {
		return true;
	}
}

class Gerbil extends Rodent{
	Gerbil(){
		System.out.println("Gerbil Constructor");
	}
	public void eat() {
		System.out.println("In child class : Gerbil eat");
	}
	public void run() {
		System.out.println("In child class: Gerbil run");
	}
	public boolean liveOnGround() {
		return false;
	}
	public boolean useInLab() {
		return true;
	}
}

class Hamster extends Rodent{
	Hamster(){
		System.out.println("Hamster Constructor");
	}
	public void eat() {
		System.out.println("In child class : Hamster eat");
	}
	public void run() {
		System.out.println("In child class: Hamster run");
	}
	public boolean liveOnGround() {
		return true;
	}
	public boolean useInLab() {
		return false;
	}
}