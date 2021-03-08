/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.webservices;

import javax.xml.ws.Endpoint;



/**
 *
 * 
 */

public class TestMartPublisher {
    
    
    public static void main(String [] args){
        
        Endpoint.publish("http://localhost:1234/productcatalog/", new ProductCatelog());
        
        
    }
}
