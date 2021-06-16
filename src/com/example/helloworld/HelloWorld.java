package com.example.helloworld;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        int idade;
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, World! That's my first program in Java.");

        System.out.print("So, tell my your age: ");
        idade = sc.nextInt();

        if (idade >= 18){
            System.out.println("You're an adult!");
        }
        else
        {
            System.out.println("You're an underage!");
        }
    }
}
