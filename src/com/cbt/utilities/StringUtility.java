package com.cbt.utilities;

public class StringUtility {
    // public static void main(String[] args) {
    public static void verifyEquals(String expected,String actual){
        if(expected.equals(actual)) {
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
            System.out.println(expected);
            System.out.println(actual);


        }
    }
}
