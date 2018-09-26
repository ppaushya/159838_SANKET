package com.capgemini.day3_demo;
import static java.lang.System.out;
import java.util.Scanner;
public class AddArray {

	public int add(int[] ar,int[] arr) {
		
		int[] sum=new int[4];
		for(int i=0;i<ar.length;i++) {
			sum[i]=ar[i]+arr[i];
			out.print(sum[i]+" ");
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AddArray obj=new AddArray();
int[] num1= {1,2,3,4};
int [] num2= {10,20,30,40};
obj.add(num1,num2);
	}

}
