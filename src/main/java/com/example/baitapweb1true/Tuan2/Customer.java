package com.example.baitapweb1true.Tuan2;

public class Customer {
    private String name;
    private String dateOfBirth;
    private String address;
    private String img;


    public Customer() {
    }

    public Customer(String name, String dateOfBirth, String address, String img) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address='" + address + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
