package com.capgemini.day3_demo;
import static java.lang.System.out;
import java.util.Scanner;
/* int[] num; int num[][]; int [] num[];
 * in 1D; int [] num=new int[10]; and int [] num={10,20,30};
 * in 2D; int [][] num=new int[4][3]; 4 row and 3 colomn 
 * int[][] num={{1,2,3},{5,6,7},{8,9,10},{10,123,30}};
 * arr index should be +ve, not -ve.
 * int [][] arr=new int[3]; arr[0]=new int[5];arr[1]=new int[3];arr[2]=new int[4]; 
 * */
public class MultidArr {
 void show(int[][] xy) {
	 for(int k=0;k<3;k++) {
		 for(int n=0;n<2;n++) {
			 out.print(xy[k][n]+" ");
		 }
		 out.println();
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultidArr m=new MultidArr();
int [][] arr=new int[3][2];
Scanner st=new Scanner(System.in);
for(int i=0;i<3;i++) {
	for(int j=0;j<2;j++) {
		arr[i][j]=st.nextInt();
	}
}
m.show(arr);

	}

}
