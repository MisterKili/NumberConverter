package com.example.NumberConverter.logic;

import org.springframework.stereotype.Service;

@Service
public class NumberConverterService {

    public String convertToRoman(int number) {
        return RomanConverter.toRoman(number);
    }

    public String convertToHex(int number) {
        return Integer.toHexString(number);
    }
}
