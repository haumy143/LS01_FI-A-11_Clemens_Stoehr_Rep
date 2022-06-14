import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            myList.add(i, getRandomInt(9));
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.printf("myList %2d : %3d\n", i, myList.get(i));
        } 

        System.out.printf("Eine Zahl 1 - 9: ");
        int Zahl = scanner.nextInt();
        int counter = 0;
        
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) == Zahl) {
                counter++;
                myList.remove(i);
            }
        }

        System.out.println("Die Zahl " + Zahl + " kommt " + counter + " mal vor");

        for (int i = 0; i < myList.size(); i++) {
            System.out.printf("myList %2d : %3d\n", i, myList.get(i));
        } 

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) == 5) {
                myList.add(i++ , 0);
            }
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.printf("myList %2d : %3d\n", i, myList.get(i));
        } 
    }

    public static int getRandomInt(int max) {
        return(int) Math.floor(Math.random() * max);
    }

}
