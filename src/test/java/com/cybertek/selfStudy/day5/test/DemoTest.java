package com.cybertek.selfStudy.day5.test;

import org.junit.jupiter.api.*;

public class DemoTest {
    @Test
    public void test2(){
        System.out.println("Ikinci test");
    }

    @AfterEach
    public  void clea(){
        System.out.println("Her birinden sonra");
    }
    @BeforeAll
    public static void init(){
        System.out.println("Hepsinden once");
    }

    @Test
    public void test1(){
        System.out.println("Birinci test");
    }

    @AfterAll
    public static void clean(){
        System.out.println("Hepsinden sonra");
    }
    @BeforeEach
    public  void dontClean(){
        System.out.println("Her birinden once");
    }

}
