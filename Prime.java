package com.capgemini.day2_demo;
import static java.lang.System.out;
import java.util.Scanner;
public class Prime{    
	public static boolean isPrime(int n)
	{
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Prime nums b/w 1 to 1000 are:");
		for(int i=1;i<=1000;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}
	}

}