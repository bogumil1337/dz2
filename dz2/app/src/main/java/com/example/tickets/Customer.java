package com.example.tickets;

import java.io.Serializable;

public class Customer implements Serializable {
    private String ID;
    private String mesto;
    private String On;
    private String Off;
    private String cash;

    public Customer(String ID, String mesto, String on, String off, String cash) {
        this.ID = ID;
        this.mesto = mesto;
        On = on;
        Off = off;
        this.cash = cash;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public String getOn() {
        return On;
    }

    public void setOn(String on) {
        On = on;
    }

    public String getOff() {
        return Off;
    }

    public void setOff(String off) {
        Off = off;
    }

    public String getCash() {
        return cash;
    }

    public void setCash(String cash) {
        this.cash = cash;
    }
}
