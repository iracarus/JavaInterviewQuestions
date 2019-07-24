package interview;

import org.testng.annotations.Test;

public class Java19ReversePositionOfWords {
    @Test
    public void reversePosOfWords()
    {
        String str = "Make Selenium Easy";
        String[] strArray = str.split(" ");
        for(int i = strArray.length-1; i>=0; i-- )
        {
            System.out.println(strArray[i]);
        }
    }
}
