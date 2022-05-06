
public class Captain {

	private String surname;
	private String name;
	private int captainYears;
	private double gehalt;

	public void setNames(String surname, String name) {
		this.surname = surname;
		this.name = name;
	}

	public void setAll(String surname, String name, int captainYears, double gehalt) {
		this.surname = surname;
		this.name = name;
		this.captainYears = captainYears;
		this.gehalt = gehalt;
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

	public void setSalary(double gehalt) {
		if (gehalt >= 0) {
		this.gehalt = gehalt;
		}
	}

	public double getSalary(double gehalt) {
		return gehalt;
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