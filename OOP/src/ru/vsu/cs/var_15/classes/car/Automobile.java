package ru.vsu.cs.var_15.classes.car;

import ru.vsu.cs.var_15.interfaces.Repairable;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Automobile implements Repairable {
    private String carBrand;
    private String VIN;
    private String carNumber;
    private Color color;
    private List<Issue> issues = new ArrayList<>();
    private double totalRepairCost = 0;

    public Automobile(String carBrand, String VIN, String carNumber, Color color) {
        this.carBrand = carBrand;
        this.VIN = VIN;
        this.carNumber = carNumber;
        this.color = color;
    }

    public Automobile() {

    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getVIN() {
        return VIN;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public List<String> getIssues() {
        List<String> issuesDescription = new ArrayList<>();
        for (Issue issue : issues)
            issuesDescription.add(issue.description);

        return issuesDescription;
    }

    public double getTotalRepairCost() {
        return totalRepairCost;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
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
                ", WIN='" + VIN + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automobile that = (Automobile) o;
        return Objects.equals(VIN, that.VIN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(VIN);
    }

    @Override
    public void addIssue(String issue, double estimateCost) {
        issues.add(new Issue(issue, estimateCost));
        totalRepairCost += estimateCost;
    }

    @Override
    public void resolveIssue(String issue) {
        issues.removeIf(i -> i.getDescription().equals(issue));
    }

    @Override
    public double calculateRepairCost() {
        return totalRepairCost;
    }

    @Override
    public boolean hasIssues() {
        return !issues.isEmpty();
    }

    public void repair() {
        issues.clear();
        totalRepairCost = 0;
    }

    public String startEngine() {
        return "Автомобиль запущен.";
    }

    public static class Issue {
        private String description;
        private double cost;

        public Issue(String description, double cost) {
            this.description = description;
            this.cost = cost;
        }

        public String getDescription() {
            return description;
        }

        public double getCost() {
            return cost;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }
    }
}

