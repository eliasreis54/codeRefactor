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

        public Motor(int power, String fuel) {
            this.power = power;
            this.fuel = fuel;
        }
    }

    interface Vehicle {
        public boolean notShouldPayIpva();
        public double getIpvaPrice();
        public void openDoor();
        public void closeDoor();
    }

    public static class C implements Vehicle {
        private String mdl;
        private int yr;
        private String fl;
        private Motor m;
        private double pr;
        private STATES st;
        private boolean doorOpen = false;

        public C(String model, String flag, int year, M motor, double price, STATES state) {
            this.mdl = model;
            this.yr = year;
            this.fl = flag;
            this.m = motor;
            this.pr = price;
            this.st = state;
        }

        // get model definition
        public String getMdl() {
            return mdl;
        }

        // set model definition
        public void setMdl(String mdl) {
            this.mdl = mdl;
        }

        // get year definition
        public int getYr() {
            return yr;
        }

        // set year definition
        public void setYr(int yr) {
            this.yr = yr;
        }

        // get flag definition
        public String getFl() {
            return fl;
        }

        // set flag definition
        public void setFl(String fl) {
            this.fl = fl;
        }

        // get motor definition
        public Motor getM() {
            return m;
        }

        // set motor definition
        public void setM(Motor motor) {
            this.m = motor;
        }

        public void calc() {
            int rate;
            rate = 0;
            if (this.st == STATES.A) {
                rate = 2;
            }
            if (this.st == STATES.B) {
                rate = 4;
            }
            if (this.st == STATES.C) {
                rate = 12;
            }
            if (this.m.power >= 200) {
                double tax;
                tax = (float) ((this.yr /2) + this.pr *rate);
                tax = Math.pow(tax, 3);
                System.out.println(tax);
            }
            if (this.m.power < 200) {
                double tax;
                tax = (float) ((this.yr /2) + this.pr *rate);
                tax = Math.pow(tax, 2);
                System.out.println(tax);
            }
        }

        public boolean notShouldPayIpva() {
            if (this.yr - 2019 >= 20)
                return true;
            return false;
        }

        public double getIpvaPrice() {
            double p;
            double i;

            p = this.pr;
            i = 0.04 * p;

            return i;
        }

        public void openDoor() {
            if (this.doorOpen == false)
                this.doorOpen = true;
        }

        public void closeDoor() {
            if (this.doorOpen == true)
                this.doorOpen = false;
        }
    }

    public static class M implements Vehicle() {
        private String mdl;
        private int yr;
        private String fl;
        private Motor m;
        private double pr;

        public M(String model, String flag, int year, M motor, double price) {
            this.mdl = model;
            this.yr = year;
            this.fl = flag;
            this.m = motor;
            this.pr = price;
        }

        // get model definition
        public String getMdl() {
            return mdl;
        }

        // set model definition
        public void setMdl(String mdl) {
            this.mdl = mdl;
        }

        // get year definition
        public int getYr() {
            return yr;
        }

        // set year definition
        public void setYr(int yr) {
            this.yr = yr;
        }

        // get flag definition
        public String getFl() {
            return fl;
        }

        // set flag definition
        public void setFl(String fl) {
            this.fl = fl;
        }

        // get motor definition
        public Motor getM() {
            return m;
        }

        // set motor definition
        public void setM(Motor motor) {
            this.m = motor;
        }

        public boolean notShouldPayIpva() {
            if (this.yr - 2019 >= 20)
                return true;
            return false;
        }

        public double getIpvaPrice() {
            double p;
            double i;

            p = this.pr;
            i = 0.04 * p;

            return i;
        }

        public void openDoor() {
            System.out.println("Moto não tem porta!")
        }

        public void closeDoor() {
            System.out.println("Moto não tem porta!")
        }
    }

    public static void main(String[] args) {
        Motor v8 = new Motor(200, "Diesel");
        Motor v3 = new Motor(100, "Diesel");

        C c = new C("ferrari", "abc-123", 2019, v8, 500000, STATES.A);
        C c2 = new C("fox", "abc-321", 2019, v3, 200000, STATES.C);

        M m = new M("CG 160", "def-456", 2018, v3, 10000);
        M m2 = new M("Fazer 150", "def-654", 2018, v3, 11000);

        c.calc();
        c2.calc();
    }
}
