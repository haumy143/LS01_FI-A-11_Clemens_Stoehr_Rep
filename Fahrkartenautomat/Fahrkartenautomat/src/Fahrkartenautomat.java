import java.util.Scanner;

// import javax.print.event.PrintEvent;

class Fahrkartenautomat
{
    public static void main(String[] args)
    {
        double zuZahlenderBetrag; 
        double rückgabebetrag;
        Scanner tastatur = new Scanner(System.in);

        zuZahlenderBetrag = erfassungBestellung();
        rückgabebetrag = bezahlvorgang(zuZahlenderBetrag);
        fahrscheinausgabe();
        rückgeldberechnung(rückgabebetrag);
        guteFahrt();

        tastatur.close();
    }

    public static double erfassungBestellung() {
        Scanner tastatur = new Scanner(System.in);
        double ticketPreis;
        double anzahlTickets;
        double zuZahlenderBetrag;

        
        System.out.print("Wie viel kostet das ein Ticket?: ");
        ticketPreis = tastatur.nextDouble();
        System.out.print("Wie viele Tickets brauchen Sie: ");
        anzahlTickets = tastatur.nextDouble();
        zuZahlenderBetrag = ticketPreis * anzahlTickets;
        return zuZahlenderBetrag;

    } 

    public static double bezahlvorgang(double zuZahlenderBetrag) {
        double eingezahlterGesamtbetrag;
        double eingeworfeneMünze;
        double rückgabebetrag;
        
        Scanner tastatur = new Scanner(System.in);

        eingezahlterGesamtbetrag = 0.0;

        while(eingezahlterGesamtbetrag < zuZahlenderBetrag)
        {
            System.out.printf("Noch zu zahlen: %.2f Euro\n", zuZahlenderBetrag - eingezahlterGesamtbetrag);
            System.out.print("Eingabe (mind. 5Ct, höchstens 2 Euro): ");
            eingeworfeneMünze = tastatur.nextDouble();
            eingezahlterGesamtbetrag += eingeworfeneMünze;
        }
        rückgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
        return rückgabebetrag;
    }

    public static void fahrscheinausgabe() {
        System.out.println("\nFahrschein wird ausgegeben");
        for (int i = 0; i < 8; i++)
        {
        System.out.print("=");
        try {
			Thread.sleep(250);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
        System.out.println("\n\n");
    }

    public static void rückgeldberechnung(double rückgabebetrag) {

        if(rückgabebetrag > 0.0)
        {
            System.out.printf("Der Rückgabebetrag in Höhe von %.2f Euro\n", rückgabebetrag);
            System.out.println("wird in folgenden Münzen ausgezahlt:");

            while(rückgabebetrag >= 2.0) // 2 EURO-Münzen
            {
                System.out.println("2 EURO");
                rückgabebetrag -= 2.0;
            }
            while(rückgabebetrag >= 1.0) // 1 EURO-Münzen
            {
                System.out.println("1 EURO");
                rückgabebetrag -= 1.0;
            }
            while(rückgabebetrag >= 0.5) // 50 CENT-Münzen
            {
                System.out.println("50 CENT");
                rückgabebetrag -= 0.5;
            }
            while(rückgabebetrag >= 0.2) // 20 CENT-Münzen
            {
                System.out.println("20 CENT");
                rückgabebetrag -= 0.2;
            }
            while(rückgabebetrag >= 0.1) // 10 CENT-Münzen
            {
                System.out.println("10 CENT");
                rückgabebetrag -= 0.1;
            }
            while(rückgabebetrag >= 0.05)// 5 CENT-Münzen
            {
                System.out.println("5 CENT");
                rückgabebetrag -= 0.05;
            }
        }

    }

    public static void guteFahrt() {
        System.out.println("\nVergessen Sie nicht, den Fahrschein\n"+
                            "vor Fahrtantritt entwerten zu lassen!\n"+
                            "Wir wünschen Ihnen eine gute Fahrt.");
    }
}