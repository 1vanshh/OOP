package ru.vsu.cs.var_15;

import ru.vsu.cs.var_15.classes.Customer;
import ru.vsu.cs.var_15.exceptions.InvalidPassportDataException;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

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

        List<Customer> customers = new ArrayList<>();

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);
        customers.add(customer7);
        customers.add(customer8);
        customers.add(customer9);
        customers.add(customer10);
        customers.add(customer11);

        customers.stream()
                .filter(c -> c.getPassportSeries() >= getCommonPassportSeries(customers))
                .forEach(System.out::println);
        System.out.println(getCommonPassportSeries(customers));
    }
    private static double getCommonPassportSeries(List<Customer> customers) {
        return customers.stream()
                .mapToDouble(Customer::getPassportSeries)
                .average()
                .getAsDouble();
    }
}