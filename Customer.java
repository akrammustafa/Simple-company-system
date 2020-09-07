package com.company;

import java.util.ArrayList;
import java.util.Calendar;

public class Customer extends Person {

   private ArrayList<Product> products;

   public Customer(int id, String firstName, String lastName, String gender, Calendar birthDate,String maritalStatus,String hasDriverLicence, ArrayList<Product> products){
        super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicence);
        this.products = products;
    }
    public Customer(Person person,ArrayList<Product> products){

    this.products=products;
    }
    //There are setter/getter and toString() methods
    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "products=" + products +
                '}';
    }
}
