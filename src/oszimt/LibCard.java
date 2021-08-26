/*
 *  Author:             ms@beronet.com
 *  Date of Change:     25.08.2021
 *  LibCard implements functionality for the library Card
 */

package oszimt;

import java.time.LocalDate;

public class LibCard {

    /* Var declaration */
    private int             id;             //unique ID
    private LocalDate       expiry_date;    //Expiry Date
    private boolean         valid;

    /* Constructer */
    public LibCard() {
        this.id = (int)(Math.random()*((9999999-1000000)+1)) +1;
        this.expiry_date = LocalDate.now().plusYears(1);
        this.valid = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(long expiry_date) {
        this.expiry_date = this.expiry_date.plusYears(1);
    }

    /* Extends the expiry date by one year */
    public void extend() {
        this.expiry_date = this.expiry_date.plusYears(1);
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

}
