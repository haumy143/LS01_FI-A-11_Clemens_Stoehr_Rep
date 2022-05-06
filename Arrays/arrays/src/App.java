import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int ersteZahl;
        int zweiteZahl;
        int zählerUngerade = 0;
        int zählerGerade = 0;
        
        Scanner eingabe = new Scanner(System.in);
        System.out.println("bitte gib eine erste zahl ein: ");
        ersteZahl = eingabe.nextInt();
        System.out.println("bitte gib eine zweite zahl ein: ");
        zweiteZahl = eingabe.nextInt();
        
        if (ersteZahl == zweiteZahl) {
            System.out.println("die beiden zahlen sind gleich groß");
        }
        
        if (ersteZahl > zweiteZahl) {
            int temp;
            temp = ersteZahl;
            ersteZahl = zweiteZahl;
            zweiteZahl = temp;
            }
        System.out.println("die ungerade zahlen zwischen " + ersteZahl + " und " + zweiteZahl + " sind: ");
        
        for (int i = ersteZahl; i < zweiteZahl; i++) {
            if (i%2!= 0) {
                System.out.println(i);
                zählerUngerade = zählerUngerade + 1;                  
            }
            else {
                zählerGerade = zählerGerade + 1;
            }
        }
        System.out.println("zwischen den beiden Zahlen sind " + zählerUngerade + " ungrade Zahlen und " + zählerGerade + " gerade Zahlen");    
    }
}
    
    

