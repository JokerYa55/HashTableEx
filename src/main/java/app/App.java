package app;

import app.hash.HashTableEx;
import java.util.Random;

/**
 *
 * @author vasil
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashTableEx<String, Integer> hash = new HashTableEx(10);
        Random random = new Random();
        int[] num = random.ints(0, 999999).limit(1000).toArray();

        for (int i = 0; i < 1000; i++) {
            hash.put(String.valueOf(num[i]), i);
        }

        System.out.println("item = " + hash.get("100"));
    }

}
