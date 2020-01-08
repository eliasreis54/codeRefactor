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

    public static class M {
        private int power;
        private String fuel;

        // get power
        public int getPower() {
            return power;
        }

        // set power
        public void setPower(int power) {
            this.power = power;
        }

        // get fuel
        public String getFuel() {
            return fuel;
        }

        // set fuel
        public void setFuel(String fuel) {
            this.fuel = fuel;
        }

        public M(int power, String fuel) {
            this.power = power;
            this.fuel = fuel;
        }
    }

    public static class C {
        private String model;
        private int year;
        private String flag;
        private M motor;
        private double price;
        private STATES state;

        public C(String model, String flag, int year, M motor, double price, STATES state) {
            this.model = model;
            this.year = year;
            this.flag = flag;
            this.motor = motor;
            this.price = price;
            this.state = state;
        }

        // get model definition
        public String getModel() {
            return model;
        }

        // set model definition
        public void setModel(String model) {
            this.model = model;
        }

        // get year definition
        public int getYear() {
            return year;
        }

        // set year definition
        public void setYear(int year) {
            this.year = year;
        }

        // get flag definition
        public String getFlag() {
            return flag;
        }

        // set flag definition
        public void setFlag(String flag) {
            this.flag = flag;
        }

        // get motor definition
        public M getMotor() {
            return motor;
        }

        // set motor definition
        public void setMotor(M motor) {
            this.motor = motor;
        }

        public void calc() {
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
        M v8 = new M(200, "Diesel");
        M v3 = new M(100, "Diesel");
        C c = new C("ferrari", "abc-123", 2019, v8, 500.000, STATES.A);
        C c2 = new C("fox", "abc-321", 2019, v3, 200.000, STATES.C);
        c.calc();
        c2.calc();
    }
}
