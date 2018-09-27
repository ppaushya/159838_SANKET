package org.cap.day4;
import static java.lang.System.out;
import java.util.Scanner;
/* class Fun{
	int p;int t;int r;float si;
	Fun(){
		out.println("Indefault constructor");
	}
	Fun(int x){
		this.p=x;
		
	}
	Fun(int x,int t1){
		this.p=x;this.t=t1;
	
	}
Fun(int x,int y,int z){
	this.p=x;this.t=y;this.r=z;
	si=(float)((p*t*r)/100);
}
@Override
public String toString() {
	return "Fun [p=" + p + ", t=" + t + ", r=" + r + ", si=" + si + "]";
}


}
*/

public class MethodOver {

	int pr;int tm;int rt;
	
	
	
	public MethodOver(int pr, int tm, int rt) {
		
		this.pr = pr;
		this.tm = tm;
		this.rt = rt;
	}
	
	


@Override
	public String toString() {
		return "MethodOver [pr=" + pr + ", tm=" + tm + ", rt=" + rt + ", calc()=" + calc() + "]";
	}




public double calc(int x,int y,int z)
{
	this.pr = x;
	this.tm = y;
	this.rt = z;
	return this.pr*this.tm*this.rt;
}
public double calc(int x,int y) {
	this.pr=x;
	this.tm=y;
	return this.pr*this.tm*this.rt;
}
public double calc(int x) {
	this.pr=x;
	return this.pr*this.tm*this.rt;
}
public double calc() {
	return this.pr*this.tm*this.rt;
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Fun f=new Fun();
out.println(f);`
Fun f1=new Fun(6000);
out.println(f1);
Fun f2=new Fun(6000,5);
out.println(f2);
Fun f3=new Fun(6000,5,10);
out.println(f3);
*/
MethodOver m=new MethodOver(5000,6,10);
out.println(m);
out.println(m.calc(5000,8,20));
out.println(m);
out.println(m.calc(6000,7));
out.println(m);
out.println(m.calc(5000));
out.println(m);
out.println(m.calc());
out.println(m);

	}

}
