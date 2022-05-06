import java.util.Scanner;
import java.lang.Math;
public class volumen {
public static void main(String[] args) {
double erg;
double radius;
Scanner eingabe = new Scanner(System.in);
System.out.print("was ist der Radius?: ");
radius = eingabe.nextDouble();
eingabe.close();
erg = volumenBerechnen(radius);
System.out.println("das volumen beträgt: " + erg);
}
public static double volumenBerechnen(double r) {
double pi = Math.PI;
double volumen = (4 / 3) * pi * Math.pow(r, 3);
return volumen;
}
}

