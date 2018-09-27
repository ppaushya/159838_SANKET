package org.cap.day4;

public class TestString {
	int x,y,z;
	public void show(int a,int b,int c) {
		x=a;
		y=b;
		z=c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String st="hello";
String str=new String("world");
System.out.println(st.hashCode());
System.out.println(str.hashCode());
String st1="Hii";
String st2="hello";
System.out.println(st1.hashCode());
System.out.println(st2.hashCode());
String s=new String("world");
System.out.println(s.hashCode());

TestString t1=new TestString();
TestString t2=new TestString();
t1.show(10, 20, 3);
t2.show(5, 6,7);
System.out.println(t1.hashCode());
System.out.println(t2.hashCode());
	}

}
