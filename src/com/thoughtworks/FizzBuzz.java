package com.thoughtworks;

/**
 * User: hwpeng
 * Date: 7/25/13
 * Time: 11:25 AM
 * Project: FizzBuzz
 */
public class FizzBuzz {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final String FIZZ_BUZZ = "fizz buzz";

    public String printAnswer(Integer number) {
        String answer = number.toString();
        if (number % 15 == 0) {
            answer = FIZZ_BUZZ;
        }
        else if (number % 5 == 0){
            answer = FIZZ;
        }
        else if (number % 3 == 0){
            answer = BUZZ;
        }
        return answer;
    }
}
