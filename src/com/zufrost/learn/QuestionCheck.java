package com.zufrost.learn;

public class QuestionCheck {
    public static void main(String[] args) {
        long a = Long.remainderUnsigned(-2, 3); // 0
        int b = Integer.remainderUnsigned(-2, 3); // 0
        int c = -2 % 3;
        System.out.print(a + " " + b + " " + c);
    }
}
