package com.techreturn.roman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FromRomanTest {

    public FromRoman fromRoman = new FromRoman();

    @Test
    public void Test1(){
        assertEquals(1, fromRoman.convert("I"));
    }

    @Test
    public void Test2(){
        assertEquals(2, fromRoman.convert("II"));
    }

    @Test
    public void Test3(){
        assertEquals(3, fromRoman.convert("III"));
    }
    @Test
    public void Test4(){
        assertEquals(4, fromRoman.convert("IV"));
    }

    @Test
    public void Test5(){
        assertEquals(5, fromRoman.convert("V"));
    }
    @Test
    public void Test6(){
        assertEquals(6, fromRoman.convert("VI"));
    }
    @Test
    public void Test7(){
        assertEquals(7, fromRoman.convert("VII"));
    }
    @Test
    public void Test8(){
        assertEquals(8, fromRoman.convert("VIII"));
    }

    @Test
    public void Test9(){
        assertEquals(9, fromRoman.convert("IX"));
    }
    @Test
    public void Test10(){
        assertEquals(10, fromRoman.convert("X"));
    }
    @Test
    public void Test12(){
        assertEquals(12, fromRoman.convert("XII"));
    }
    @Test
    public void Test15(){
        assertEquals(15, fromRoman.convert("XV"));
    }
    @Test
    public void Test19(){
        assertEquals(19, fromRoman.convert("XIX"));
    }
    @Test
    public void Test25(){
        assertEquals(25, fromRoman.convert("XXV"));
    }
    @Test
    public void Test36(){
        assertEquals(36, fromRoman.convert("XXXVI"));
    }

    @Test
    public void Test40(){
        assertEquals(40, fromRoman.convert("XL"));
    }

    @Test
    public void Test55(){
        assertEquals(55, fromRoman.convert("LV"));
    }

    @Test
    public void Test66(){
        assertEquals(66, fromRoman.convert("LXVI"));
    }

    @Test
    public void Test89(){
        assertEquals(89, fromRoman.convert("LXXXIX"));
    }

    @Test
    public void Test92(){
        assertEquals(92, fromRoman.convert("XCII"));
    }

    @Test
    public void Test192(){
        assertEquals(192, fromRoman.convert("CXCII"));
    }

    @Test
    public void Test492(){
        assertEquals(492, fromRoman.convert("CDXCII"));
    }

    @Test
    public void Test555(){
        assertEquals(555, fromRoman.convert("DLV"));
    }

    @Test
    public void Test955(){
        assertEquals(955, fromRoman.convert("CMLV"));
    }

    @Test
    public void Test1011(){
        assertEquals(1011, fromRoman.convert("MXI"));
    }

    @Test
    public void TestBroken(){
        assertEquals(0, fromRoman.convert("ERROR"));
    }
}
