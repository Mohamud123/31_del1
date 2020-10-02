package Spil;

import java.util.Random;

public class Dice {

    public static void main(String[] args) {
       Random r = new Random();
       int result = r.nextInt(6);
        int result2 = r.nextInt(6);
        result2++;
       result++;
        System.out.println("Du rullede " + result);
        System.out.println("Du rullede " + result2);
        int sum = result + result2;
        System.out.println("Samlede resultat " + sum);
       }
    }