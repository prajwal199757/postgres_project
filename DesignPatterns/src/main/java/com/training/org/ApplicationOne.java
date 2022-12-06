package com.training.org;

public class ApplicationOne implements ProductInterface{
    @Override
    public Product makeProduct() {
        Product productOne=new Product(1,"buiscuit");
        return productOne;
    }
}
