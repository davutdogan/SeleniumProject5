package com.cybertek.selfStudy.day5.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTest {
    @Test
    public void testAddition(){
        int a=1;
        int b=2;
        int expectedResult=3;
        Assertions.assertEquals(expectedResult,a+b);
    }
}
