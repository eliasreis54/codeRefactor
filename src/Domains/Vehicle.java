package Domains;

import Enums.FixedTax;
import Enums.States;

public abstract class Vehicle {
    private String model;
    private int year;
    private String flag;
    private Engine engine;
    private double price;
    private States state;

    public Vehicle(String model, int year, String flag, Engine engine, double price, States state) {
        this.model = model;
        this.year = year;
        this.flag = flag;
        this.engine = engine;
        this.price = price;
        this.state = state;
    }

    boolean notShouldPay() {
        if (this.year - 2019 >= 20)
            return true;
        return false;
    };

    double getPriceWithTax() {
        return 0.04 * this.price;
    };

    public int getStateRate() {
        switch (this.getState()) {
            case A:
                return 2;
            case B:
                return 4;
            case C:
                return 12;
        }
        return 0;
    };

    public double formula(FixedTax fixedTax) {
        double tax;
        tax = (float) ((this.getYear() /2) + this.getPrice() * getStateRate());
        return Math.pow(tax, fixedTax.getValue());
    };

    public void calc() {
        if (this.engine.getPower() >= 200) {
            System.out.println(formula(FixedTax.POWER_GE_200));
        }
        if (this.engine.getPower() < 200) {
            System.out.println(formula(FixedTax.POWER_LT_200));
        }
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFlag() {
        return flag;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public States getState() {
        return state;
    }

    public void setState(States state) {
        this.state = state;
    }
}
