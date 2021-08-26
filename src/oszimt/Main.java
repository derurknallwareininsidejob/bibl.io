/*
 *  Author:             ms@beronet.com
 *  Date of Change:     25.08.2021
 *  Main class of the bibl.io Program
 */

package oszimt;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        /* Testing LibCard Class */
        System.out.println("\n--------\nLibCard Class");

        /* Create Object card1 of LibCard Class */
        LibCard card1;
        card1 = new LibCard();

        System.out.println("user ID: " + card1.getId());
        System.out.println("Expiration time in s: " + card1.getExpiry_date());
        System.out.println("Valid: " + card1.isValid());

        /* change Validity to false */
        System.out.println("\n*block card*\n");
        card1.setValid(false);
        System.out.println("Valid: " + card1.isValid());

        /* change Validity to true */
        System.out.println("\n*unblock card*\n");
        card1.setValid(true);
        System.out.println("Valid: " + card1.isValid());

        /* Testing BorrowConditions Class*/
        System.out.println("\n--------\nBorrowCondition Class");

        System.out.println("Borrow Time: " +            BorrowCondition.getBorrow_time());
        System.out.println("Expiry Fee: " +             BorrowCondition.getExpiry_fee());
        System.out.println("Maximum Fee: " +            BorrowCondition.getMax_fee());
        System.out.println("Maximum Renewal Time: " +   BorrowCondition.getMax_renewal());

        /* Test LibUser Class */
        System.out.println("\n--------\nLibUser Class");

        /* Create object user1 of LibUser Class */
        LibUser user1;
        user1 = new LibUser("Max Schwab");

        System.out.println("User ID: " +  user1.getId());
        System.out.println("User Name: " + user1.getName());
        System.out.println("Fee State: " + user1.getFeeState());

        /* Print out LibCard of user */
        System.out.println("\n--------\nLibCard");

        System.out.println("User Card ID: " +  user1.getCard().getId());
        System.out.println("User Card Expiration: " + user1.getCard().getExpiry_date());
        System.out.println("User Card Valid: " + user1.getCard().isValid());

        /* Extend Card */
        user1.getCard().extend();
        System.out.println("\n*Extend Card Expiration Date*\n");
        System.out.println("User Card Expiration Extended: " + user1.getCard().getExpiry_date());

        /* Lock Card */
        user1.getCard().setValid(false);
        System.out.println("User Card Number: " + user1.getCard().getId());
        System.out.println("User Card Validity: " + user1.getCard().isValid());


        /* Test Book Class */
        //System.out.println("\n--------\nBook Class");

        /* Render GUI window for creating new LibCard
         * Unimportant for now */
        //createLibCard.renderCreateLibCard();
    }

}
