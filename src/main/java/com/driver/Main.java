package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly r = new RWOnly();
//        r.name = "sai";   we cannot access name variable directly as it is private

        r.setName("Acciojob");
        System.out.println(r.getName());
    }
}