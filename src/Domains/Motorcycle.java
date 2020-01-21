package Domains;

import Enums.States;

public class Motorcycle extends Vehicle {
    public Motorcycle(String model, int year, String flag, Engine engine, double price, States state) {
        super(model, year, flag, engine, price, state);
    }
}
