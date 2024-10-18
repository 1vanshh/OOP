package ru.vsu.cs.var_15.car;

import java.awt.*;

public class Automobile {
    private String carBrand;
    private String WIN;
    private String carNumber;
    private Color color;

    public Automobile(String carBrand, String WIN, String carNumber, Color color) {
        this.carBrand = carBrand;
        this.WIN = WIN;
        this.carNumber = carNumber;
        this.color = color;
    }

    public Automobile() {

    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getWIN() {
        return WIN;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public Color getColor() {
        return color;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setWIN(String WIN) {
        this.WIN = WIN;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "carBrand='" + carBrand + '\'' +
                ", WIN='" + WIN + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", color=" + color +
                '}';
    }

    public String repair() {
        return "Автомобиль отремонтирован!";
    }

    public String startEngine() {
        return "Автомобиль запущен.";
    }
}

