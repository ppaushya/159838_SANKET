package org.cap.day4;
import static java.lang.System.out;
 enum CustomerType{
	SILVER(0,100),GOLD(101,200),DIAMOND(201,300),PLATINUM(301,500);
	 int minm;
	 int maxm;
	 private CustomerType(int x,int y) {
		 this.minm=x;
		 this.maxm=y;
	 }
	 public int getminm() {
		 return this.minm;
		 
	 }
	 public int getmaxm() {
		 return this.maxm;
	 }
}
public class CustomerEnum {
String name="Singhania";
int id=141025;
CustomerType ct=CustomerType.DIAMOND;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CustomerEnum c=new CustomerEnum();
	out.print(c.id+" "+c.name+" "+c.ct+" "+c.ct.getminm()+"-"+c.ct.getmaxm());
	// we can also access as out.println(c.ct.minm);
	}

}
