import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> myList = new ArrayList<Integer>();

        for (int i = 0; i < myList.size(); i++) {
            myList.add(i, getRandomInt(9));
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        } 
    }
    public static int getRandomInt(int max) {
        return(int) Math.floor(Math.random() * max);
    }
}
