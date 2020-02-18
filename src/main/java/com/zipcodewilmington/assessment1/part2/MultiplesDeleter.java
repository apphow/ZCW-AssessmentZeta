package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        List<Integer> odds = new ArrayList<Integer>();
        for (int a : ints) {

            if (a % 2 == 1) {
                odds.add(a);
            }
        }
            return odds.toArray(new Integer[odds.size()]);
        }


    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {

        List<Integer> evens = new ArrayList<Integer>();
        for(int a : ints) {
            if(a%2 == 0){
                evens.add(a);
            }
        }

        return evens.toArray(new Integer[evens.size()]);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        List<Integer> multiples = new ArrayList<Integer>();
        for (int a : ints) {
            if (a % 3 != 0) {
                multiples.add(a);
            }
        }
        return multiples.toArray(new Integer[multiples.size()]);
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        List<Integer> multiplier = new ArrayList<Integer>();
        for (int a : ints) {
            if(a% multiple != 0) {
                multiplier.add(a);
            }
        }



        return multiplier.toArray(new Integer[multiplier.size()]);
    }
}
