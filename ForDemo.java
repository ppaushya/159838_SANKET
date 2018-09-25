package com.capgemini.day2_demo;
import static java.lang.System.out;
import java.util.Scanner;
public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
// for(i=1;i<=10;i++);  --->> 11
/* for(i=0;i<5;i++) {
	for(j=0;j<i;j++) {
		out.print("*\t");
	}
	out.println();
} */
		for(i=0;i<4;i++)
		{
			
			for(j=4;j>i;j--) {
				out.print("*\t");
			}
			out.println();
			for(int t=0;t<=i;t++) {
			out.print("\t");
			
		}
		}
		
		/* int i,j;
	for(i=0;i<5;i++){
	    for(j=0;j<5;j++){
	        if(j<i){
	            System.out.print(" ");
	        }
	        else{
	            System.out.print("*");
	        }
	    }
	    
	    System.out.println();
	}*/
		
		//another number pattern
		int temp=0;
		for(int k=0;k<5;k++) {
			for(int t=0;t<k;t++) {
				temp=temp+1;
				out.print(temp+" ");
			}
			out.println();
		}
		
		//3rd question Pascal Triangle 
		
		 int r, a, c, number=1, b;
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Enter Number of Rows : ");
			r = scan.nextInt();
			
			for(a=0;a<r;a++)
			{
				for(c=r; c>a; c--)
				{
					System.out.print(" ");
				}
	            number = 1;
				for(b=0;b<=i;b++)
				{
					if(number>0) {
					 System.out.print(number+ " ");
					}else { out.print(" "); }
	                 number = number * (a - b) / (b + 1);
					
				}
				System.out.println();
			}
		
		
}
}