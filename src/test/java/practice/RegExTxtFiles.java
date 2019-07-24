package practice;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTxtFiles {
    @Test
    public void findTxtFiles()
    {
        String str = "abv.txt";
        Pattern p = Pattern.compile("[.]txt");
        Matcher m = p.matcher(str);
        while(m.find())
        {
            System.out.println(m.start() + "*****" + m.group());
        }
    }
}
