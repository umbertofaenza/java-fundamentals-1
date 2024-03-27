package org.learning.favouritefood;

import java.util.Arrays;

public class FavouriteFood {
    public static void main(String[] args) {

        //define a String array of 5 favourite food
        String[] myFavouriteFood = {"pizza", "buffalo mozzarella", "lasagne", "nuts", "cereals"};

        //print array length
        System.out.println("Array length: " + myFavouriteFood.length);

        //print element in array's first position
        System.out.println("First position: " + myFavouriteFood[0]);

        //print element in array's last position
        System.out.println("Last position: " + myFavouriteFood[myFavouriteFood.length - 1]);

        //print element in median position
        System.out.println("Median position: " + myFavouriteFood[myFavouriteFood.length / 2]);

    }
}
