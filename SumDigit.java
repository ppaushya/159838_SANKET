package com.capgemini.day2_demo;
import static java.lang.System.out;
import java.util.Scanner;
public class SumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner d=new Scanner(System.in);
int n;
out.println("enter the no. ");
n=d.nextInt();
		int sum = 0; 
		   while (n != 0) 
		   { 
		       sum = sum + n % 10; 
		       n = n/10; 
		   } 
		   out.println("Sum of digit is "+sum); 

	}

}
