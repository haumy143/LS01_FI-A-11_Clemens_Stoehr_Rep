import java.util.Scanner;

public class rom {
    public static void main(String[] args) {
    
        System.out.println("Gib mir eine roemische zahl :)");
        Scanner eingabe = new Scanner(System.in);
        String zahlrom = eingabe.next()

        String zahldec;

        switch (zahlrom) {
            case 1:
                zahldec = "";
                break;
            case 2:
                zahldec = "";
                break;
            case 3:
                zahldec = "";
                break;
            case 4:
                zahldec = "";
                break;
            case 5:
                zahldec = "";
                break;
            case 6:
                zahldec = "";
                break;    
            default:
            zahldec ="Falsches Format";
            }


    }
    
}