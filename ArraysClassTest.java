package org.cap.day4;
import java.util.Arrays;
import static java.lang.System.out;
import java.util.Scanner;
public class ArraysClassTest {

	public static void main(String[] args) {
		int[]arr= {10,2,-5,'a',50};
		Arrays.sort(arr);
		for(int i:arr) {
			out.print(i+" ");
		}
String [] str= {"jgh","klm","arun"};
Arrays.sort(str);
for(String st:str) {
	out.print(st+" ");
}
//Arrays.copyOf(arr_name,m) here m means no. of element counting 0 index as one element.;
int [] arr1=Arrays.copyOfRange(arr,1,3); // here 3 means till (3-1=2)nd index
for(int x:arr1) {
	out.println(x);
}
out.println(Arrays.binarySearch(arr, 50)); 
//if not found then return -ve value and if found return index of element
	}
	

}
