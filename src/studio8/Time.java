package studio8;

public class Time {

	private int hour;
	private int minute;
	private boolean military;
	private boolean am;

	public Time(int hour, int minute, boolean military, boolean am) {
		this.hour = hour;
		this.minute = minute;
		this.military = military;
		this.am = am;
	}

	public static void main(String[] args) {
		Time time1 = new Time(21, 30, true, false);
		System.out.println(time1);

		Time time2 = new Time(1, 30, false, false);
		System.out.println(time2);

		Time time3 = new Time(5, 30, false, true);
		System.out.println(time3);
		
		Time time4 = new Time(1, 30, false, false);
		System.out.println(time4);
		
		System.out.println(time1.equals(time2));
		System.out.println(time2.equals(time4));
	}

	public String toString() {
		if (military == true) {
			return hour + ":" + minute;
		} else {
			if (am == true) {
				return hour + ":" + minute + " am";
			} else {
				return hour + ":" + minute + " pm";
			}
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (am ? 1231 : 1237);
		result = prime * result + hour;
		result = prime * result + (military ? 1231 : 1237);
		result = prime * result + minute;
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
		Time other = (Time) obj;
		if (am != other.am)
			return false;
		if (hour != other.hour)
			return false;
		if (military != other.military)
			return false;
		if (minute != other.minute)
			return false;
		return true;
	}

}