package interview;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class Java17DistinctCharacters {
    @Test
    public void distinctCharacters()
    {
        String str = "Make Selenium Easy";
        char[] charArray = str.toCharArray();

        Set<Character> hs = new HashSet<Character>();
        for(Character c : charArray)
        {
            hs.add(c);
        }

        System.out.println(hs);
    }

    @Test
    public void distinctCharacterWithoutCollection()
    {
        String str = "Make Selenium Easy";

        while(str.length() != 0)
        {
            if(str.lastIndexOf(str.charAt(0)) == 0)
            {
                System.out.print(str.charAt(0));
            }
            str = str.replaceAll(Character.toString(str.charAt(0)), "");
        }
    }
}
