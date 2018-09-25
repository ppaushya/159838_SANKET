package org.cap.demo;
import static java.lang.System.out;
import java.util.Scanner;
class Std{
	String name;
	int m1,m2,m3;
	public void get() {
		 Scanner s=new Scanner(System.in);
		 name=s.nextLine();
		 m1=s.nextInt();
		 m2=s.nextInt();
		 m3=s.nextInt();
	 }
	public int score(int a,int b,int c) {
		int sm=a+b+c;
		return sm;
	}
	public float average(float n)
	{
		float avg1=n/3;
	return avg1;
	}
	public void print(int p,float q,String s)
	{
		
		
		out.println("Total Score is "+p);
		out.println("Average is :"+q);
		out.println("Name of the student is "+s);
	}

}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Std obj=new Std();
		obj.get();
		int d,e,f;
		String str;
		d=obj.m1;
		e=obj.m2;
		f=obj.m3;
		str=obj.name;
		int v=obj.score(d,e,f);
		float fff=obj.average(v);
		obj.print(v, fff,str);

	}

}
