package com.company;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        /*Creation of ArrayList: I'm going to add String
         *elements so I made it of string type */
        ArrayList<String> obj = new ArrayList<String>();
        /*This is how elements should be added to the array list*/
        obj.add("Rakib");
        obj.add("Hamza");
        obj.add("Moyeen");
        obj.add("Khairul");
        obj.add("Manjarul");
        /* Displaying array list elements */
        System.out.println("Currently the array list has following elements:" + obj);
        /*Add element at the given index*/
        obj.add(0, "Farjana");
        obj.add(1, "Jarin");
        /*Remove elements from array list like this*/
        obj.remove("Chaitanya");
        obj.remove("Harry");
        System.out.println("Current array list is:" + obj);
        /*Remove element from the given index*/
        obj.remove(1);
        System.out.println("Current array list is:" + obj);
    }
}
