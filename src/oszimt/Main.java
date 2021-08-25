/*
 *  Author:             ms@beronet.com
 *  Date of Change:     25.08.2021
 *  Main class of the bibl.io Program
 */

package oszimt;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        /* Create Object user1 of LibCard */
        LibCard user1;
        user1 = new LibCard();

        /* Print out user1 (LibCard Object) Vars */
        System.out.println("user ID: " + user1.getId());
        System.out.println("Expiration time in s: " + user1.getExpiry_date());
        System.out.println("Valid: " + user1.isValid());

        /* change Validity to false */
        System.out.println("\n*block card*\n");
        user1.setValid(false);
        System.out.println("Valid: " + user1.isValid());

        /* change Validity to true */
        System.out.println("\n*unblock card*\n");
        user1.setValid(true);
        System.out.println("Valid: " + user1.isValid());

        /* Print out BorrowCondition Vars*/
        System.out.println("\n--------\nBorrowCondition");

        System.out.println("Borrow Time: " +            BorrowCondition.getBorrow_time());
        System.out.println("Expiry Fee: " +             BorrowCondition.getExpiry_fee());
        System.out.println("Maximum Fee: " +            BorrowCondition.getMax_fee());
        System.out.println("Maximum Renewal Time: " +   BorrowCondition.getMax_renewal());

        /* Render GUI window for creating new LibCard
         * Unimportant for now */
        //createLibCard.renderCreateLibCard();
    }

}
