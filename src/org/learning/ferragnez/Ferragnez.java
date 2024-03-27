package org.learning.ferragnez;

import java.util.Scanner;

public class Ferragnez {
    public static void main(String[] args) {

        //initialise array of invited people
        String[] invitedPeople = {"Dua Lipa","Paris Hilton","Manuel Agnelli","J-Ax","Francesco Totti","Ilary Blasi","Bebe Vio","Luis","Pardis Zarei","Martina Maccherone","Rachel Zeilic"};

        //ask user for their name
        Scanner scan = new Scanner(System.in);

        System.out.print("Hello! What's your name? ");
        String userName = scan.nextLine();

        //check if user is in the list
        boolean userInList = false;

        for (int i = 0; i < invitedPeople.length; i++) {
            if(invitedPeople[i].equals(userName)) {
                userInList = true;
                break;
            }
        }

        //print response
        if(userInList) {
            System.out.println("Come in!");
        } else {
            System.out.println("You're not on the list. Sorry!");
        }
    }
}
