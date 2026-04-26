package Week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {
    public static void main(String[] args) {
        List<Integer> mynum = new ArrayList<Integer>();
        mynum.add(1);
        mynum.add(2);
        mynum.add(3);
        mynum.add(4);
        mynum.add(10);
        mynum.add(6);
        mynum.add(8);
        System.out.println(mynum);

        Collections.sort(mynum);
        System.out.println(mynum);

        for (int i : mynum){
            System.out.println(i);

        }
        for(int i =0;i<mynum.size();i++){
            int current = mynum.get(i);
            int nextnumber = mynum.get(i+1);

        
        if(current+1 != nextnumber){
            System.out.println("Missing Number:"+(current+1));
        }
            
        }

        }
    


        
        
    }


