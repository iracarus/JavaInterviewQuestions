package interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java20ExtractPhoneNumbersFromFile {
    public static void main(String[] args) {
        String str = "916873330287";
        //Pattern p = Pattern.compile("[789][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"); // raw without wuantifier
        //Pattern p = Pattern.compile("[7-9][0-9]{9}"); // for 10 digits, simplified form with quantifier
        //Pattern p = Pattern.compile("0?[7-9][0-9]{9}"); // for 11 digits, if it contains 0 at beginning
        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}"); // for 12 digits if it contains country code

        Matcher m = p.matcher(str);

        while(m.find())
        {
            System.out.println(m.start() + "....." + m.end() + "....." +m.group());
        }

    }
}
