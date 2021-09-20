package com.techreturn.roman;

public class FromRoman {

    public int convert(String roman){

        roman = roman
                .replace("CM", "DCD")
                .replace("M", "DD")
                .replace("CD", "CCCC")
                .replace("D", "CCCCC")
                .replace("C", "LL")
                .replace("XC", "LXL")
                .replace("XL", "XXXX")
                .replace("L", "XXXXX")
                .replace("X", "VV")
                .replace("IX", "VIV")
                .replace("IV", "IIII")
                .replace("V", "IIIII");

        //check if all symbols are I, otherwise the input wasn't a roman numeral
        if(roman.matches("^(.)\\1*$")) return roman.length();
        else return 0;
    }
}

