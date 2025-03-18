package Day6.IOStreams.ObjectSerialization;

import java.io.Serializable;

public class CardDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    private long cardNumber;
    private String cardHolderName;
    private int month;
    private int year;
    private int cvv;

    public CardDetails(long cardNumber, String cardHolderName, int month, int year, int cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.month = month;
        this.year = year;
        this.cvv = cvv;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }
}
