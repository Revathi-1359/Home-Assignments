package com.testleaf.week3.day2;

public class RadioButton  extends Button{
    public static void selectRadioButton(){
        System.out.println("select Radio Button");
    }
    public static void main(String[] args) {
        RadioButton rb = new RadioButton();
        rb.selectRadioButton();
        rb.submit();

    }

}
