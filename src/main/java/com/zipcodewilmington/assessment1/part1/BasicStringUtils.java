package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String a = "";
        for(int i = str.length() -1; i >= 0; i--){
            a = a + str.charAt(i);
        }

        return a;
    }
    /*

     */

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        String a = reverse(str);

        return a.substring(0, 1).toUpperCase() + a.substring(1);
    }
/*
        String a = "";
        for(int i = str.length() -1; i >= 0; i--){
            a = a + str.charAt(i);
        }

        return a.substring(0, 1).toUpperCase() + a.substring(1);

    }*/


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

       return str = str.substring(1, str.length() - 1);


    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        StringBuilder toggled = new StringBuilder(str.length());
        for (char letter : str.toCharArray()) {
            if(Character.isUpperCase(letter)) {
                letter = Character.toLowerCase(letter);
            } else if(Character.isLowerCase(letter)) {
                letter = Character.toUpperCase(letter);
            }

            toggled.append(letter);

        }
        return toggled.toString();
    }
}
