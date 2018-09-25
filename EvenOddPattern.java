package com.capgemini.day2_demo;
import static java.lang.System.out;
import java.util.Scanner;
public class EvenOddPattern {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("Enter Number: ");
		n=sc.nextInt();
		for(int i=1;i<=n;i=i+6)
		{
			for(int j=i;j<=i+5&&j<n;j++)
			{
				if(j%2!=0)
					System.out.print(j+" ");
			}
			for(int j=i;j<=i+5&&j<n;j++)
			{
				if(j%2==0)
					System.out.print(j+" ");
			}
		}
		
		sc.close();
		}
	}