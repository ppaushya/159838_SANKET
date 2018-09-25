package org.cap.demo;
import static java.lang.System.out;
import java.util.Scanner;
 class Emp{
	 int id;
	 String nm;
	 int age;
	 boolean isperm;
	 String gen;
	 String addr;
	 public void get() {
		 Scanner empl=new Scanner(System.in);
		 out.println("Enter your id :");
		 id=empl.nextInt();
		 out.println("Enter your name :");
		 nm=empl.next();
		 out.println("Enter your Age :");
		 age=empl.nextInt();
		 out.println("Enter your choice Ispermanent :");
		 isperm=empl.nextBoolean();
		 out.println("Enter your gender :");
		 gen=empl.next();
		 out.println("Enter your Address :");
		 addr=empl.next(); 
	 }
	 
	 public void show() {
		 out.println(id);
		 out.println(nm);
		 out.println(age);
		 out.println(isperm);
		 out.println(gen);
		 out.println(addr);
		 
	 }
	
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp emn=new Emp();
		emn.get();
		emn.show();
	}

}
