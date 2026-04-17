package com.testleaf.week3.day2;

public class TextField extends WebElement {
    public static void getText(){
        System.out.println("Get Text");
    }

    public static void main(String[] args) {
        TextField tf = new TextField();
        tf.getText();
        tf.click();
        tf.setText();
        
    }

}
