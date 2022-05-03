class Solution {
    /**
     * 1.Input a year and find whether it is a leap year or not.
     * 2.Take two numbers and print the sum of both.
     * 3.Take a number as input and print the multiplication table for it.
     * 4.Take 2 numbers as inputs and find their HCF and LCM.
     * 5.Keep taking numbers as inputs till the user enters ‘x’, after that print
     * sum
     * of all.
     * 
     */

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 == 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // product of the numbers =lcm * gcd
    public static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGcd(b % a, a);
    }

    public static void main(String[] args) {

    }
}