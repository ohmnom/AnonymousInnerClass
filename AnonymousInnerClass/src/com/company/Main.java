package com.company;

/**
 * @author Himanshu Arya
 * Class to demonstrate the concept of inner class
 */
public class Main {

    public static void main(String[] args) {

        /* Anonymous Inner class */
        Name obj = new Name(){

            @Override
            public void getName() {
                System.out.println("My Name is Himanshu");
            }
        };

        obj.getName();

    }
}
