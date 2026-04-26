package com.testleaf.week3.day2;

public class countTheCharacterInTheString{
    public static void main(String[] args) {
        String input = "TestLeaf";
        char target = 'e';
        int count = 0;
        char[] charArray = input.toCharArray();
        for(int i = 0; i<input.length(); i++){

            if(charArray[i]== target)
            {
            
            count++;

            }

        }

        System.out.println("The target e appaers"+" "+count+" "+"times in the String");
        
    }

}
