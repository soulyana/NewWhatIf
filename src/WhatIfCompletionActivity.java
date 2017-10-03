import java.util.Scanner;

public class WhatIfCompletionActivity {
    public static void main(String[] args) {
        int num1, num2;
        int sum, product, average;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First Number? :");
        num1 = keyboard.nextInt();

        System.out.print("Last Number?  :");
        num2 = keyboard.nextInt();

        sum = num1 + num2;
        product = num1 * num2;
        average = sum / 2;

        if (sum > 200 && sum < 1000) {
            System.out.println("Sum = " + sum + "*~");
        }else if (sum > 200) {
            System.out.println("Sum = " + sum + "*");
        }else if (sum < 1000) {
            System.out.println("Sum = " + sum + "~");
        } else {
            System.out.println("Sum = " + sum);
        }
        if(num2 > 3000) {
            System.out.println("Wow, you chose a big number. " + num2 + " is number 2.");
        }
    }
}