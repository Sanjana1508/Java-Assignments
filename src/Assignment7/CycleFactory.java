package Assignment7;

public class CycleFactory {
	public ICycle factory(String type) {
		ICycle obj;
		switch(type) {
		case "Unicycle":
			obj = new UniCycle();
			break;
		case "Bicycle":
			obj = new BiCycle();
			break;
		case "Tricycle":
			obj = new TriCycle();
			break;
		default : 
			throw new IllegalArgumentException("No valid type");
		}
		return obj;
	}
}
