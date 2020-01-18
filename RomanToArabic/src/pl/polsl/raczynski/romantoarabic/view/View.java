/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.raczynski.romantoarabic.view;

import java.util.*;
import java.util.stream.Collectors;


/**
 * class that views information on console
 * 
 * @author Jan Raczynski
 * @version 1.0
 */
public class View {

    /**
     * Initiates a {@link View} object 
     */
    public View() {
    } 
    
    /**
     * method that shows when no parameters 
     */
    public void getNumberFromClientWhenNoArgs() {
        System.out.print("Please type roman number: ");
    }
    
    /**
     * method that shows when one parameter
     * 
     * @param romanNum roman number in parameter
     */
    public void getNumberWhenArgs(String romanNum) {
        List<Character> romanNumInCharacters = romanNum.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
        System.out.print("Your roman number is: ");
        for(char symbolOfRomanNumber : romanNumInCharacters) {
        System.out.print(symbolOfRomanNumber);    
        }
        System.out.println();
    }
    
    /**
     * method that shows when too many parameters
     */
    public void tooManyArgs() {
        System.out.println("Too many arguments!");
    }
    
    /**
     * method showing converted value
     * 
     * @param value converted walue to display
     */
    public void convertedValue(int value) {
        System.out.print("Your arabic number is: ");
        System.out.println(value);
    }
}

