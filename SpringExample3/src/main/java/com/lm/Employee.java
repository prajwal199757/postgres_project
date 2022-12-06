package com.lm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    private String empName;
//    @Autowired
//    @Qualifier("address")
    private Address address;
    @Autowired
    public Employee(Address address,String empName) {
        this.address = address;
        this.empName = empName;

    }


//    @Autowired
//    @Qualifier("address2")
//	private Address address2;



    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

//    public Address getAddress2() {
//        return address2;
//    }
//
//    public void setAddress2(Address address2) {
//        this.address2 = address2;
//    }
}
