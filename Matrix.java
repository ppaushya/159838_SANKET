package com.capgemini.day3_demo;
import static java.lang.System.out;
import java.util.Scanner;
public class Matrix {
int [][] num;
int x,y;
public void check(int a,int b) {
	x=a;y=b;
	
	if(a!=b) {
		out.println("not valid matrix");
	}
	else {
		num=new int[x][y];
			}
		}
		
	

public void get() {
	Scanner s=new Scanner(System.in);
	for(int i=0;i<x;i++) {
		for(int j=0;j<y;j++) {
			num[i][j]=s.nextInt();
			}
			
		}
	}
public void lower() {
	for(int i=0;i<x;i++) {
		for(int j=0;j<=i;j++) {
			
			out.print(num[i][j]+" ");
			
			}
		out.println();
			
		}
}
public void upper() {
	for(int i=0;i<x;i++) {
		for(int j=0;j<y;j++) {
			if(j>=i) {
			out.print(num[i][j]);
			}
			else {
				out.print(" ");
			}
			
			}
		out.println();
			
		}
}
public void transpose() {
	int temp=0;
	int [][] tran=new int[x][y];
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				tran[i][j]=num[j][i];
				out.print(tran[i][j]);
				}
			out.println();
				}
				
			
				
			}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Matrix m=new Matrix();
Scanner st=new Scanner(System.in);
int m1,n;
m1=st.nextInt();n=st.nextInt();
m.check(m1,n);
m.get();
out.println("Lower Triangle is");
m.lower();
out.println("upper triangle is");
m.upper();
out.println("Transpose is");
m.transpose();

	}

}


