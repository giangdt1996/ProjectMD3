package ra.view;

import ra.config.InputMethods;

public class Navbar {
    public static void menuStore(){
        System.out.println("------------Menu Store------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. View Product");
        System.out.println("4. Exit");
    } public static void menuUser(){
        System.out.println("------------Menu User------------");

    } public static void menuAdmin(){
        System.out.println("------------Menu Admin------------");
    } public static void signInForm(){
        System.out.println("------------Sign In------------");
        System.out.println("Enter your username");
        String userName = InputMethods.getString();
        System.out.println("Enter your password");
        String passWord = InputMethods.getString();

    } public static void signUpForm(){
        System.out.println("------------Sign Up------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. View Product");
        System.out.println("4. Exit");
    }
}
