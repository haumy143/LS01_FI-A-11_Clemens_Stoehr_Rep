import java.util.Scanner;

public class Noten {
    public static void main(String[] args) {
        System.out.println("Welche Note hast du bekommen? (1-6");
        Scanner eingabe = new Scanner(System.in);
        int note = eingabe.nextInt();
        eingabe.close();

        String bewertung;

        switch (note) {
            case 1:
                bewertung = "Sehr gut";
                break;
            case 2:
                bewertung = "Gut";
                break;
            case 3:
                bewertung = "Befriedigend";
                break;
            case 4:
                bewertung = "Ausreichend";
                break;
            case 5:
                bewertung = "Mangelhaft";
                break;
            case 6:
                bewertung = "Ungenügend";
                break;    
            default:
            bewertung ="Nicht bewertet";
    }
    System.out.println("Das ist " + bewertung);
}
}
