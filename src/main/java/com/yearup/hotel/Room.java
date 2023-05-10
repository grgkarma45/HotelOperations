package com.yearup.hotel;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean checkIn;
    private boolean checkout;
    private boolean cleanroom;


    public boolean isCheckIn() {
        return checkIn;
    }

    public void setCheckIn(boolean checkIn) {
        this.checkIn = checkIn;
    }

    public boolean isCheckout() {
        return checkout;
    }

    public void setCheckout(boolean checkout) {
        this.checkout = checkout;
    }

    public boolean isCleanroom() {
        return cleanroom;
    }

    public void setCleanroom(boolean cleanroom) {
        this.cleanroom = cleanroom;
    }

    enum Status {OCCUPIED, DIRTY, AVAILABLE}

    // Getters and Setters
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Constructor
    public Room(int numberOfBeds, double price, boolean checkIn, boolean checkout, boolean cleanroom) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.checkIn = checkIn;
        this.checkout = checkout;
        this.cleanroom = cleanroom;
    }
}