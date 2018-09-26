package com.capgemini.day3_demo;
import static java.lang.System.out;
import java.util.Scanner;
public class ArrayAppl {
 int [] num;
 
 public void get(int n) {
	 Scanner st=new Scanner(System.in);
	 num=new int[n];
	 for(int i=0;i<n;i++) {
		 num[i]=st.nextInt();
	 }
 }
	 public void maxm() {
		 int temp=num[0];
		 for(int j=1;j<num.length;j++) {
			 if(num[j]>temp) {
			temp=num[j];
			
			 }
			
			    }
			
		 out.print("Maximum element is "+temp);
	 }
	 public void minm() {
		 int t1=num[0];
		 for(int k=1;k<num.length;k++) {
			 if(num[k]<t1) {
				 t1=num[k];
			 }
			 
		 }
		 out.print("\nMinimum is "+ t1+"\n");
	 }
	 
	 public void EvenSum()
	 {
		 int sum=0;
		 out.print("Even no. : - ");
		 for(int p=0;p<num.length;p++) {
			 if(num[p]%2==0) {
				 out.print(num[p]+" ");
				 sum=sum+num[p];
			 }
		 }
		 out.println("\nSum of even no. is "+sum);
	 }
	 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayAppl ap=new ArrayAppl();
Scanner s=new Scanner(System.in);
out.println("Enter teh size of array");
int b;
b=s.nextInt();
ap.get(b);
ap.maxm();
ap.minm();
ap.EvenSum();
	}

}
