package com.capgemini.day3_demo;
import static java.lang.System.out;
import java.util.Scanner;
public class ArrayTest {

	public static void main(String[] args) {
	
		int[] num=new int[10];
		char t='A';
		String st="A";
		double d=3.14;
		num[0]=1;
		num[2]=t;
		//num[3]=(int)st;
		num[5]=(int)d;
		for(int i=0;i<10;i++)
		{
			out.println(num[i]);
		}
		int []arr= {1,2,3,4,5};
		int l=arr.length;
	}

}
