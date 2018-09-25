package com.capgemini.day2_demo;
import static java.lang.System.out;
import java.util.Scanner;
public class Product {
	String nm;
	int id;
	int qnt;
	float price;
	float dsct;
	float tax;
	public void getData()
	{
		Scanner st=new Scanner(System.in);
		out.println("Enter the Product name ");
		nm=st.next();
		out.println("Enter product id ");
		id=st.nextInt();
		out.println("Enter the quantity ");
		qnt=st.nextInt();
		out.println("Enter price ");
		price=st.nextFloat();
	}
		public void findDisc() {
			
		Scanner s=new Scanner(System.in);
		out.println("Enter discount ");
		dsct=s.nextFloat();
		}
	
	public float findTax()
	{
		float tax1=0;
		if(dsct>90) {
			tax1=0.01f;
		}
		else if(dsct>80 && dsct<90) {
			tax1=0.12f;
		}
		else if(dsct>60 && dsct<80) {
			tax1=0.20f;
		}
		else if(dsct>50 && dsct<60) {
			tax1=0.25f;
		}
		else if(dsct<50) {
			tax1=0.40f;
		}
		tax=price*qnt*tax1;
		return tax;
	}
	
	public float finalPrice() {
		float total;
		total=(float)price+tax-(price*((float)dsct/100));
		out.println("Total price is "+total);
		return 0;
	}

	public static void main(String[] args) {
		
		int ch;
		Scanner chc=new Scanner(System.in);
		Product p=new Product();
		do{
		p.getData();
		p.findDisc();
		p.findTax();
		p.finalPrice();
		out.println("What is your choice continue or not? [0/1] ");
		ch=chc.nextInt();
		}while(ch==1);
	}	
}
