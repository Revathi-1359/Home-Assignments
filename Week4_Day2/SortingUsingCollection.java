package Week4.day1;

import java.util.ArrayList;
import java.util.Collections;

public class SortingUsingCollection {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("HCL");
        names.add("Wipro");
        names.add("Aspire System");
        names.add("CTS");
        System.out.println(names);
        
    
    Collections.sort(names);
    System.out.println("In Ascending order"+names);

    Collections.sort(names,Collections.reverseOrder());
    System.out.println("In Reverse Order:"+names);

}
}
