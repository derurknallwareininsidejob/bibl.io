/*
 *  Author:             ms@beronet.com / hi@mily.dev
 *  Date of Change:     25.08.2021
 *  LibCard implements functionality for the libary Card
 */

package oszimt;

public class LibCard {

    /* Var declaration */
    private int             id;             //unique ID
    private long            expiry_date;    //Expiry Date in epoch timestamp
    private boolean         valid;

    /* Constructer */
    public LibCard() {
        this.id = (int)(Math.random()*(9999999-1000000) );
        this.expiry_date = ((System.currentTimeMillis()/1000L) + 31622400);
        this.valid = true;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(long expiry_date) {
        this.expiry_date = expiry_date;
    }

    /* Extends the expiry date by one year */
    public void extend() {
        this.expiry_date = this.expiry_date + 31622400;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

}
