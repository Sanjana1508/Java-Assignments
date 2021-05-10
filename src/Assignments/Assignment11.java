package Assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Assignment11 {
	public static void main(String[] args) throws IOException {
		String filename = "src/Assignments/"+args[0];
		File file = new File(filename);
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String s;
		HashMap<Character,Integer> freq = new HashMap<>();
		while((s = br.readLine()) != null) {
			s=s.replace("[\\s+]", "");
			for(int i=0;i<s.length();i++) {
				char c= s.charAt(i);
				if(freq.containsKey(c))
					freq.put(c, freq.get(c)+1);
				else
					freq.put(c, 1);
			}
		}
		FileWriter fw = new FileWriter("src/Assignments/output.txt");
		for(char c : freq.keySet()) {
			fw.write(c+" occurred "+freq.get(c)+" times");
			fw.close();
		}
	}
}
