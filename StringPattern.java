package com.capgemini.day2_demo;
import static java.lang.System.out;
import java.util.Scanner;
public class StringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="hello";
		int l=str.length();
		int i,j;
		for(i=0;i<=l;i++) {
			for(j=0;j<i;j++) {
				out.print(str.charAt(j));
				
			}
			out.println();
		}
	}

}
