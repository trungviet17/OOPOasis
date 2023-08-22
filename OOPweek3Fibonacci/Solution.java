// Import your library
// Do not change the name of the Solution class


/**
 * The Solution class provides a static method to check if a given number is prime.
 */

public class Solution {

    /**
     * Check 1 number is Prime or not
     *
     * @param n the number to be checked
     * @return true if n is Prime false otherwise
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}


