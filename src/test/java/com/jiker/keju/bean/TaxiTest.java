package com.jiker.keju.bean;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class TaxiTest {


    @Test
    public void valuation1kilometers() {
        Taxi taxi=new Taxi();
        int total=taxi.valuation(1,0);
        int expected=6;
        Assert.assertEquals(expected,total,0);
    }

    @Test
    public void valuation3kilometers() {
        Taxi taxi=new Taxi();
        int total=taxi.valuation(3,0);
        int expected=7;
        Assert.assertEquals(expected,total,0);
    }

    @Test
    public void valuation10kilometers() {
        Taxi taxi=new Taxi();
        int total=taxi.valuation(10,0);
        System.out.println(total);
        int expected=13;
        Assert.assertEquals(expected,total,0);
    }

    @Test
    public void valuation2kilometers3Minutes() {
        Taxi taxi=new Taxi();
        int total=taxi.valuation(2,3);
        System.out.println(total);
        int expected=7;
        Assert.assertEquals(expected,total,0);
    }
}
