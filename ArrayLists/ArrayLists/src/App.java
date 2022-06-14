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
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) == Zahl) {
                counter++;
                indexes.add(i);
            }
        }

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) == Zahl) {
                myList.remove(i);
                i--;
            }
        }

        System.out.println("Die Zahl " + Zahl + " kommt " + counter + " mal vor");
        System.out.println("an den Stellen: ");
        for (int i = 0; i < indexes.size(); i++) {
            System.out.println(indexes.get(i));

        }
        System.out.println("########### Zahl löschen ##################");

        for (int i = 0; i < myList.size(); i++) {
            System.out.printf("myList %2d : %3d\n", i, myList.get(i));
        } 

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) == 5) {
                myList.add(i + 1 , 0);
            }
        }

        System.out.println("############ null nach 5 #################");

        for (int i = 0; i < myList.size(); i++) {
            System.out.printf("myList %2d : %3d\n", i, myList.get(i));
        } 
    }

    public static int getRandomInt(int max) {
        return(int) Math.floor(Math.random() * max) +1;
    }
}
