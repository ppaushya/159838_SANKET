package org.cap.day4;
import static java.lang.System.out;
import java.util.Scanner;
public class EmployeeEnum {
int id;
String name;
int sal;
int age;
Weekdays weekoff;
public void get() {
	/* id=1001;name="suman kumar";sal=5000;age=50;
	weekoff=Weekdays.SAT; */
	Scanner st=new Scanner(System.in);
	id=st.nextInt();
	name=st.next();
	sal=st.nextInt();
	age=st.nextInt();
	out.println("Choose week of [1-7] as 1.SUN 2.MON,3.TUE,4.WED ,5.THUR,6.FRI,7.SAT");
	// weekoff.value=st.nextInt();
	 int choice=st.nextInt();
	switch(choice) {
	case 1:
		weekoff=Weekdays.SUN; 
		break;
	case 2:
		weekoff=Weekdays.MON; 
		break;
	case 3:
		
		weekoff=Weekdays.TUE; 
		break;
	case 4:
		weekoff=Weekdays.WED; 
		break;
	case 5:
		weekoff=Weekdays.THUR; 
		break;
	case 6:
		weekoff=Weekdays.FRI; 
		break;
	case 7:
		weekoff=Weekdays.SAT; 
	
	break;
	}
	
}

public void printe() {
	out.print(id+" "+name+" "+sal+" "+age+" "+weekoff+" "+weekoff.get());
} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmployeeEnum e=new EmployeeEnum();
e.get();
e.printe();
// Weekdays obj=new Weekdays(); cant create object of enum 
	}

}
