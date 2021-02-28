package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть ціле число-->");
            int num = scanner.nextInt();
            if (num % 1 == 0){
            if (num % 2 == 0){
                System.out.println("parne");

            }else {
                System.out.println("ne parne");

            }

            }else {
                System.out.println("vu vvelu ne chile chuslo");
            }



    }
}
