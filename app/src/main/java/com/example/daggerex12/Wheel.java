package com.example.daggerex12;

public class Wheel {

    //Assuming this as a 3rd party library

    private Rims rims;
    private Tires tires;

    public Wheel(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
