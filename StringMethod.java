package org.cap.day4;
import java.util.Arrays;
import static java.lang.System.out;
import java.util.Scanner;
public class StringMethod {

	public static void main(String[] args) {
	String str="welcome";
	String str1="Goodmorning";
	out.println(str.charAt(3));
	out.println(str.codePointAt(3));
	out.println(str1.compareTo(str));
	out.println(str1.compareToIgnoreCase(str));
	out.println(str.concat(str1));
	out.println(str1.contains("dmor"));
	out.println(str.contentEquals("good"));
	
	

	}

}
