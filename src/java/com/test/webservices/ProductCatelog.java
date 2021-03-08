/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.webservices;

import com.test.webservices.business.ProductServiceImpl;
import com.test.wesservices.model.Product;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * http://localhost:8080/TestMart/ProductCatelogService?wsdl
 * 
 */

//  @WebService (name = "TestMartCatalog" , portName = "TestMartCatalogPort" , serviceName = "TestMartCatalogService", 
//  targetNamespace = "http://www.testmart.com"  )  // name = default port type in WSDL ,
@WebService(endpointInterface = "com.test.webservices.ProductCatalogInterface" , portName = "TestMartCatalogPort" , serviceName = "TestMartCatalogService")
public class ProductCatelog implements ProductCatalogInterface {
    
    ProductServiceImpl productService = new ProductServiceImpl();
    
    
    @Override
    public List<String> getProductCategories() {
        return productService.getProductCategories();
    }
    
    @Override
    public List<String> getProducts(String category) {
        return productService.getProducts(category);
    }
    
    @Override
    public boolean addProduct(String category,String product) {
        return productService.addProduct(category,product);
    }
    
    @Override
    public List<Product> getProductsv2(String category) {
        return productService.getProductsv2(category);
    }
}
