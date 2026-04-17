package com.testleaf.week3.day2;

public class Button extends WebElement{

    public static void submit(){
        System.out.println("Submit");
    }
    public static void main(String[] args) {
        Button b = new Button();
        b.submit();
        b.click();
        b.setText();
    }


}
