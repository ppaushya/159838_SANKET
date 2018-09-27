package org.cap.day4;

public class TestClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Weekdays[] values=Weekdays.values();
for(Weekdays day:values) {
	System.out.println(day);
}
String st="SAT";
String st1="sat";
//if found then return that string 
Weekdays yourday=Weekdays.valueOf(Weekdays.class,st);
System.out.println(yourday);
//if not found then throw exception
Weekdays yourday1=Weekdays.valueOf(Weekdays.class,st1);
System.out.println(yourday1);
	}

}
