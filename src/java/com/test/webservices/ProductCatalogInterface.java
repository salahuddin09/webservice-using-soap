/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.webservices;

import com.test.wesservices.model.Product;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 *
 */
@WebService(name = "TestMartCatalog", 
        targetNamespace = "http://www.testmart.com")  // name = default port type in WSDL , 
public interface ProductCatalogInterface {

    @WebMethod()
    boolean addProduct(String category, String product);

    @WebMethod(action = "fetch_categories", operationName = "fetchCategories")
    List<String> getProductCategories();

    @WebMethod
    List<String> getProducts(String category);

    @WebMethod
    @WebResult(name="Product")        
    List<Product> getProductsv2(String category);

}
