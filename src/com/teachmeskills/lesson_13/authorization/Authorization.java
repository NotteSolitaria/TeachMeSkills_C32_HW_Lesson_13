package com.teachmeskills.lesson_13.authorization;

import com.teachmeskills.lesson_13.exceptions.WrongPasswordException;

import java.util.Scanner;

public class Authorization {

    static Scanner scanner = new Scanner(System.in);

    public static String Login() {
        System.out.println("Enter login:");
        return scanner.nextLine();
    }

    public static String Password() throws WrongPasswordException {

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        System.out.println("Confirm password");
        String confirmPassword = scanner.nextLine();

        if (password.equals(confirmPassword)) {
            return password;
        } else {
            throw new WrongPasswordException("Passwords do not match.");
        }
    }

    public static int SelectingMethod() {
        System.out.println("Select verification method:");

        int methodChoose = scanner.nextInt();

        if (methodChoose <= 2 & methodChoose != 0) {
            return methodChoose;
        } else {
            System.out.println("Incorrect choice of method.");
            return SelectingMethod();
        }
    }
}
