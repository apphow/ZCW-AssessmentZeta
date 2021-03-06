package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {

        int num = n, sum = 0;
        for (int i = 1; i <= num; ++i) {
            // sum = sum + i;
             sum += i;
        }
        return sum;
    }



    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
       int result = 1;
       for(int i = 1; i <= n; i++) {
           result *=i;
       }
       return result;
    }
    //

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {


    String s = Integer.toString(val);

    s=BasicStringUtils.reverse(s);
    return new Integer(s);
    //call it from BasicArrayUtils

}
}
