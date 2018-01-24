package com.frezer;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String user;
        String pass;

        System.out.println("Enter your name!");
        user = input.nextLine();

        System.out.println("Enter your Password!");
        pass = input.nextLine();

        if ("csc". equals (user) && "201".equals(pass)) {
            System.out.println("Welcome to " + user +"201 class!");
        }else {
            System.out.println("Invalid Username or Password!");
        }
    }
}