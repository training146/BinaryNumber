package com.company;
//Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.

import java.util.Scanner;

public class BinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате:");
        String bin = sc.nextLine();
        int bNum = Integer.parseInt(bin, 2);
        System.out.println(bNum);
    }
}
