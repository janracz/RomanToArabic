/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.raczynski.romantoarabic.controler;

import java.util.Scanner;
import pl.polsl.raczynski.romantoarabic.model.*;
import pl.polsl.raczynski.romantoarabic.view.*;

//lekkie zmiany w klasie Converter, View oraz nowa klasa Value


/**
 * class that controls the whole program
 * it's the main class of the program
 * 
 * @author Jan Raczynski
 * @version 1.0
 */
public class Controler {
        
    
    /**
     * Main method of application uses the classes defined in different
     * packages
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating the instances of classes 
        View view = new View();
        Converter converterAlgorithm = new Converter();
        RomanNumber valueToConvert = new RomanNumber();
        ArabicNumber convertedValue = new ArabicNumber();
        
        // additional variable to put in the converted value
        int arabicValue;
        
        // checking how many parameters
        switch (args.length) {
            case 0:     //in case of no parameters
                view.getNumberFromClientWhenNoArgs();
                Scanner scanner = new Scanner(System.in);
                String bufor = scanner.next();
                valueToConvert.setRomanNumber(bufor);
                arabicValue = converterAlgorithm.conversionFromRomanToArabic(valueToConvert.getRomanNumber());
                convertedValue.setArabicNumber(arabicValue);
                view.convertedValue(convertedValue.getArabicNumber());
                break;
            case 1:     //in case of one parameter
                valueToConvert.setRomanNumber(args[0]);
                view.getNumberWhenArgs(valueToConvert.getRomanNumber());
                arabicValue = converterAlgorithm.conversionFromRomanToArabic(valueToConvert.getRomanNumber());
                convertedValue.setArabicNumber(arabicValue);
                view.convertedValue(convertedValue.getArabicNumber());
                break;
            default:    //in case of more than one parameters
                view.tooManyArgs();
                break;
        }
    } 
}