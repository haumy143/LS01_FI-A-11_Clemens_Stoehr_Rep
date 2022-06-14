import Captain;

public class TestCaptain {

	public static void main() {
		//Erzeugen der Objekte
			Captain cap1 = new Captain ( "Jean Luc", "Picard", 2364, 4500.0);
			Captain cap2 = new Captain ( "Azetbur", "Gorkon", 2373, 0.0);
			Captain cap3 = new Captain("Clemi", "Stoehr", 2369, 3000.0);
			Captain cap4 = new Captain("Babo", "Frik", 2354,2600.0);				Captain cap5 = new Captain("Obi", "Wan", 2356,2940.0);
		    //Bildschirmausgabe
		    System.out.println("Name: " + cap1.getSurame());
		    System.out.println("Vorname: " + cap1.getName());			    System.out.println("Kapit�n seit: " + cap1.getCaptainYears());
			System.out.println("Gehalt: " + cap1.getSalary() + " F�derationsdukaten");
		    System.out.println("Vollname: " + cap1.vollname());
		    System.out.println(cap1 + "\n"); //Die toString() Methode wird aufgerufen
	        System.out.println("\nName: " + cap2.getSurname());
			System.out.println("Vorname: " + cap2.getName());
		    System.out.println("Kapit�n seit: " + cap2.getCaptainYears());
		    System.out.println("Gehalt: " + cap2.getSalary() + " Darsek");
		    System.out.println("Vollname: " + cap2.vollname());
			System.out.println(cap2 + "\n"); //Die toString() Methode wird aufgerufen

		    System.out.println("\nName: " + cap4.getSurname());
		    System.out.println("Vorname: " + cap4.getName());
		    System.out.println("Kapit�n seit: " + cap4.getCaptainYears());
		    System.out.println("Gehalt: " + cap4.getSalary() + " Darsek");
			System.out.println("Vollname: " + cap4.vollname());
		    System.out.println(cap2 + "\n"); //Die toString() Methode wird aufgerufen
		    
		  	System.out.println("\nName: " + cap5.getSurname());
			System.out.println("Vorname: " + cap5.getName());
		  	System.out.println("Kapit�n seit: " + cap5.getCaptainYears());
		  	System.out.println("Gehalt: " + cap5.getSalary() + " Darsek");
		  	System.out.println("Vollname: " + cap5.vollname());
			System.out.println(cap5 + "\n"); //Die toString() Methode wird aufgerufen
			}

		}