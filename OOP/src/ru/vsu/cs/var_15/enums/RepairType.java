package ru.vsu.cs.var_15.enums;

public enum RepairType {
    ENGIN_REPAIR("Ремонт двигателя", 22000),
    TRANSMISSION_REPAIR("Ремонт трансмиссии", 17000),
    BODY_REPAIR("Ремонт кузова", 8500),
    ELECTRICAL_REPAIR("Ремонт электрики", 12000);

    private final String description;
    private final double averageCost;

    RepairType(String description, double averageCost) {
        this.description = description;
        this.averageCost = averageCost;
    }

    public String getDescription() {
        return description;
    }

    public double getAverageCost() {
        return averageCost;
    }

    @Override
    public String toString() {
        return "RepairType{" +
                "description='" + description + '\'' +
                ", averageCost=" + averageCost +
                '}';
    }
}
