package interview;

import org.testng.annotations.Test;

public class Java16RemoveExtraWhitespace {
    @Test
    public void removeExtraWhitespace()
    {
        // Method 1 : using replaceAll method
        String str = "   Make    Selnium    Easy.";
        //str = str.replaceAll("\\s+", " ");
        //System.out.println(str);

        //Method 2 : Using arrays
        char[] charArray = str.toCharArray();
        String stringWithoutExtraSpace = "";
        for(int i =0; i<charArray.length; i++)
        {
            //System.out.print(charArray[i]);
            if(charArray[i] == ' ')
            {
                if(stringWithoutExtraSpace.length() == 0 && charArray[i+1]==' ')
                {
                    stringWithoutExtraSpace = stringWithoutExtraSpace + charArray[i];
                }
            }
            else
            {
                stringWithoutExtraSpace = stringWithoutExtraSpace + charArray[i];
            }
        }

        System.out.println(stringWithoutExtraSpace);
    }
}
