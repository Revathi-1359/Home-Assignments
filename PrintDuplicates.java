package com.testleaf.week3.day1;

import java.util.Arrays;

public class PrintDuplicates {
    public static void main(String[] args) {
        int[] numbers = {2,5,7,7,5,9,2,3};{
            System.out.println(Arrays.toString(numbers));
        }
    
        Arrays.sort(numbers);{
            System.out.println("After sorting the given number in Ascending order:"+Arrays.toString(numbers));
        }
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1; j<numbers.length;j++)
            
        
        if(numbers[i]==numbers[j]){
            System.out.println(numbers[i]);
        }
 
}
}
}
