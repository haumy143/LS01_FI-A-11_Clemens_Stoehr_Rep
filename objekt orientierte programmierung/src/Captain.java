
public class Captain {

	private String surname;
	private String name;
	private int captainYears;
	private double salary;
	
	public Captain(String surname, String name, int captainYears, double salary) {
		this.name = name;
		this.surname = surname;
		this.captainYears = captainYears; 
		this.salary = salary;
}

	public void setNames(String surname, String name) {
		this.surname = surname;
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setSalary(double salary) {
		if (salary >= 0) {
		this.salary = salary;
		}
	}

	public double getSalary(double salary) {
		return salary;
	}

	public void setcaptainYears(int captainYears) {
		int length = String.valueOf(captainYears).length();
		if (length == 4) {
			this.captainYears = captainYears;
		}
	}

	public int getcaptainYears(int captainYears) {
		return this.captainYears;
	}

	public String getVollname(String surname, String name) {
		return (surname + " " + name);
	}
}