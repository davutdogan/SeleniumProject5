package com.cybertek.selfStudy.day5.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest2 {
    @Test
    public void calculation(){
        int a=5;
        int b=6;

        int expectedResult=11;
        assertEquals(expectedResult,a+b);

    }
}
