package org.cap.day4;

public enum Weekdays {

	SUN(1),MON(2),TUE(3),WED(4),THUR(5),FRI(6),SAT(7);
	 int value;
	 private Weekdays(int var)
{
		this.value=var;
		}
	public int get() {
		return this.value;
	}
}

