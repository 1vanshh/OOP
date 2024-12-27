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
        Customer customer1 = new Customer("Roman", "Ivanov", 1111, 789123, Customer.Gender.MALE, LocalDate.of(1990, Month.JANUARY, 5));
        Customer customer2 = new Customer("Elena", "Smirnova", 1222, 456789, Customer.Gender.FEMALE, LocalDate.of(1995, Month.APRIL, 12));
        Customer customer3 = new Customer("Pavel", "Kuzmin", 1333, 987654, Customer.Gender.MALE, LocalDate.of(1988, Month.DECEMBER, 30));
        Customer customer4 = new Customer("Maxim", "Tikhonov", 9012, 556677, Customer.Gender.MALE, LocalDate.of(2001, Month.MARCH, 15));
        Customer customer5 = new Customer("Olga", "Petrova", 2345, 654321, Customer.Gender.FEMALE, LocalDate.of(1998, Month.MAY, 14));
        Customer customer6 = new Customer("Alexey", "Volkov", 3456, 112233, Customer.Gender.MALE, LocalDate.of(2002, Month.DECEMBER, 1));
        Customer customer7 = new Customer("Diana", "Kuznetsova", 4567, 445566, Customer.Gender.FEMALE, LocalDate.of(2004, Month.AUGUST, 19));
        Customer customer8 = new Customer("Andrey", "Ivanov", 5678, 778899, Customer.Gender.MALE, LocalDate.of(2000, Month.JUNE, 3));
        Customer customer9 = new Customer("Ekaterina", "Sidorova", 6789, 990011, Customer.Gender.FEMALE, LocalDate.of(1997, Month.JANUARY, 22));
        Customer customer10 = new Customer("Sergey", "Nikolaev", 7890, 223344, Customer.Gender.MALE, LocalDate.of(2003, Month.NOVEMBER, 11));
        Customer customer11 = new Customer("Maria", "Fedorova", 8901, 334455, Customer.Gender.FEMALE, LocalDate.of(1999, Month.FEBRUARY, 25));


        Automobile automobile1 = new Car(customer1,"VAZ", "WI12345", "X999XX136", Color.GRAY);
        Automobile automobile2 = new Car(customer2,"KIA", "WI1AS2345", "H317OO136", Color.ORANGE);
        Automobile automobile3 = new Car(customer3,"BMW", "WI1312345", "M123ME136", Color.RED);
        Automobile automobile4 = new Car(customer4,"TOYOTA", "T1837O", "O912OO36", Color.BLACK);
        Automobile automobile5 = new Car(customer5,"TOYOTA", "T1123837O", "H132AK136", Color.BLACK);
        Automobile automobile6 = new Car(customer6,"HEYDAY", "TY1245AJ", "O957XT36", Color.WHITE);
        Automobile automobile7 = new Car(customer7,"MAZDA", "777AAA1", "T276MP136", Color.GRAY);
        Automobile automobile8 = new Truck(customer8,"KAMAZ", "GHI12345", "Z999ZZ139", Color.GREEN);
        Automobile automobile9 = new Truck(customer9,"MAZ", "JKL12345", "A999AA140", Color.WHITE);
        Automobile automobile10 = new Truck(customer10,"MAN", "PQR12345", "C999CC142", Color.YELLOW);
        Automobile automobile11 = new Car(customer11,"Honda", "MNO12345", "B999BB141", Color.RED);

        Application application1 = new Application(customer1, automobile1, LocalDate.now());
        Application application2 = new Application(customer2, automobile2, LocalDate.of(2023, Month.DECEMBER, 25));
        Application application3 = new Application(customer3, automobile3, LocalDate.of(2023, Month.NOVEMBER, 15));
        Application application4 = new Application(customer4, automobile4, LocalDate.of(2023, Month.OCTOBER, 10));
        Application application5 = new Application(customer5, automobile5, LocalDate.of(2023, Month.SEPTEMBER, 5));
        Application application6 = new Application(customer6, automobile6, LocalDate.of(2023, Month.AUGUST, 20));
        Application application7 = new Application(customer7, automobile7, LocalDate.of(2023, Month.JULY, 30));
        Application application8 = new Application(customer8, automobile8, LocalDate.of(2023, Month.JUNE, 18));
        Application application9 = new Application(customer9, automobile9, LocalDate.of(2023, Month.MAY, 12));
        Application application10 = new Application(customer10, automobile10, LocalDate.of(2023, Month.APRIL, 3));
        Application application11 = new Application(customer11, automobile11, LocalDate.of(2023, Month.MARCH, 27));
    }
}