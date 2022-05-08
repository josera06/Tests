package com.jrce.javatest;

public class LongestPalindromTest {
    public static void main(String[] args) {
        Palindromo pal = new Palindromo();
        String cadena = "anaacurrucaanitalavalatina";
        System.out.println("cadena longitud = " + cadena.length());
        System.out.println("Cadena " + pal.longestPalindrome(cadena));
    }
}
