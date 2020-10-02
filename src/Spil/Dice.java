package Spil;

import java.util.Random;

public class Dice {

    public static void main(String[] args) {
       Random r = new Random();
       int result = r.nextInt(12);
       result++;
        System.out.println("Du rullede " + result);
       }
    }