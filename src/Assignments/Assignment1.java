package Assignments;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Assignment1 {
	File dir;
	Assignment1(File dir){
		this.dir = dir;
	}
	public void printMatchingFiles(String patternForFiles) {
		File files[] = dir.listFiles();
		Pattern p = Pattern.compile(patternForFiles);
		recursiveSearch(files,0,p);
		
	}
	private void recursiveSearch(File files[],int level,Pattern p) {
		for(File f:files) {
		if(f.isFile()) {
			Matcher m = p.matcher(f.getName());
			System.out.println(f.getAbsolutePath());
		}
		else if(f.isDirectory()) {
			recursiveSearch(f.listFiles(),level+1,p);
		}
	}
	}
	public static void main(String[] args) {
		File dir = new File("/home/sanjp");
		Scanner sc = new Scanner(System.in);
		Assignment1 assign = new Assignment1(dir);
		int i=0;
		while(i<5) {
			System.out.println("Enter Pattern : ");
			String pattern = sc.next();
			assign.printMatchingFiles(pattern);
		}
	}
}
