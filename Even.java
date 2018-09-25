package com.capgemini.day2_demo;
import static java.lang.System.out;
import java.util.Scanner;
public class Even {

	public static void main(String[] args) {
		int num=1;
		int i=0,j=0;
		int flag=5;
		while(num<=100)
		{
				if(num%2==0)
				{	
					if((j-i) % 5==0)
						System.out.print(num+" ");
					else
						System.out.print("* ");
						flag--;
					i++;
				}
				num++;
				if(flag==0)
				{
					System.out.println();
					flag=5;
					j++;
					i=0;
				}
		}	
	}
} 
 




