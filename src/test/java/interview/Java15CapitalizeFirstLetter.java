package interview;

import org.testng.annotations.Test;

public class Java15CapitalizeFirstLetter {
    @Test
    public void capitalizeFirstLetter()
    {
        String str = "make selenium easy.";
        String[] strArray = str.split(" ");
        for (String s  : strArray)
            System.out.print(String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1) + " ");
    }
}
