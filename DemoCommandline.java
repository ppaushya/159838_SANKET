package org.cap.day4;

public class DemoCommandline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,num;
if(args.length>0) {
	for(String st:args) {
		num=Integer.parseInt(st);
		sum+=num;
	}
	
}
System.out.println(sum);
	}

}
