package studio8;

public class Appointment {
	
	private Time time;
	private Date date;
	
	public Appointment (Time time, Date date) {
		this.time = time;
		this.date = date;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		Appointment other = (Appointment) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}



	public static void main(String[] args) {
		Time time1 = new Time(11, 30, true, false);
		Date date1 = new Date(11, 30, 2022, false);
		Appointment a1 = new Appointment(time1, date1);
		System.out.println(a1);

	}
	
	public String toString() {
		return time + " on " + date;
	}

}
