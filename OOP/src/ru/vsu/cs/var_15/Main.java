package ru.vsu.cs.var_15;

import ru.vsu.cs.var_15.classes.car.Automobile;
import ru.vsu.cs.var_15.classes.car.Car;
import ru.vsu.cs.var_15.classes.car.Truck;
import ru.vsu.cs.var_15.classes.Application;
import ru.vsu.cs.var_15.classes.Customer;
import ru.vsu.cs.var_15.classes.car.VehicleRegistry;
import ru.vsu.cs.var_15.enums.RepairType;
import ru.vsu.cs.var_15.exceptions.DuplicateVehicleException;
import ru.vsu.cs.var_15.exceptions.InvalidPassportDataException;
import ru.vsu.cs.var_15.interfaces.AutomobileRepairing;

import java.awt.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws InvalidPassportDataException {
//        Automobile truck = new Truck("KAMAZ", "WVGZZZ5493275", "X001AM36", Color.RED);
//        Application application = new Application(customer, new Date());
//        car.addIssue(RepairType.BODY_REPAIR.getDescription(), RepairType.BODY_REPAIR.getAverageCost());



//        Automobile car1 = new Car("VAZ", "1WX654ZYYXX", "X699VC136", Color.GRAY);
//
//        car.addIssue("Подкачка колеса", 700);
//        car1.addIssue("Подкачка колеса", 700);
//
//        System.out.println(car.calculateRepairCost());
//        System.out.println(car1.calculateRepairCost());


//        try {
//            Customer customer1 = new Customer("Ivan", "Ivanov", 1234, 567890, 30, Customer.Gender.MALE);
//            System.out.println("Клиент создан: " + customer1);
//
//            Customer customer2 = new Customer("Anna", "Petrova", 123, 56789, 25, Customer.Gender.FEMALE);
//        } catch (InvalidPassportDataException e) {
//            System.err.println("Ошибка: " + e.getMessage());
//        }

//        try {
//            VehicleRegistry.registerVehicle("1WX654ZYYXX", "X699VC136"); // Успешная регистрация
//            VehicleRegistry.registerVehicle("1WX654ZYYXX", "X123VC136"); // Ошибка: дубликат VIN
//        } catch (DuplicateVehicleException e) {
//            System.err.println("Ошибка: " + e.getMessage());
//        }
//
//        try {
//            VehicleRegistry.registerVehicle("WVGZZZ5493275", "X699VC136"); // Ошибка: дубликат номера
//        } catch (DuplicateVehicleException e) {
//            System.err.println("Ошибка: " + e.getMessage());
//        }


        Customer customer1 = new Customer("Ivan", "Shamaev", 1234, 123456, Customer.Gender.MALE, LocalDate.of(2005, Month.SEPTEMBER, 6));
        Automobile car = new Car(customer1,"KIA", "1WX654ZYYXX", "X699VC136", Color.GRAY);

        System.out.println(customer1.toString());

        Period p = customer1.getAge();

        System.out.println("Возраст клиента: " + p.getYears() + " лет, " + p.getMonths() + " месяца, " + p.getDays() + " дней.");

        Application application = new Application(customer1, car, LocalDate.now());

        System.out.println(application.toString());
    }
}