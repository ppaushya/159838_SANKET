package com.capgemini.day2_demo;
import static java.lang.System.out;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		char ch='A';
		String st="hello";
		switch(num) {
		case 1:
			out.println("One");
			break;
		case 10:
			out.println("Ten");
			break;
			default:
				out.println("Not match choice");
		}
		switch(ch) {
		case 'b':
			out.println("small a");
			break;
		case 'A':
			out.println("Capital A");
			break;
			default:
				out.println("not valid");
		}
		switch(st) {
		case "one":
			out.println("it is one");
			break;
		case "hello":
			out.println("it is hello");
			break;
			default:
				out.println("not valid");
		}

	}

}
