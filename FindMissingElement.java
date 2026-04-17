package com.testleaf.week3.day1;

import java.util.Arrays;

import org.openqa.selenium.devtools.v129.domsnapshot.model.ArrayOfStrings;

public class FindMissingElement {
    public static void main(String[] args) {
        int a[]={ 1,4,3,2,8,6,7};
        {
        System.out.println(Arrays.toString(a));
        }

        Arrays.sort(a);
        {
            System.out.println("The sorted array in Ascending order is:"+(Arrays.toString(a)));
        }

        for(int i=a[0]; i<=a.length-1; i++){
            if(a[i - a[0]] != i)
            
            {
            System.out.println (i);
            break;
            }
            
    }

}

}
