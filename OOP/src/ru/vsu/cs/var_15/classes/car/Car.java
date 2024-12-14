package ru.vsu.cs.var_15.classes.car;

import ru.vsu.cs.var_15.classes.Customer;

import java.awt.*;

public class Car extends Automobile{

    private String drive; //Привод автомобиля

    private static String autoType;

    {
        System.out.println("Приехала легковая машина.");
    }

    public Car(Customer owner, String carBrand, String WIN, String carNumber, Color color) {
        super(owner ,carBrand, WIN, carNumber, color);
    }

    static {
        autoType = "B";
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    @Override
    public String toString() {
        return "Car{" +
                "drive='" + drive + '\'' +
                '}' + super.toString();
    }

    @Override
    public String startEngine() {
        return "Легковой автомобиль запущен.";
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
