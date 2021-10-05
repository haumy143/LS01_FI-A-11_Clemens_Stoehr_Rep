import java.util.Scanner;
public class Konsoleneingabe{

public static void main(String[] args) {
    
    System.out.println("gebe eine zahl eine Zahl ein");
    Scanner eingabe = new Scanner(System.in);
    double zahl1 = eingabe.nextDouble();
    // eingabe.close();
    
    System.out.println("gebe eine weitere Zahl ein");
    double zahl2 = eingabe.nextDouble();
    
    System.out.println("welche operation");
    String operator = eingabe.next();
    eingabe.close();
    
    System.out.println(zahl1 + " " + operator + " " + zahl2);
    
    double ergebnis = 0;

    switch (operator) {
        case "+":
            ergebnis = zahl1 + zahl2;
            break;
        case "-":
            ergebnis = zahl1 - zahl2;
            break;
        case "*":
            ergebnis = zahl1 * zahl2;
            break;
        case "/":
            ergebnis = zahl1 / zahl2;
            break;
        default:
            System.out.println("illegal operand");
    }
    
    System.out.println(ergebnis);


    }
    
}