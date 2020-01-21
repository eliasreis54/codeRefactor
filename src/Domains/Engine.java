package Domains;

public class Engine {
    private int power;
    private String fuel;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public Engine(int power, String fuel) {
        this.power = power;
        this.fuel = fuel;
    }
}