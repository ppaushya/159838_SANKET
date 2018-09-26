package com.capgemini.day3_demo;
import static java.lang.System.out;
import java.util.Arrays;
import java.util.Scanner;
public class EmployeeArr {
	int id;
String fname;
String lname;
long sal;
int age;
public void get() {
	Scanner st=new Scanner(System.in);
	out.println("Employee details ");
	id=st.nextInt();
	fname=st.next();
	lname=st.next();
	sal=st.nextLong();
	age=st.nextInt();
}
public void show() {
	
	out.println("Employee details are ");
	out.println(id+" "+fname+" "+lname+" "+sal+" "+age);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ttt=new Scanner(System.in);
int pp;
out.println("Enter the no. of Employees ");
pp=ttt.nextInt();
		EmployeeArr[] emp=new EmployeeArr[pp];
		
		int i;
		for(i=0;i<emp.length;i++) {
			emp[i]=new EmployeeArr();
			out.print("Enter ");
			out.print(i+1+" ");
			emp[i].get();
		}
		for(int j=0;j<emp.length;j++) {
			out.print(j+1+" ");
			emp[j].show();
		}
		 EmployeeArr temp=new EmployeeArr();
		for(int k=0;k<emp.length;k++) {
			for(int m=1;m<emp.length;m++) {
				if(emp[k].id >emp[m].id){
					temp=emp[k];
					emp[k]=emp[m];
					emp[m]=temp;
				}
			}
		}
		out.println("Sorted array are ");
		for(int l=0;l<emp.length;l++) {
			out.print(l+1+" ");
			emp[l].show();
		}
	}

}
