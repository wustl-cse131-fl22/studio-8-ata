package studio8;

import java.util.HashSet;
import java.util.LinkedList;

public class Date {

	private int month;
	private int day;
	private int year;
	private boolean holiday;

	public Date(int month, int day, int year, boolean holiday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = holiday;
	}

	public static void main(String[] args) {
		Date date1 = new Date(5, 6, 2022, false);
		Date date2 = new Date(9, 11, 2001, true);
		Date date3 = new Date(5, 6, 2022, false);

		System.out.println(date1);
		System.out.println(date2);

		System.out.println(date1.equals(date2));
		System.out.println(date1.equals(date3));

		LinkedList<Date> list = new LinkedList<Date>();
		list.add(date1);
		list.add(date2);
		list.add(date1);
		System.out.println(list);

		HashSet<Date> set = new HashSet<Date>();
		set.add(date1);
		set.add(date2);
		set.add(date1);
		System.out.println(set);

		// lists include all entries, sets include unique entries

	}

	public String toString() {
		return month + "/" + day + "/" + year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

}
