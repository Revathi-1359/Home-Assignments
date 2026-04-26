package Week4.day1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumberinList {

    public static void main(String[] args) {
        List<Integer> MyNum = new ArrayList<Integer>();
        MyNum.add(3);
        MyNum.add(2);
        MyNum.add(11);
        MyNum.add(4);
        MyNum.add(6);
        MyNum.add(7);
        System.out.println(MyNum);
        Collections.sort(MyNum);
        System.out.println(MyNum);
        System.out.println(MyNum.size());
        int result = MyNum.get(MyNum.size()-2);
        System.out.println("The second largerst numberis :"+result);
        
        
    }
}


