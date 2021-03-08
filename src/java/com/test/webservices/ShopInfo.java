/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 *
 * 
 */

@WebService
@SOAPBinding// (style=Style.RPC)
public class ShopInfo {
    
    @WebMethod
    @WebResult(partName = "lookupOutput")
    public String getShopInfo(@WebParam(partName = "lookupInput") String property) throws InvalidInputException{
        String response = null;
        
        if("shopname".equals(property)){
            response = "Test Mart";
        } else if ("since".equals(property)){
            response = "since 2021";
        } else {
            throw new InvalidInputException("Invalid Input", property +" is not a valid input.");
        }
        return response;
    }
}
