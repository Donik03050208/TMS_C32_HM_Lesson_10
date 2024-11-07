package model;

import java.util.Objects;

public class Card {
    private String cardNumber;
    private int cvv;
    private double amount;

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber='" + cardNumber + '\'' +
                ", cvv=" + cvv +
                ", amount=" + amount +
                '}';
    }

    public Card(String cardNumber, int cvv, double amount) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.amount = amount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cvv == card.cvv && Objects.equals(cardNumber, card.cardNumber);
    }



    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, cvv);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}

