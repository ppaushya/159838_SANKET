package com.capgemini.day3_demo;
import static java.lang.System.out;
import java.util.Scanner;
public class MissingMatrix {
		Scanner sc=new Scanner(System.in);
		int row,col;
		public void getSize()
		{
			System.out.println("Enter num of row and col: ");
			row=sc.nextInt();
			col=sc.nextInt();
			
		}
		public void getElem(int[][] arr)
		{
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					arr[i][j]=sc.nextInt();
				}
			}
		}
		public void print(int[][] arr)
		{
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(arr[i][j]+"\t");
				}
				System.out.println();
			}
		}
		public void sort(int[][] arr)
		{
			for(int i=0;i<row;i++)
			{
				//sort
				for(int j=0;j<col;j++)
				{
					for(int k=j+1;k<col;k++)
					{
						if(arr[i][j]>arr[i][k])
						{
							int temp=arr[i][j];
							arr[i][j]=arr[i][k];
							arr[i][k]=temp;
						}
					}
				}
			}
		}
		public void sequence(int[][] arr)
		{
			int n=0;
			int flag=0;
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col-1;j++)
				{
					if(arr[i][j+1]-arr[i][j]!=1)
					{
						n=arr[i][j];
						n=n+1;
						flag=1;
					}
				}
				if(flag==1)
				{
					System.out.print(n+"\t");
				}
				else
				{
					n=arr[i][col-1];
					n=n+1;
					System.out.print(n+"\t");
				}
			}
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			MissingMatrix obj=new MissingMatrix();
			obj.getSize();
			int[][] arr=new int[obj.row][obj.col];
			System.out.println("Enter Elements:");
			obj.getElem(arr);
			System.out.println("Array is:");
			obj.print(arr);
			System.out.println("After sorting:");
			obj.sort(arr);
			obj.print(arr);
			System.out.println("The missing number is:");
			obj.sequence(arr);
			
			sc.close();
		}

	
	}


