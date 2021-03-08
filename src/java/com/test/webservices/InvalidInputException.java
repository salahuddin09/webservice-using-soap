/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.webservices;

/**
 *
 * @author ASUS
 */
public class InvalidInputException extends Exception{
    
    String errorDetails;
    
    public InvalidInputException (String reason , String errorDetails) {
        super(reason);
        this.errorDetails = errorDetails;
    }
    
    
    
    public String getFaultInfo() {
        return errorDetails;
    }
}
