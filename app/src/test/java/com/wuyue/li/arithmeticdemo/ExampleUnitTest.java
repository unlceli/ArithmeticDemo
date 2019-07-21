package com.wuyue.li.arithmeticdemo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {


        assertEquals(4, 2 + 2);
    }

    @Test
    public void tes22t() {
        System.out.println("111");
    }

    /**
     * 交换
     */
    @Test
    public void testSwap() {
//        //第一种
        int a = 5;
        int b = 6;
//        int c =a ;a= b; b =c;
        //第二种  如果是对象是不可行的。    *****
        //相对性三种，用改种，因为可读性原因。

//        a = a + b;  //a = 11;
//        b = a - b;  // a =5; b =5
//        a = a - b; //a =6  b=5

        // 第三种 ，用亦或 方式  性能最优的方式。在任何情况都用。
        //但是不用呢，没有可读性。
        //用在无人机，跑步机上面。

        a = a ^ b;
        b = a ^ b;  // a^b ^b  =a ;
        a = a ^ b;  // a ^ a

        // 因为应用场景的原因，考虑程序的好坏，用算法。
        System.out.println("a=" + a + "b= " + b);
    }
}