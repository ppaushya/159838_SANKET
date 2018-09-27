package org.cap.day4;

public class TestStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String st="tom";
String st1=new String("tom");
System.out.println(st==st1);
System.out.println(st.equals(st1));
String st2="tom";
System.out.println(st==st2);
System.out.println(st.equals(st2));
String my=new String("tom");
System.out.println(my==st1);
System.out.println(my.equals(st1));
	}

}
