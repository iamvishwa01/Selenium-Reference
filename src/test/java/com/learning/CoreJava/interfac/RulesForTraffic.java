package com.learning.CoreJava.interfac;

public class RulesForTraffic implements trafficRules{

public static void main(String args[]) {
    trafficRules ts = new RulesForTraffic();
    ts.greenLight();
    ts.redLight();ts.yellowLight();

}
    @Override
    public void redLight() {
      System.out.println("Red light to stop");
    }

    @Override
    public void yellowLight() {
        System.out.println("yellow light to wait");
    }

    @Override
    public void greenLight() {
        System.out.println("green light to go");
    }
}
