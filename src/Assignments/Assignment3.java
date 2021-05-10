package Assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Assignment3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String host = sc.nextLine();
		String result = "";
		String cmd = "ping -c 5 "+host;
		List<Double> times = new ArrayList<>();
		try {
			Runtime r = Runtime.getRuntime();
			Process p = r.exec(cmd);
			int count =0;
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String input;
			while((input = br.readLine()) != null) {
				if(count>0)
				System.out.println(input);
				result +=input;
				if(count>0 && count <6)
				times.add(Double.parseDouble((input).split(" ")[7].substring(5,9)));
				count++;
			}
			br.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
		Collections.sort(times);
		System.out.println("Median of times = "+times.get(2));
	}

}
