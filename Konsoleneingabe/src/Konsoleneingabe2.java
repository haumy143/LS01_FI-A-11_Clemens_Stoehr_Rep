import java.util.Scanner;

public class Konsoleneingabe2{

public static void main(String[] args) {
    
    Scanner myScanner = new Scanner(System.in);

    String name;

    System.out.print("Geben Sie einen Namen ein: ");
    name = myScanner.next();
    System.out.println("hallo " + name);

    int alter;

    System.out.print("geben sie ihr alter ein: ");
    alter = myScanner.nextInt();
    alter = alter +1;
    System.out.println("nächstes jahr bist du dann " + alter);

    float koerpergroeße;

    System.out.print("geben sie ihre größe ein:");
    koerpergroeße = myScanner.nextFloat();
    System.out.println("wow " + koerpergroeße + " ist ziemlich groß :)");

    System.out.print("geben sie ihr geschlecht ein (w/m/d): ");
    char geschlecht;
    geschlecht = myScanner.next().charAt(0);
    System.out.println(geschlecht);

    myScanner.close();
}
    
}