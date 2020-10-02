package Spil;

import java.util.Random;

public class Dice
{

    public static void main(String[] args)
    {
        Random r = new Random();
        // to terninger per spiller
        int firstResultP1;
        int secondResultP1;
        int firstResultP2;
        int secondResultP2;

        int sumP1 = 0;
        int sumP2 = 0;

        // spil, indtil en vinder er fundet
        while (sumP1 < 40 || sumP2 < 40)
        {
            // nextInt bound 6 giver 0-5. +1 = 1-6.
            firstResultP1 = r.nextInt(6) + 1;
            secondResultP1 = r.nextInt(6) + 1;

            System.out.println("Spiller 1: Første terning: " + firstResultP1 + ". Anden terning: " + secondResultP1);
            sumP1 = sumP1 + firstResultP1 + secondResultP1;
            System.out.println("Spiller 1's point er nu: " + sumP1);

            firstResultP2 = r.nextInt(6) + 1;
            secondResultP2 = r.nextInt(6) + 1;

            System.out.println("Spiller 2: Første terning: " + firstResultP2 + ". Anden terning: " + secondResultP2);
            sumP2 = sumP2 + firstResultP2 + secondResultP2;
            System.out.println("Spiller 2's point er nu: " + sumP2);
        }
        // Spiller med den højeste værdi vinder, giv besked til vinderen
        if (sumP1 > sumP2)
        {
            System.out.println("Tillykke spiller 1, du har vundet!");
        } else
        {
            System.out.println("Tillykke spiller 2, du har vundet!");
        }
    }
}