/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.webservices.business;

import com.test.wesservices.model.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 */
public class ProductServiceImpl {
    
     List<String> bookList = new ArrayList<>();
     List<String> musicList = new ArrayList<>();
     List<String> movieList = new ArrayList<>();
    
    public ProductServiceImpl(){
        bookList.add("Book 1");
        bookList.add("Book 2");
        bookList.add("Book 3");
        
        musicList.add("Music 1");
        musicList.add("Music 2");
        musicList.add("Music 3");
        
        movieList.add("Movie 1");
        movieList.add("Movie 2");
        movieList.add("Movie 3");
    }
    
    public List<String> getProductCategories(){
            List<String> list = new ArrayList<>();
            list.add("Book");
            list.add("Music");
            list.add("Movies");
              
        return list;
    }
    
     public List<String> getProducts(String category){
           
         switch (category.toLowerCase()){
             case "books" :
                 return bookList;
             case "music" :
                 return musicList;
             case "movie" :
                 return movieList;
         }
         return null;
    }
     
     public boolean addProduct(String category, String product){
           
         switch (category.toLowerCase()){
             case "books" :
                bookList.add(product);
                break;
             case "music" :
                musicList.add(product);
                break;
             case "movie" :
                movieList.add(product);
                break;
             default :
                return false;
         }
         return true;
    }

    public List<Product> getProductsv2(String category) {
       List productList = new ArrayList<>();
       productList.add(new Product("Java Brain Book", "1234" ,999.99));
       productList.add(new Product("Java Deitel Book", "1234" ,999.99));
       return productList;
    }
     
    
}
