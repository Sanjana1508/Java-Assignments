package Assignments;

import java.util.regex.*;

public class Assignment9 {
	private String text;
	public Assignment9(String text) {
		this.text = text;
	}
	public void checkSentence() {
		Pattern p = Pattern.compile("[A-Z][a-z\\s,;'\"]+.");
		 Matcher m = p.matcher(text);
		 if(m.find()) {
			 System.out.println(m.group());
		 }
		 else
			 System.out.println("Not found");
	}
	public static void main(String[] args) {
		String text = "This is a sentence.";
		Assignment9 assign = new Assignment9(text);
		assign.checkSentence();
	}
}
