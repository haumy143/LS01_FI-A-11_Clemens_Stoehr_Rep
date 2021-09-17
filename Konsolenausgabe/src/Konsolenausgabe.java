package src;

public class Konsolenausgabe {
    public static void main(String[] args) throws Exception {
        String bsp1 = "Das ist ein Beispielsatz";
        String bsp2 = "Ein Beispielsatz ist das.";

        System.out.println(bsp1);
        System.out.println(bsp2);
        System.out.printf("%s", "Das ist ein \"Beispielsatz\". \nEin Beispielsatz ist das.\n");
        //println fügt nach der ausgabe einen Zeilenumruch hinzu
        
        String Sternchen = "*************";

        System.out.printf("%7.1s\n", Sternchen);
        System.out.printf("%8.3s\n", Sternchen);
        System.out.printf("%9.5s\n", Sternchen);
        System.out.printf("%10.7s\n", Sternchen);
        System.out.printf("%11.9s\n", Sternchen);
        System.out.printf("%12.11s\n", Sternchen);
        System.out.printf("%13.13s\n", Sternchen);
        
    }
}
