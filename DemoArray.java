package com.capgemini.day3_demo;
import static java.lang.System.out;
import java.util.Scanner;
public class DemoArray {

	int[] myArray;
	public void getArray(int size) {
		out.println("Enter"+size+"Array Elements");
		myArray=new int[size];
		Scanner st=new Scanner(System.in);
		for(int i=0;i<size;i++) {
			myArray[i]=st.nextInt();
		}
	}
	public void show() {
		for(int j=0;j<myArray.length;j++) {
			out.print(myArray[j]+" ");
		}
	}
	public void reverse()
	{
		out.println();
		for(int k=myArray.length-1;k>=0;k--)
		{
			out.print(myArray[k]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DemoArray d=new DemoArray();
//out.println(d.myArray);
d.getArray(5);
d.show();
d.reverse();
	}

}
