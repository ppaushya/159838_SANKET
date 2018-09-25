package org.cap.demo;
import java.util.Scanner;
public class SimpleInterest{
	float si;
	float t;
	float r;
	float result;
	public void getData()
	{
		/*si=4000;
		t=3.3f;
		r=10.5f; */
		Scanner st =new Scanner(System.in);
		System.out.println("Enter the principle: ");
		si=st.nextFloat();
		System.out.println("Enter the time ");
		t=st.nextFloat();
		System.out.println("Enter the rate ");
		r=st.nextFloat();
				
	}
	public float calculate()
	{
		return (si*t*r)/100;
	}

}
