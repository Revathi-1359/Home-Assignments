package com.testleaf.week3.day2;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String text1= "stops";
        String text2 = "potss";


   if(text1.length()==text2.length())
   {
System.out.println("Continue");
   }
   
   else
   {
   System.out.println("The lengths mismatch, therefore the strings are not an Anagram");
   }
    char[] arr1 = text1.toCharArray();
    char[] arr2 = text2.toCharArray();
    {
        System.out.println(arr1);
        System.out.println(arr2);

    }

    Arrays.sort(arr1);
    Arrays.sort(arr2);
    

    System.out.println(arr1);
    System.out.println(arr2);

    

       if (Arrays.equals(arr1,arr2))

      {
        System.out.println("The given strings are Annagram");
      }
      
      else

      {
        
      System.out.println("The given strings are not Annagram");

      }
      
}

}
    


