package ru.vsu.cs.var_15.interfaces;

import ru.vsu.cs.var_15.classes.car.Automobile;

@FunctionalInterface
public interface AutomobileRepairing {
    void repair(Automobile automobile);
}
