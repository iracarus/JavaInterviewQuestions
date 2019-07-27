package interview;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java21ExtractNumbersAndAdd {
    @Test
    public void extractAndAdd()
    {
        String str = "a3%fhfg52^dfdf386$%$%sdfsdf";

        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(str);
        while(m.find())
        {
            System.out.println(m.group());
        }
    }
}
