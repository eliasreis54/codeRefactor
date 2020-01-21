package Domains;

import Enums.States;
import Interfaces.withDoors;

public class Car extends Vehicle implements withDoors {
    private boolean isDoorOpen = false;

    public Car(String model, int year, String flag, Engine engine, double price, States state) {
        super(model, year, flag, engine, price, state);
    }

    @Override
    public void openDoor() {
        this.setDoorOpen(true);
        System.out.println("a porta está aberta");
    }

    @Override
    public void closeDoor() {
        this.setDoorOpen(false);
        System.out.println("a porta está fechada");
    }

    public boolean isDoorOpen() {
        return isDoorOpen;
    }

    private void setDoorOpen(boolean doorOpen) {
        isDoorOpen = doorOpen;
    }
}
