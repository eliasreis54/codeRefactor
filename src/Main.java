import Domains.Car;
import Domains.Engine;
import Domains.Motorcycle;
import Enums.States;

public class Main {
    public static void main(String[] args) {
        Engine v8 = new Engine(200, "Diesel");
        Engine v3 = new Engine(100, "Diesel");

        Car ferrari = new Car("ferrari", 2019, "abc-123", v8, 500000, States.A);
        Car fox = new Car("fox", 2019, "abc-321", v3, 200000, States.C);

        Motorcycle CG = new Motorcycle("CG 160",2018,"def-456", v3, 10000, States.B);
        Motorcycle fazer = new Motorcycle("Fazer 150", 2018, "def-654", v3, 11000, States.A);

        ferrari.calc();
        fox.calc();

        CG.calc();
        fazer.calc();
    }
}
