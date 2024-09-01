package com.zubair.jdk18.codesnippet.internal;

public class CodeSnippet {

    /**
     * Calculates the factorial of a given non-negative number.
     *
     * @param n the non-negative number
     * @return the factorial of n
     * @throws IllegalArgumentException if n is negative
     *
     * {@snippet :
     * long factorial(int n) {
     *   if (n < 0) {
     *     throw new IllegalArgumentException("n must be non-negative");
     *   }
     *
     *   long result = 1;
     *   for (int i = 2; i <= n; i++) {
     *     result *= i;
     *   }
     *   return result;
     * }
     * }
     */
     static class Factorial {

        public static long factorial(int n) {
            // ... implementation ...
            return 0;
        }
    }


}
