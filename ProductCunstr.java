package org.cap.day4;
import static java.lang.System.out;
import java.util.Scanner;
public class ProductCunstr {

	int id;String name;double price;int qnty;
	
	
ProductCunstr(){
		out.println("Default constructor");
	}
	ProductCunstr(int x){
		this.id=x;
		out.println("overload constructor");
	} 
	
	// right click->source ->generate constructor
	ProductCunstr(int y,String nm,double d,int t){
		this.id=y;
		this.name=nm;
		this.price=d;
		this.qnty=t;
		out.println("IN all parameter constr");
	}  
	 /*public void show() {
		out.println(id+" "+name+" "+price+" "+qnty);
	} */
	
	@Override
	public String toString() {
		return "ProductCunstr [id=" + id + ", name=" + name + ", price=" + price + ", qnty=" + qnty + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ProductCunstr p=new ProductCunstr();
out.println(p);
//p.show();
ProductCunstr p1=new ProductCunstr(1410);
out.println(p1);
//p1.show();
ProductCunstr p2=new ProductCunstr(1410,"Arya",5000,100);
out.println(p2);
//p2.show();
	}

}
