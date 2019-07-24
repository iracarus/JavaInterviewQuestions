package interview;

import org.testng.annotations.Test;

public class Java18ReverseEachWord {
    @Test
    public void reverseEachWord()
    {
        String str = "Make Selenium Easy";
        String[] strArray = str.split(" ");
        for(String s : strArray)
        {
            for(int i = s.length()-1; i >=0; i--)
                System.out.print(s.charAt(i));

            System.out.print(" ");
        }
    }
}
