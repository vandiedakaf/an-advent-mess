package com.vdda.advent

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class AdventDaysTest {

    private val adventDays = AdventDays()

    @Test
    fun day01_1() {
        Assertions.assertEquals(3, adventDays.day01_1("1122"))
        Assertions.assertEquals(4, adventDays.day01_1("1111"))
        Assertions.assertEquals(0, adventDays.day01_1("1234"))
        Assertions.assertEquals(9, adventDays.day01_1("91212129"))
    }

    @Test
    fun day01_2() {
        Assertions.assertEquals(6, adventDays.day01_2("1212"))
        Assertions.assertEquals(0, adventDays.day01_2("1221"))
        Assertions.assertEquals(4, adventDays.day01_2("123425"))
        Assertions.assertEquals(12, adventDays.day01_2("123123"))
        Assertions.assertEquals(4, adventDays.day01_2("12131415"))
    }

    @Test
    fun day02_1() {
        Assertions.assertEquals(18, adventDays.day02_1("5\t1\t9\t5\n" +
                "7\t5\t3\n" +
                "2\t4\t6\t8"))
    }

    @Test
    fun day02_2() {
        Assertions.assertEquals(9, adventDays.day02_2("5\t9\t2\t8\n" +
                "9\t4\t7\t3\n" +
                "3\t8\t6\t5"))
    }

    @Test
    fun calcSquareRadiusTest() {
        Assertions.assertEquals(1, adventDays.calcSquareRadius(1))
        Assertions.assertEquals(2, adventDays.calcSquareRadius(2))
        Assertions.assertEquals(3, adventDays.calcSquareRadius(25))
        Assertions.assertEquals(4, adventDays.calcSquareRadius(26))
        Assertions.assertEquals(4, adventDays.calcSquareRadius(49))
        Assertions.assertEquals(5, adventDays.calcSquareRadius(50))
        Assertions.assertEquals(286, adventDays.calcSquareRadius(325489))
    }

    @Test
    fun calcAnchorsTest1() {
        val expected = listOf(11, 15, 19, 23)
        val actual = adventDays.calcAnchors(3, 10, 16)
        Assertions.assertIterableEquals(expected, actual)
    }

    @Test
    fun calcAnchorsTest2() {
        val expected = listOf(28, 34, 40, 46)
        val actual = adventDays.calcAnchors(4, 26, 24)
        Assertions.assertIterableEquals(expected, actual)
    }

    @Test
    fun day03_1() {
        Assertions.assertEquals(0, adventDays.day03_1(1))
        Assertions.assertEquals(3, adventDays.day03_1(12))
        Assertions.assertEquals(2, adventDays.day03_1(23))
        Assertions.assertEquals(31, adventDays.day03_1(1024))
    }

    @Test
    fun day03_2() {
        Assertions.assertEquals(10, adventDays.day03_2(5))
        Assertions.assertEquals(23, adventDays.day03_2(11))
        Assertions.assertEquals(26, adventDays.day03_2(25))
        Assertions.assertEquals(122, adventDays.day03_2(59))
    }

    @Test
    fun day04_1() {
        Assertions.assertEquals(2, adventDays.day04_1("day04_1_test1.txt"))
    }

    @Test
    fun day04_2() {
        Assertions.assertEquals(3, adventDays.day04_2("day04_1_test2.txt"))
    }
}

