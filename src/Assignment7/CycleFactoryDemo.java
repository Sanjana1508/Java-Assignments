package Assignment7;

public class CycleFactoryDemo {

	public static void main(String[] args) {
		CycleFactory cf = new CycleFactory();
		ICycle uni = cf.factory("Unicycle");
		ICycle bi = cf.factory("Bicycle");
		ICycle tri = cf.factory("Tricycle");
		
	}
}
