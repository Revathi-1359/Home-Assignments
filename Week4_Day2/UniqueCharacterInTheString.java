package Week4.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharacterInTheString {
    public static void main(String[] args) {
        
    
    String companynName = "google";
     char[] charArray = companynName.toCharArray();
     System.out.println(charArray);
     Set <Character> unique = new LinkedHashSet<Character>();
     for (int i =0; i<charArray.length;i++){
        unique.add(charArray[i]);

    }

    System.out.println(unique);

}

}





