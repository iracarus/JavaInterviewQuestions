package interview;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Java08RemoveDuplicateCharacters {
    @Test
    public void removeDuplicateChars()
    {
        String str = "zomabasdadasd";
        StringBuffer newStr = new StringBuffer();
        int i=0;
        while(i<str.length())
        {
            String c = str.substring(i, i+1);
            if(newStr.indexOf(c) == -1)
                newStr.append(c);
            i++;
        }
        System.out.println(newStr);
    }

    @Test
    public void removeDuplicateUseCollection()
    {
        String str = "Make Selenium Easy";
        str = str.toUpperCase();
        char[] charArray = str.toCharArray();

        Set<Character> hs = new HashSet<>();
        for(Character c : charArray)
        {
            hs.add(c);
        }

        System.out.println(hs);



    }
}
