package com.cybertek.selfStudy.day5.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest3 {
    @Test
    public void simpleTest() {
        int a = 1;
        int b = 2;
        int expectedResult = 3;

        assertEquals(expectedResult,a+b);
    }
}
