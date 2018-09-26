package com.capgemini.day3_demo;
import static java.lang.System.out;
import java.util.Scanner;
public class MatrixAddMul {
int [][] arr1=new int[3][3];
int [][] arr2=new int[3][3];
public void get() {
	Scanner st=new Scanner(System.in);
	for(int k=0;k<2;k++) {
		out.println("Enter data for 1st matrix");
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			if(k==0) {
				arr1[i][j]=st.nextInt();
			}
			else {
				arr2[i][j]=st.nextInt();
			}
			
		}
		}
	}
}
public void add() {
	int [][] sum=new int[3][3];
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			sum[i][j]=arr1[i][j]+arr2[i][j];
			
		out.print(sum[i][j]+" ");
		}
	out.println();
	}
}
public void mult() {
	int [][] ml=new int[3][3];
	int temp=0;
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			for(int k=0;k<3;k++) {
				 temp = temp + arr1[i][k]*arr2[k][j];
	        }
	 
	        ml[i][j] = temp;
	        temp = 0;
	        out.print(ml[i][j]+" ");
			}
		out.println();
		}
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixAddMul am=new MatrixAddMul();
		am.get();
		out.println("Addition is");
		am.add();
		out.println("Multiplication is");
		am.mult();

	}

}
