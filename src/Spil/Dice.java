package Spil;

import java.util.Random;

public class Dice {

    public static void main(String[] args) {
        Random r = new Random();
        int førsteresult = r.nextInt(6);
        int andetresult = r.nextInt(6);
        andetresult++;
        førsteresult++;
        System.out.println("Spiller 1: første terning: " + førsteresult + ". Anden terning: " + andetresult);
        int sum = førsteresult + andetresult;
        System.out.println("Spiller 1 rullede i alt: " + sum);

        int førsteresult2 = r.nextInt(6);
        int andetresult2 = r.nextInt(6);
        andetresult2++;
        førsteresult2++;
        System.out.println("Spiller 2: første terning: " + førsteresult2 + ". Anden terning: " + andetresult2);
        int sum2 = førsteresult2 + andetresult2;
        System.out.println("Spiller 2 rullede i alt: " + sum2);
    }
}