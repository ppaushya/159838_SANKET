package com.capgemini.day3_demo;
import static java.lang.System.out;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int[5];
		Scanner st=new Scanner(System.in);
		out.println("Enter the array element");
		for(int i=0;i<5;i++) {
			arr[i]=st.nextInt();
		}
		int temp=0,count=0;
		for(int j=0;j<5;j++) {
			for(int k=j+1;k<5;k++) {
				if(arr[j]>arr[k]) {
					temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
				
			}
			count++;
		
			if(count==2) {
				out.println("2nd largest element is "+arr[arr.length-count]);
				break;
			}
		}
		
		}

	}


