package com.techreturn.roman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToRomanTest {

    public ToRoman toRoman = new ToRoman();

    @Test
    public void Test1(){
        assertEquals("I", toRoman.convert(1));
    }

    @Test
    public void Test2(){
        assertEquals("II", toRoman.convert(2));
    }

    @Test
    public void Test3(){
        assertEquals("III", toRoman.convert(3));
    }
    @Test
    public void Test4(){
        assertEquals("IV", toRoman.convert(4));
    }

    @Test
    public void Test5(){
        assertEquals("V", toRoman.convert(5));
    }
    @Test
    public void Test6(){
        assertEquals("VI", toRoman.convert(6));
    }
    @Test
    public void Test7(){
        assertEquals("VII", toRoman.convert(7));
    }
    @Test
    public void Test8(){
        assertEquals("VIII", toRoman.convert(8));
    }

    @Test
    public void Test9(){
        assertEquals("IX", toRoman.convert(9));
    }
    @Test
    public void Test10(){
        assertEquals("X", toRoman.convert(10));
    }
    @Test
    public void Test12(){
        assertEquals("XII", toRoman.convert(12));
    }
    @Test
    public void Test15(){
        assertEquals("XV", toRoman.convert(15));
    }
    @Test
    public void Test19(){
        assertEquals("XIX", toRoman.convert(19));
    }
    @Test
    public void Test25(){
        assertEquals("XXV", toRoman.convert(25));
    }
    @Test
    public void Test36(){
        assertEquals("XXXVI", toRoman.convert(36));
    }

    @Test
    public void Test40(){
        assertEquals("XL", toRoman.convert(40));
    }

    @Test
    public void Test55(){
        assertEquals("LV", toRoman.convert(55));
    }

    @Test
    public void Test66(){
        assertEquals("LXVI", toRoman.convert(66));
    }

    @Test
    public void Test89(){
        assertEquals("LXXXIX", toRoman.convert(89));
    }

    @Test
    public void Test92(){
        assertEquals("XCII", toRoman.convert(92));
    }

    @Test
    public void Test192(){
        assertEquals("CXCII", toRoman.convert(192));
    }

    @Test
    public void Test492(){
        assertEquals("CDXCII", toRoman.convert(492));
    }

    @Test
    public void Test555(){
        assertEquals("DLV", toRoman.convert(555));
    }

    @Test
    public void Test955(){
        assertEquals("CMLV", toRoman.convert(955));
    }

    @Test
    public void Test1011(){
        assertEquals("MXI", toRoman.convert(1011));
    }

    @Test
    public void Test0(){
        assertEquals("", toRoman.convert(0));
    }

    @Test
    public void TestNeg(){
        assertEquals("", toRoman.convert(-955));
    }



}
