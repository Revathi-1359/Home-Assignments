package com.testleaf.week3.day2;

public class LoginTestData extends TestData {

    public static void enterUsername(){
        System.out.println("Enter the username");
    }
    public static void enterPassword(){
        System.out.println("Enter the Password");
    }
    public static void main(String[] args) {
        LoginTestData login = new LoginTestData();
        login.enterUsername();
        login.enterPassword();
        login.enterCredentials();
        login.navigateToHomepage();
    
 }

}
