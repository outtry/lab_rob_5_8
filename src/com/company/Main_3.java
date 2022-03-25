package com.company;

import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {
        System.out.println("Підніматися чи Опускатися :");
        Scanner scanner_2 = new Scanner(System.in);
        String i_2 = scanner_2.nextLine();

        System.out.println("Виберіть поверх який хочете відвідати :");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();



        if(i_2.equals("Підніматися")){
            if(i > 9 || i < 1){
                System.out.println("Ви вказали не існуючий поверх");
            } else if(i == 2){
                System.out.println("Нажаль на даний момент ліфт не піднімається на 2 поверх");
                System.out.println("Піднімаємося на 3 поверх");

            }else if(i == 1){
                System.out.println("Не можна підніматися на перший поверх");

            }else System.out.println("Піднімаємося на " + i +" поверх");
        }

        if (i_2.equals("Опускатися")){
            if(i > 9 || i < 1){
                System.out.println("Ви вказали не існуючий поверх");
            }else if(i == 2){
                System.out.println("Нажаль зараз ліфт не опускається на 2 поверх");
                System.out.println("Опускаємося на 1 поверх");
            }else if(i == 9){
                System.out.println("Не можна опускатися на девятий поверх");
            } else System.out.println("Опускаємося на " + i + " поверх");

        }



    }
}
