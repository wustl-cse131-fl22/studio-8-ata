package studio8;

import java.util.LinkedList;

public class Calendar {

	private Appointment a;
	
	public Calendar(Appointment a) {
		this.a = a;
	}

	public static void main(String[] args) {
		Time time1 = new Time(11, 30, true, false);
		Date date1 = new Date(11, 30, 2022, false);
		Appointment a1 = new Appointment(time1, date1);
		
		Time time2 = new Time(10, 30, false, true);
		Date date2 = new Date(12, 1, 2022, false);
		Appointment a2 = new Appointment(time2, date2);
		
		LinkedList<Appointment> calendar = new LinkedList<Appointment>();
		calendar.add(a1);
		calendar.add(a2);
		System.out.println(calendar);
		
		
		

	}
	
	public String toString() {
		return a + "";
	}
	

}
