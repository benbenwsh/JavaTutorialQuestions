package src;

import java.util.Random;

public class Q4c70 {

    public static void main(String[] args) {
        lotteryNumbers();
    }

    public static void lotteryNumbers() {
        final Random generator = new Random();
        final int upper = 49;

        for (int i = 1; i < 7; i++) {
            // Forgot to put brackets around the last two elements and it
            // concatenated the 1 with the random number instead of adding
            // them arithmetically
            System.out.println("Number " + i + ": " + (generator.nextInt(upper) + 1));
        }
        int bonusNo = generator.nextInt(upper) + 1;
        System.out.println("Bonus Number: " + bonusNo);
    }
}
