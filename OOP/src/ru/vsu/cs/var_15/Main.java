package ru.vsu.cs.var_15;

import ru.vsu.cs.var_15.classes.car.Automobile;
import ru.vsu.cs.var_15.classes.car.Car;
import ru.vsu.cs.var_15.classes.car.Truck;
import ru.vsu.cs.var_15.classes.Application;
import ru.vsu.cs.var_15.classes.Customer;
import ru.vsu.cs.var_15.interfaces.AutomobileRepairing;

import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Ivan", "Shamaev", 2020, 12345, 19, Customer.Gender.MALE);
        Automobile car = new Car("KIA", "1WX654ZYYXX", "X699VC136", Color.GRAY);
        Automobile truck = new Truck("KAMAZ", "WVGZZZ5493275", "X001AM36", Color.RED);
        Application application = new Application(customer, new Date());
        car.addIssue("Поломка в двигателе", 15000);
        car.addIssue("Поломка в двигателе", 123414);

        System.out.println(car.calculateRepairCost());

        AutomobileRepairing repairing = automobile -> {
            if (automobile.hasIssues()) {
                automobile.repair();
            } else {
                System.out.println("Все норм");
            }
        };

        repairing.repair(car);
        System.out.println(car.getIssues());
    }
}