import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < myList.size(); i++) {
            myList.add(i, getRandomInt(9));
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.printf("myList %2d : %3d\n", i, myList.get(i));
        } 

        System.out.println("Eine Zahl 1 - 9: ");

    }

    
    public static int getRandomInt(int max) {
        return(int) Math.floor(Math.random() * max);
    }
}
