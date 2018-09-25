package org.cap.demo;
import static java.lang.System.out;
public class MainClass {
	public static void main(String[] args) {
		 
		SimpleInterest s=new SimpleInterest();
		s.getData();
		out.println("Simple Interest is : ");
		out.println(s.calculate());
	}

}
