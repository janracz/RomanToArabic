/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.polsl.raczynski.romantoarabic.model;

/**
 * class with number exceptions
 * 
 * @author Jan Raczynski
 * @version 1.0
 */
public class NumberException extends Exception {

    /**
     * Non-parameter constructor
     */
    public NumberException() {
    }

    /**
     * Exception class constructor
     *
     * @param message display message
     */
    public NumberException(String message) {
        super(message);
    }
}