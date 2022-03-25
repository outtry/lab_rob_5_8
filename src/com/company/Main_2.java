package com.company;
import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        System.out.println("Ведіть  трьохзначне число: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int a_1 = a / 100;
        int a_2 = a % 100 / 10;
        int a_3 = a % 10;
        int a_1_2 = Math.max(a_1, a_2);
        System.out.println(Math.max(a_1_2, a_3));
    }
}
