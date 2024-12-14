package ru.vsu.cs.var_15.classes.car;

import ru.vsu.cs.var_15.classes.Customer;

import java.awt.*;

public class Truck extends Automobile{

    private int maxPermissibleWeight;

    private static String autoType;

    {
        System.out.println("Приехала грузовая машина.");
    }

    public Truck(Customer owner, String carBrand, String WIN, String carNumber, Color color) {
        super(owner ,carBrand, WIN, carNumber, color);
    }

    static {
        autoType = "C";
    }

    public int getMaxPermissibleWeight() {
        return maxPermissibleWeight;
    }
    public void setMaxPermissibleWeight(int maxPermissibleWeight) {
        this.maxPermissibleWeight = maxPermissibleWeight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "maxWeight=" + maxPermissibleWeight +
                '}' + super.toString();
    }

    @Override
    public String startEngine() {
        return "Грузовой автомобиль запущен.";
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
