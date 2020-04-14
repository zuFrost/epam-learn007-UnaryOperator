package com.zufrost.learn;

public class LearnMainUnaryOperator {

    public static void main(String[] args) {
        int x = 1;
        int y = ++x; // x == 2   y == 2
        x = x + 1; // 3
        x += 2; // 5

        float f = 5;
        byte b = 15;
         b /= f; // 3
        System.out.println(b);

        b = 15;
        b /= 6.8;
        System.out.println(b);

        x = 1;
        x = x++;
        System.out.println("x= " + x);
    }
}
