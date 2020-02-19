package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static int getSum(Integer[] intArray) {
        int b = 0;
        for (int i = 1; i <= intArray.length; i++) {
            b += i;

        }

        return b;
    }
    //Integer s = 0;
    //for(Integer i : intArray) s += i;//we don't want intArray[i], just i
    //return s;
//  }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int rtn = 1;
        for (int i : intArray) {
            rtn *= i;
        }
        return rtn;
    }
    // Integer s = 1;
    // for (Integer i : intArray) s *= i;
    //return s;
//}   i gives us the value in the index of the array, not the index


    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        int b = 0;
        double a = 0;
        for(int i = 0; i <= intArray.length; i++) {
            b += i;
            a = b/intArray.length;
        }
        return a;
    }

    /*
    return getSum(intArray)/intArray.length);
    it's calling the method above
     */

}
