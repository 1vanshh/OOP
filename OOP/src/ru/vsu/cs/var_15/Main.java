package ru.vsu.cs.var_15;

import ru.vsu.cs.var_15.car.Automobile;
import ru.vsu.cs.var_15.car.Car;
import ru.vsu.cs.var_15.car.Truck;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Ivan", "Shamaev", 2020, 12345, 19, Customer.Gender.MALE);
        Automobile car = new Car("KIA", "1WX654ZYYXX", "X699VC136", Color.GRAY);
        Automobile car1 = new Truck("KIA", "1WX654ZYYXX", "X699VC136", Color.GRAY);
        Automobile truck = new Truck("KAMAZ", "WVGZZZ5493275", "X001AM36", Color.RED);
        Application application = new Application(customer, new Date());

//        ArrayList<Automobile> list = new ArrayList<>();
//        list.add(car);
//        list.add(truck);
//
//        System.out.println();
//        for (Automobile automobile : list) {
//            System.out.println(automobile.startEngine());
//        }
//
//        System.out.println();
//        System.out.println(application.repairAutomobile());
//
//        application.setAutomobile(truck);
//
//        System.out.println(application.repairAutomobile());

        System.out.println(car1.equals(truck));
    }
}