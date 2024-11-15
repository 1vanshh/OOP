package ru.vsu.cs.var_15.interfaces;

import ru.vsu.cs.var_15.classes.car.Automobile;
import ru.vsu.cs.var_15.enums.RepairType;

import java.util.List;

public interface Repairable {

    void addIssue(String issue, double estimateCost);

    void resolveIssue(String issue);

    double calculateRepairCost();

    boolean hasIssues();

    List<String> getIssues();
}
