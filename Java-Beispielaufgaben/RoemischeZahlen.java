import java.util.Scanner;

public class RoemischeZahlen {
    public static void main(String[] args) {
    
        System.out.println("Gib mir eine roemische zahl");
        Scanner eingabe = new Scanner(System.in);
        String zahlrom = eingabe.next();
        eingabe.close();

        char[] zahlromarray = zahlrom.toCharArray();
        
        double zahldec = 0;
        
        
        for(char c: zahlromarray){
        
            if( c == 'I')
                zahldec = zahldec +1;
            
            if( c == 'V')
                zahldec = zahldec +5;
            
            if( c == 'X')
                zahldec = zahldec +10;            
            
            if( c == 'L')
                zahldec = zahldec +50;
            
            if( c == 'C')
                zahldec = zahldec +100;
            
            if( c == 'D')
                zahldec = zahldec +500;
            
            if( c == 'M')
                zahldec = zahldec +1000;            
        }    
            
        System.out.println(zahlrom + " ist in decimal " + zahldec); 
    }
}    