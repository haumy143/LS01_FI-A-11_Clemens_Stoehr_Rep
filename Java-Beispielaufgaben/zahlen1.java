
public class zahlen1 {

	public static void main(String[] args) {
System.out.print("Hello\n");
System.out.println("Welt");
System.out.printf("");

//Rechnung
int zahl0 = 6;
int zahl1 = 3;
int zahl2 = 9;
int summe = zahl0 + zahl1 + zahl2; //zwei zahlen addieren

System.out.println("ist gleich " + summe);

//berechnung mit float
float f1 = 23;
float f2 = 42;
float f3 = 4342423;
float f4 = 938;
float f5 = 439487438;
float f6 = 3292892;
float x1 = f1 + f2 + f3 + f4 + f5 + f6;
System.out.printf("Ergebniss fuer float ist %f\n", x1);


//berechnung mit double
double d1 = 23;
double d2 = 42;
double d3 = 4342423;
double d4 = 938;
double d5 = 439487438;
double d6 = 3292892;
double x2 = d1 + d2 + d3 + d4 + d5 + d6;
System.out.printf("Ergebniss fuer double ist %f\n", x2);

if (x2 > x1) {
	System.out.println("float ist um " + (x2 - x1) + " kleiner als double");
}
else {
	System.out.println("irgendwas stimmt hier nicht"); //double ist aufgrund des größeren zahlenraums bei hohen zahlen größer weil durch runden nichts verloren geht
	
	}
}
}
