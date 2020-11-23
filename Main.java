package com.company;

import java.util.Scanner;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String s;
        Scanner check = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        String array[] = new String[size + 1];

        System.out.println("Введите код страны");
        Scanner scan = new Scanner(System.in);
        s = scan.nextLine();
        System.out.println("Введите номер телефона:");
        for (int i = 0; i <= size; i++) {
            array[i] = input.nextLine();
        }
        if (array[1].contains(s)){
            System.out.println("+"+array[1]+" "+array[2]+array[3]+array[4]+" "+array[5]+array[6]+array[7]+" "+array[8]+array[9]+array[10]+array[11]);
        }



    }
}
