package com.capgemini.day2_demo;
import static java.lang.System.out;
import java.util.Scanner;
public class Armstrong {

	public static boolean isArmstrong(int num)
	{
		int r;
		int n=num;
		int sum=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(num==sum)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		
		System.out.println("Armstrong number between 1 to 1000 are: ");
		for(int i=1;i<=1000;i++)
		{
			if(isArmstrong(i))
			{
				System.out.println(i);
			}
		}

	}

}


