package com.example.NumberConverter.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanConverterTest {

    @Test
    @DisplayName("should return I")
    void toRoman_1() {
        // given
        int number = 1;

        // when
        String result = RomanConverter.toRoman(number);

        // then
        assertEquals("I", result);
    }

    @Test
    @DisplayName("should return IX")
    void toRoman_9() {
        // given
        int number = 9;

        // when
        String result = RomanConverter.toRoman(number);

        // then
        assertEquals("IX", result);
    }

    @Test
    @DisplayName("should return XI")
    void toRoman_11() {
        // given
        int number = 11;

        // when
        String result = RomanConverter.toRoman(number);

        // then
        assertEquals("XI", result);
    }

    @Test
    @DisplayName("should return XCIX")
    void toRoman_99() {
        // given
        int number = 99;

        // when
        String result = RomanConverter.toRoman(number);

        // then
        assertEquals("XCIX", result);
    }

    @Test
    @DisplayName("should return CI")
    void toRoman_101() {
        // given
        int number = 101;

        // when
        String result = RomanConverter.toRoman(number);

        // then
        assertEquals("CI", result);
    }

    @Test
    @DisplayName("should return CXLVIII")
    void toRoman_148() {
        // given
        int number = 148;

        // when
        String result = RomanConverter.toRoman(number);

        // then
        assertEquals("CXLVIII", result);
    }

    @Test
    @DisplayName("should return CLIII")
    void toRoman_153() {
        // given
        int number = 153;

        // when
        String result = RomanConverter.toRoman(number);

        // then
        assertEquals("CLIII", result);
    }

    @Test
    @DisplayName("should return CCIV")
    void toRoman_204() {
        // given
        int number = 204;

        // when
        String result = RomanConverter.toRoman(number);

        // then
        assertEquals("CCIV", result);
    }

    @Test
    @DisplayName("should return CDLXXXII")
    void toRoman_482() {
        // given
        int number = 482;

        // when
        String result = RomanConverter.toRoman(number);

        // then
        assertEquals("CDLXXXII", result);
    }

    @Test
    @DisplayName("should return D")
    void toRoman_500() {
        // given
        int number = 500;

        // when
        String result = RomanConverter.toRoman(number);

        // then
        assertEquals("D", result);
    }

    @Test
    @DisplayName("should return DCCXXXIII")
    void toRoman_733() {
        // given
        int number = 733;

        // when
        String result = RomanConverter.toRoman(number);

        // then
        assertEquals("DCCXXXIII", result);
    }

    @Test
    @DisplayName("should return CMXLVI")
    void toRoman_946() {
        // given
        int number = 946;

        // when
        String result = RomanConverter.toRoman(number);

        // then
        assertEquals("CMXLVI", result);
    }

    @Test
    @DisplayName("should return MXXIV")
    void toRoman_1024() {
        // given
        int number = 1024;

        // when
        String result = RomanConverter.toRoman(number);

        // then
        assertEquals("MXXIV", result);
    }

    @Test
    @DisplayName("should return MMCII")
    void toRoman_2102() {
        // given
        int number = 2102;

        // when
        String result = RomanConverter.toRoman(number);

        // then
        assertEquals("MMCII", result);
    }

    @Test
    @DisplayName("should return MMMMMDCLXXVIII")
    void toRoman_5678() {
        // given
        int number = 5678;

        // when
        String result = RomanConverter.toRoman(number);

        // then
        assertEquals("MMMMMDCLXXVIII", result);
    }

    @Test
    @DisplayName("should return MMMMMMMMMM (10xM)")
    void toRoman_10000() {
        // given
        int number = 10000;

        // when
        String result = RomanConverter.toRoman(number);

        // then
        assertEquals("MMMMMMMMMM", result);
    }
}