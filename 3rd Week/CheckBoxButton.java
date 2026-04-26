package com.testleaf.week3.day2;

public class CheckBoxButton extends Button {
    public static void clickCheckButton(){
        System.out.println("click Check Button().");
    }

    public static void main(String[] args) {
        CheckBoxButton cbb = new CheckBoxButton();
        cbb.clickCheckButton();
        cbb.submit();
    }

}
