public class App {
    public static void main(String[] args) throws Exception {
        int[] zahlen = {1, 6, 3, 7, 2, 2, 4, 8}; 
        System.out.println(zahlen.length);
        for (int i = 0; i<=7; i++){
        System.out.print(zahlen[i] + ", ");
        }
        System.out.println("");

        // jede zweite zahl beginnend mit der zweiten
        for (int i = 1; i<=zahlen.length; i+=2){ 
        System.out.print(zahlen[i] + ", ");
        }
        System.out.println("");
        // es wird bis lenth 4 ausgegeben also 5 stellen
        for (int i = 0; i<=zahlen.length/2; i++){
        System.out.print(zahlen[i] + ", ");
}
        System.out.println("");
        
        for (int i = zahlen.length - 1; i>= 0; i--){
        System.out.print(zahlen[i] + ", ");
}
        System.out.println("");
        for (int i = 1; i < zahlen.length; i+=3){
        System.out.print(zahlen[i] + ", ");
        }
        
        // for (int i = zahlen.length - 1; i>= 0; i/=2){
        // System.out.print(zahlen[i] + ", ");}

    }
}
