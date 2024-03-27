package org.learning.trainticket;

//imports
import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        //initialise Scanner
        Scanner scan = new Scanner(System.in);

        //ask km to travel
        System.out.print("How many km will you travel?");
        int kmToTravel = scan.nextInt();

        //ask passenger's age
        System.out.print("How old is the passenger?");
        int passengerAge = scan.nextInt();

        //define price per km and calculate price for the journey (0,21 euro/km)
        double pricePerKm = 0.21;
        double journeyPrice = kmToTravel * pricePerKm;

        // define discounts
        double discountUnder18 = journeyPrice * 0.20;
        double discountOver65 = journeyPrice * 0.40;

        //calculate final price based on discounts
        double finalPrice;

        if (passengerAge < 18) {
            finalPrice = journeyPrice - discountUnder18;
        } else if (passengerAge >= 65) {
            finalPrice = journeyPrice - discountOver65;
        } else {
            finalPrice = journeyPrice;
        }

        //format final price
        finalPrice = Double.parseDouble(new DecimalFormat("##.##").format(finalPrice));

        //print final price
        System.out.println("Your ticket price is: " + finalPrice + "€");
    }
}
