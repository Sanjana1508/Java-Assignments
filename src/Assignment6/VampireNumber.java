package Assignment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VampireNumber {
	int n;
	static List<Integer> vampires;
	public VampireNumber() {
		n=100;
		vampires = new ArrayList<>();
	}
	public void getVampires() {
		for(int i=1;vampires.size()<=n;i++) {
			//System.out.println(i);
			if(len(i)%2 !=0) {
				i= i*10 -1;
			}
			else {
				for(int x=2;x<=Math.sqrt(i)+1;x++) {
					if(i%x == 0) {
						int y = i/x;
						if(perm(i,x,y) && x*y == i) {
							vampires.add(i);
						}
					}
				}
			}
		}
	}
	private int len(int num) {
		return String.valueOf(num).length();
	}
	private boolean perm(int num,int x,int y) {
		String x_num = String.valueOf(x);
		String y_num = String.valueOf(y);
		int numLength = len(num);
		if(x_num.length()!= numLength/2 || y_num.length() != numLength/2)
			return false;
		if(x_num.endsWith("0") && y_num.endsWith("0"))
			return false;
		char x_c[] = x_num.toCharArray();
		char y_c[] = y_num.toCharArray();
		char c[] = new char[x_c.length+y_c.length];
		int k =0;
		for(int i=0;i<x_c.length;i++)
			c[k++]=x_c[i];
		for(int i=0;i<y_c.length;i++)
			c[k++]=y_c[i];
		char num_char[] = String.valueOf(num).toCharArray();
		Arrays.sort(num_char);
		Arrays.sort(c);
		if(Arrays.equals(num_char,c))
			return true;
		return false;
	}
	public static void main(String[] args) {
		VampireNumber vn = new VampireNumber();
		vn.getVampires();
		for(int i: VampireNumber.vampires)
			System.out.println(i);
	}

}
