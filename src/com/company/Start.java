package com.company;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ціле число-->");
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num % 1 == 0 ) {

        } else {
            System.out.println("Vvedit chile chuslo");
        }
        if (num2 % 1 == 0 ) {

        } else {
            System.out.println("Vvedit chile chuslo");
        }
        System.out.println(num + num2 );
    }
}
