package ru.vsu.cs.var_15.car;

import java.awt.*;

public class Truck extends Automobile{

    private int maxPermissibleWeight;

    private static String autoType;

    {
        System.out.println("Приехала грузовая машина.");
    }

    public Truck(String carBrand, String WIN, String carNumber, Color color) {
        super(carBrand, WIN, carNumber, color);
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
    public String repair() {
        return "Грузовой автомобиль отремонтирован!";
    }

    @Override
    public String startEngine() {
        return "Грузовой автомобиль запущен.";
    }
}