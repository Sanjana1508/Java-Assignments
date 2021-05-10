package Assignments;

public class Assignment2 {
	private String text;
	public Assignment2(String text) {
		this.text = text;
	}
	public boolean chechkAllChars() {
		if(text.replaceAll("[^a-z]", "").length() == 26)
			return true;
		return false;
	}
	public static void main(String[] args) {
		String text = "ab!Cc%d66ef&ghij?klmn.opqHrstRuvw0xSyz";
		Assignment2 assign = new Assignment2(text);
		if(assign.chechkAllChars())
			System.out.println("Text contaisn all characters a-z");
		else
			System.out.println("Text does not contain all characters a-z");
	}
}
