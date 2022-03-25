package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ведіть число з проміжку (25 - 100)");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        if(i > 100) System.out.println("Число " + i + " не міститься в проміжку(25 - 100)");
        else if (i < 25) System.out.println("Число " + i + " не міститься в проміжку(25 - 100)");
        else {
            System.out.println("Число " + i + " міститься в проміжку (25 - 100)");
        }

    }
}