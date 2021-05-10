package Assignment8;

public class ExceptionDemo {
	public static void method(int i) throws Exception1, Exception3, Exception2 {
		if(i==1)
			throw new Exception1("Exception1 thrown");
		else if(i==2)
			throw new Exception2("Exception2 thrown");
		else if(i==3)
			throw new Exception3("Exception3 thrown");
		else
			throw new NullPointerException();
	}
	public static void main(String[] args) {
		try {
			method(1);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("In finally");
		}
	}
}
