package com.teachmeskills.lesson_13.examination;

import com.teachmeskills.lesson_13.authorization.Authorization;
import com.teachmeskills.lesson_13.exceptions.WrongLoginException;
import com.teachmeskills.lesson_13.exceptions.WrongPasswordException;

public class Examination {

    public static boolean checkForLogin(String login) {
        return !(login.length() > 20 & login.contains(" "));
    }

    public static boolean checkForLogin2(String login) {

        char[] chars = login.toCharArray();

        for (char c : chars) {
            if (c == ' ' & login.length() > 20) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkForPassword(String password) {
        return !(password.length() > 20 & password.contains(" ") & !password.matches(".*\\d.*"));
    }

    public static void resultOFChecking() throws WrongLoginException, WrongPasswordException {

        String login = Authorization.Login();
        String password = Authorization.Password();

        int method = Authorization.SelectingMethod();

        boolean isLoginValid = (method == 1) ? checkForLogin(login) : checkForLogin2(login);

        if (!isLoginValid) {
            throw new WrongLoginException("Login failed verification.");
        }
        System.out.println("Login has been verified");

        if (!checkForPassword(password)) {
            throw new WrongPasswordException("Password failed verification.");
        }
        System.out.println("Password has been verified");
    }
}
