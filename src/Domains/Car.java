package Domains;

import Enums.States;
import Interfaces.withDors;

public class Car extends Vehicle implements withDors {
    public Car(String model, int year, String flag, Engine engine, double price, States state) {
        super(model, year, flag, engine, price, state);
    }

    @Override
    public void openDor() {
        System.out.println("a porta está aberta");
    }

    @Override
    public void closeDor() {
        System.out.println("a porta está fechada");
    }
}
