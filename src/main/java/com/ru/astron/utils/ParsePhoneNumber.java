package com.ru.astron.utils;

public class ParsePhoneNumber {
    public static String parse(String number) {
        String res = "";

        res = number.substring(0, 2) + " "
                + number.substring(2, 5) + " "
                + number.substring(5, 8) + "-"
                + number.substring(8, 10) + "-"
                + number.substring(10, 12);

        return res;
    }
}
