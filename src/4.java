import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 20;
        Random random = new Random();
        int randomNum = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        System.out.println("Random number: " + randomNum);
    }
}