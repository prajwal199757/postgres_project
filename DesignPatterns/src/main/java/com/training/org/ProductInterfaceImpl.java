package com.training.org;

public class ProductInterfaceImpl {
    public static void main(String[] args) {
        ApplicationOne p1=new ApplicationOne();
        Product one=p1.makeProduct();
        System.out.println(one);
    }
}
