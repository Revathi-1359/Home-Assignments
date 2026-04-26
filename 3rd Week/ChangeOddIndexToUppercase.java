package com.testleaf.week3.day2;

public class ChangeOddIndexToUppercase {
    public static void main(String[] args) {
        
        String test = "changeme";

        char[] arr1 = test.toCharArray();
        System.out.println(arr1);
        for(int i=arr1.length-1; i>=0; i--)
        {
            if(i %2 ==1)

                arr1[i] = Character.toUpperCase(arr1[i]);
    
                System.out.print(arr1[i]);


            }

        }
    }



