package com.training.org;

public class ApplicationTwo implements ProductInterface{
    @Override
    public Product makeProduct() {
        Product productTwo=new Product(2,"chocolate");
        return productTwo;
    }
}
