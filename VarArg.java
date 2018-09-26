package com.capgemini.day3_demo;
import static java.lang.System.out;
public class VarArg {

	
	public void show(int ... arr) { 
		//vararg should be last argument and can be any of any datatype and more than one
		for(int x:arr) {
			out.print(x+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
VarArg v=new VarArg();
int [] num= {10,20,30,40};
v.show(num);

	}

}
