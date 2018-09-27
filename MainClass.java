package org.cap.day4;

public class MainClass {
	public static void main(String[] args) {
		Weekdays myday=Weekdays.MON;
		switch(myday) {
		case SUN:
			System.out.println("Holidays");
			break;
		case MON:
		case TUE:
		case WED:
		case THUR:
		case FRI:
			System.out.println("wORKING DAYS");
			break;
		case SAT:
			System.out.println("lEARNING DAYS");
			break;
			default:
				System.out.println("invalid");
		}
	}

}
