/* const rate = by state;
    int tax = 0;
     if (motor.power >= 200) {
        tax = (year/2 + price*rate)^3
        return tax;
     }
     tax = (year/2 + price*rate)^2
     return tax;

*/
public class Main {
    public enum STATES {
        A, B, C;
    }

    public static class Motor {
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

        public Motor(int power, String fuel) {
            this.power = power;
            this.fuel = fuel;
        }
    }

    public static class Car {
        private String model;
        private int year;
        private String flag;
        private Motor motor;
        private double price;
        private STATES state;

        public Car (String model, String flag, int year, Motor motor, double price, STATES state) {
            this.model = model;
            this.year = year;
            this.flag = flag;
            this.motor = motor;
            this.price = price;
            this.state = state;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getFlag() {
            return flag;
        }

        public void setFlag(String flag) {
            this.flag = flag;
        }

        public Motor getMotor() {
            return motor;
        }

        public void setMotor(Motor motor) {
            this.motor = motor;
        }

        public void calculateTax() {
            int rate = 0;
            if (this.state == STATES.A) {
                rate = 2;
            }
            if (this.state == STATES.B) {
                rate = 4;
            }
            if (this.state == STATES.C) {
                rate = 12;
            }
            if (this.motor.power >= 200) {
                double tax = (float) ((this.year/2) + this.price*rate);
                tax = Math.pow(tax, 3);
                System.out.println(tax);
            }
            if (this.motor.power < 200) {
                double tax = (float) ((this.year/2) + this.price*rate);
                tax = Math.pow(tax, 2);
                System.out.println(tax);
            }
        }
    }


    public static void main(String[] args) {
        Motor v8 = new Motor(200, "Diesel");
        Motor v3 = new Motor(100, "Diesel");
        Car ferrari = new Car("ferrari", "abc-123", 2019, v8, 500.000, STATES.A);
        Car fox = new Car("fox", "abc-321", 2019, v3, 200.000, STATES.C);
        ferrari.calculateTax();
        fox.calculateTax();
    }
}
