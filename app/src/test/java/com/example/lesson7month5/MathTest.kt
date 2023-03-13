package com.example.lesson7month5

import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test


class MathTest {
    var math:Math?= null

    @Before
    fun init(){
        math = Math()
    }

    @Test
    fun simpleAddTest(){
        assertEquals("4",math?.add("2","2"))
}
    @Test
    fun simplePlusTest(){
        assertEquals("4",math?.add("","2"))
    }
    @Test
    fun simpleEmptyTest(){
        assertEquals("4",math?.add("+2","2"))
    }

    @Test
    fun simpleNegativeTest(){
        assertEquals("0",math?.add("-2","+2"))
    }
    @Test
    fun simpleSymbolTest(){
        assertEquals("вы обязаны ввести числа",math?.add("2asdasd","2"))

    }
    @Test
    fun simpleDoubleTest(){
        assertEquals("4.0",math?.add("2.0","2"))

    }

    @Test
    fun simpleDevide(){
        assertEquals("4",math?.devide("8","2"))
    }
    @Test
    fun simpleZeroDevide(){
        assertEquals("на ноль делить нельзя",math?.devide("8","0"))
    }
    @Test
    fun simpleDotDevide(){
        assertEquals("1.1",math?.devide("1","0.1"))
    }


    @After
    fun detach(){
        math = null
    }
}