package Spil;

import java.util.Random;

public class Dice {

    public static void main(String[] args) {
        Random r = new Random();
        int sum = 0;
        int sum2 = 0;

         while (sum < 40){
            int førsteresult = r.nextInt(6);
            int andetresult = r.nextInt(6);
            andetresult++;
            førsteresult++;
            System.out.println("Spiller 1: første terning: " + førsteresult + ". Anden terning: " + andetresult);
            sum = sum + førsteresult + andetresult;
            System.out.println("Spiller 1 rullede i alt: " + sum);
        }

        while (sum2 < 40) {
            int førsteresult2 = r.nextInt(6);
            int andetresult2 = r.nextInt(6);
            andetresult2++;
            førsteresult2++;
            System.out.println("Spiller 2: første terning: " + førsteresult2 + ". Anden terning: " + andetresult2);
            sum2 = sum2 + førsteresult2 + andetresult2;
            System.out.println("Spiller 2 rullede i alt: " + sum2);
        }
    }
}