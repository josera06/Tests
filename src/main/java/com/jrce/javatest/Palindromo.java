package com.jrce.javatest;

public class Palindromo {

    private int resultStart;
    private int resultLength;

    public String longestPalindrome(String s) {
        resultLength = 0;
        resultStart = 0;
        int strLength = s.length();
        if (strLength < 2) {
            return s;
        }

        for (int start = 0; start < strLength; start++) {
            expandRange(s, start, start);
            expandRange(s, start, start + 1);
        }
        return s.substring(resultStart, resultStart + resultLength);
    }

    private void expandRange(String s, int begin, int end) {
        while (begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
        if (resultLength < end - begin - 1) {
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }
    }

    public boolean isEven(String s) {
        int number = s.length();
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getMittlePoint(String s) {
        int resultado = s.length() / 2;
        return resultado;
    }

    public boolean isPalindrome(String s) {
        int begin = getMittlePoint(s);
        int end = begin;
        
        
        if(isEven(s)){
            end--;
        }


        System.out.println("Paso 1: " + s.charAt(begin) +" "+ s.charAt(end));
        
        while (s.charAt(begin) == s.charAt(end)) {
            System.out.println("begin = " + begin);
            System.out.println("end = " + end);
            System.out.println(s.charAt(begin) +" "+ s.charAt(end));
            begin--;
            end++;
            System.out.println("Final: "+s.charAt(begin) +" "+ s.charAt(end));
            if (begin == 0 || end == s.length()) {
                System.out.println("Respuesta");
                return true;
            }
        }
        

        return false;
    }
}
