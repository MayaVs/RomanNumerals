package com.techreturn.roman;

public class ToRoman {

    public String convert(int number){
        String roman = "";
        if(number > 3000) return roman;

        for(int i = 0; i<number; ++i) roman += "I";

        roman = roman
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VIV", "IX")
                .replace("VV", "X")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LXL", "XC")
                .replace("LL", "C")
                .replace("CCCCC", "D")
                .replace("CCCC", "CD")
                .replace("DD", "M")
                .replace("DCD", "CM");
        return roman;
    }
}
