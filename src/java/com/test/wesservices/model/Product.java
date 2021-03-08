/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.wesservices.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * 
 */

@XmlRootElement(name="Product")
@XmlType(propOrder = {"price","sku","name"}) //property order
public class Product {
    
    private String name;
    private String sku;
    private double price;
    
    // no arg constructor , it's need because JaXB convert XML to Java Object too.which is why it's need no arg constructor 
    public Product(){
    
    }
    
    public Product(String name ,String sku, double price){
        this.name = name;
        this.sku = sku;
        this.price = price;
    }
    
    @XmlElement(name = "ProductName")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
