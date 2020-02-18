package com.jiker.keju.bean;


public class Taxi {

    public int valuation(int mileage, int waitingTime) {
        double total = 6;
        total += mileage > 2 ? (mileage - 2)*0.8 : 0;
        total += mileage > 8 ? (mileage - 8) * (0.8 * 0.5) : 0;
        total += waitingTime > 0 ? waitingTime * 0.25 : 0;
        return (int) Math.round(total);
    }
}
