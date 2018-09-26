package com.capgemini.day3_demo;
import static java.lang.System.out;
import java.util.Arrays;
import java.util.Scanner;
public class PassingArrayMethod {


public void show(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		arr[i]=arr[i]+2;
		out.println(arr[i]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
PassingArrayMethod p=new PassingArrayMethod();
int [] num= {12,10,55,40,65};
p.show(num);

	}

}
