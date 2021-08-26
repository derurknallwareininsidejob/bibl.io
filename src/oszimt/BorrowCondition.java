
/*
 *  Author:             ms@beronet.com
 *  Date of Change:     25.08.2021
 *  Implements the BorrowConditions
 */

package oszimt;

public class BorrowCondition {

    private static int      borrow_time;
    private static int      expiry_fee;
    private static int      max_fee;
    private static int      max_renewal;

    static {
        //example values
        borrow_time =   4;
        expiry_fee =    5;
        max_fee =       10;
        max_renewal =   10;
    }

    public static int getBorrow_time() {
        return borrow_time;
    }

    public static void setBorrow_time(int borrow_time) {
        BorrowCondition.borrow_time = borrow_time;
    }

    public static int getExpiry_fee() {
        return expiry_fee;
    }

    public static void setExpiry_fee(int expiry_fee) {
        BorrowCondition.expiry_fee = expiry_fee;
    }

    public static int getMax_fee() {
        return max_fee;
    }

    public static void setMax_fee(int max_fee) {
        BorrowCondition.max_fee = max_fee;
    }

    public static int getMax_renewal() {
        return max_renewal;
    }

    public static void setMax_renewal(int max_renewal) {
        BorrowCondition.max_renewal = max_renewal;
    }
}
