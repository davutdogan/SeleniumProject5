package com.cybertek.selfStudy.day06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JavaScriptAlert {
    @Test
    public void calculation(){
        int a=10;
        int b=11;
        int expecteedResult=21;
        Assertions.assertEquals(expecteedResult,a+b);
    }
    @Test
    public void stringTest1(){
        String word="I love Java";
        Assertions.assertEquals("I love Java",word);
        Assertions.assertTrue(word.startsWith("I love"));
    }

    @Test
    public void stringTest2(){
        String name="Davut Dogan";

        Assertions.assertEquals("Davut Dogan",name);
        Assertions.assertTrue(name.startsWith("Davut"));

    }

}
