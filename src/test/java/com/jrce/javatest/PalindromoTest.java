package com.jrce.javatest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromoTest {
    
    public PalindromoTest() {
    }


    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of longestPalindrome method, of class Palindromo.
     */
    @Test
    public void testLongestPalindrome() {
        System.out.println("longestPalindrome");
        String s = "anitalavalatinaacurruca";
        Palindromo instance = new Palindromo();
        String expResult = "anitalavalatina";
        String result = instance.longestPalindrome(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        s = "acurrucateana";
        expResult = "acurruca";
        result = instance.longestPalindrome(s);
        assertEquals(expResult, result);
        
        s = "anados";
        expResult = "ana";
        result = instance.longestPalindrome(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsEven(){
        System.out.println("IsEvenTest");
        String cadena1 = "Hola";
        String cadena2 = "Adios";
        Palindromo palindromo = new Palindromo();
        assertEquals(palindromo.isEven(cadena1), true);
        assertEquals(palindromo.isEven(cadena2), false);     
    }
    
    @Test
    public void testIsPalindrome(){
        System.out.println("Is palindrome");
        String cadena1 = "ana";
        String cadena2 = "anaanita";
        String cadena3 = "selles";
        Palindromo palindromo = new Palindromo();
        assertEquals(true,palindromo.isPalindrome(cadena1));
        assertEquals(false,palindromo.isPalindrome(cadena2));  
        assertEquals(true,palindromo.isPalindrome(cadena3));  
    }
    
    @Test
    public void testGetMittlePoint(){
        System.out.println("Get the mittle point");
        String cadena1 = "ACURRUCA"; //SELLES
        String cadena2 = "ANITALAVALATINA";
        Palindromo palindromo = new Palindromo();
        assertEquals('R',cadena1.charAt(palindromo.getMittlePoint(cadena1)));
        assertEquals('V',cadena2.charAt(palindromo.getMittlePoint(cadena2)));     
    }
    
}
