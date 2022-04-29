package edu.handong.csee.java.hw2.math;

//import java.lang.Math;

/**
 * math calculator class. 
 * 
 * it contains all the method for calculating nums.
 */

public class MathCalculator{
    private String name;

    /**
     * set the name
     * @param newName type in the user's name
     */
    public void setName(String newName) {
        name = newName;
    }
    /**
     * shows name
     * @return typed in name
     */
    public String getName() {
        return name;
    }
    /**
     * @param num1
     * @param num2
     * @return Max num between 2 nums
     */
    public int getMax(int num1, int num2) {
        if(num1 > num2) {
            return num1;
        }
        else {
            return num2;
        }
    }
/**
 * gives min num between two
 * @param num1 1st num
 * @param num2 2nd num
 * @return minimun num between two
 */
    public int getMin(int num1, int num2) {
        if(num1 > num2) {
            return num2;
        }
        else {
            return num1;
        }
    }
/**
 * get absolute num
 * @param num num to get absolute num
 * @return absolute num
 */
    public int getAbs(int num) {
        if(num < 0) {
            num *= -1;
        }
        return num;
    }
/**
 * give sum of two nums
 * @param num1
 * @param num2
 * @return sum of two nums
 */
    public int getSum(int num1, int num2) {
        return (num1 + num2);
    }
/**
 * give difference of two nums
 * @param num1
 * @param num2
 * @return subtract of two nums
 */
    public int getDiff(int num1, int num2) {
        return (num1 - num2);
    }
/**
 * give product of two nums
 * @param num1
 * @param num2
 * @return product of two nums
 */
    public int getProduct(int num1, int num2) {
        return (num1 * num2);
    }
/**
 * give quotient of two nums
 * @param num1
 * @param num2
 * @return quotient of two nums
 */
    public int getQuotient(int num1, int num2) {
        return (num1 / num2);
    }
/**
 * give remainder of two nums
 * @param num1
 * @param num2
 * @return remainder of two nums
 */
    public int getRemainder(int num1, int num2) {
        return (num1 % num2);
    }
/**
 * give num1 to the power of num2
 * @param num1
 * @param num2
 * @return num1 ^ num2
 */
    public int getPower(int num1, int num2) {
        int num = 1;
        for(int i = 0; i < num2; i++) {
            num *= num1;
        }
        return num;
    }
/**
 * give factorial of num
 * @param num
 * @return num!
 */
    public int getFactorial(int num) {
        if(num == 0) {
            return 1;
        }
        else {
            return num * getFactorial(num - 1);
        }
    }
    /**
     * give Greatest Common Divisor
     * @param num1
     * @param num2
     * @return GCD
     */
    public int getGcd(int num1, int num2) {
        if(num1 == 0 || num2 == 0) return 0;
        if(num1 > num2) {
            if(num1 % num2 == 0) {
                return num2;
            }
            else {
                return getGcd(num2, getRemainder(num1,num2));
            }
        }
        else {
            return getGcd(num1, getRemainder(num2,num1));
        }
    }
/**
 * give least common multiples
 * @param num1
 * @param num2
 * @return LCM
 */
    public int getLcm(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        int absHighNum = getMax(getAbs(num1), getAbs(num2));
        int absLowNum = getMin(getAbs(num1), getAbs(num2));
        int lcm = absHighNum;
        while (lcm % absLowNum != 0) {
            lcm += absHighNum;
        }
        return lcm;
    }
    /**
     * give square of num
     * @param num
     * @return square of num
     */
    public int getSquare(int num) {
        return num * num;
    }
}