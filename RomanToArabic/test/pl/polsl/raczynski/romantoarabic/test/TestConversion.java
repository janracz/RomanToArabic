/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.raczynski.romantoarabic.test;

import pl.polsl.raczynski.romantoarabic.model.Converter;
import org.junit.*;
import static org.junit.Assert.*;
import pl.polsl.raczynski.romantoarabic.model.RomanNumber;



/**
 * Test of Converter class
 *
 * @author Jasiek
 * @version 1.0
 */
public class TestConversion {
    
    /**
     * a class to be tested
     */
    Converter converter;
    RomanNumber romanNumber;
    
    /**
     * a method to setup a test
     */
    @Before
    public void setup() {
        converter = new Converter();
    }
    
    /**
     * A method testing a conversion of numbers
     */
    @Test
    public void testConversion() {
        int valueAfterConversion;
        try {
            valueAfterConversion = converter.conversionFromRomanToArabic("C");
            assertEquals("Should be equal 100", valueAfterConversion, 100, 0.01);
        } catch(Exception e) {
            fail("Value failed to be equal 100");
        }
    }
    
    @Test
    public void testConversionWronValue() {
            int valueAfterConversion;
            try {
            romanNumber.setRomanNumber("K");
            valueAfterConversion = converter.conversionFromRomanToArabic(romanNumber.getRomanNumber());
            fail("Should throw exception");
        } catch(Exception e) {
        }
    }
    
    @Test
    public void testConversionNull() {
            int valueAfterConversion;
            try {
            valueAfterConversion = converter.conversionFromRomanToArabic(romanNumber.getRomanNumber());
            fail("Should throw exception");
        } catch(Exception e) {
        }
    }
    
    @Test
    public void testConversionEmptyString() {
            int valueAfterConversion;
            try {
            valueAfterConversion = converter.conversionFromRomanToArabic(romanNumber.getRomanNumber());
            romanNumber.setRomanNumber("");
            fail("Should throw exception");
        } catch(Exception e) {
        }
    }
}