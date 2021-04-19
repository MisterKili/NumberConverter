package com.example.NumberConverter.logic;

public class RomanConverter {

    private static final String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static final String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    public static String toRoman(final int num) {
        String thousands = getThousands(num);
        String hundreds = C[(num%1000)/100];
        String tens = X[(num%100)/10];
        String ones = I[num%10];

        String result = thousands + hundreds + tens + ones;

        return result;
    }

    private static String getThousands(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        int numberOfThousands = number/1000;
        for (int i = 0; i < numberOfThousands; i++) {
            stringBuilder.append("M");
        }
        return stringBuilder.toString();
    }
}
