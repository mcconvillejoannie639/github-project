// Java code for generating a random number between 1 and 10
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt((10 - 1) + 1) + 1;
        System.out.println("Random number: " + randomNum);
    }
}
