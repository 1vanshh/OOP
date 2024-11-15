package ru.vsu.cs.var_15.classes.car;

import ru.vsu.cs.var_15.exceptions.DuplicateVehicleException;

import java.util.HashSet;
import java.util.Set;

public class VehicleRegistry {

    private static final Set<String>  registeredVINs = new HashSet<>();
    private static final Set<String>  registeredCarNumbers = new HashSet<>();

    public static void registerVehicle(String VIN, String carNumber) throws DuplicateVehicleException {
        if (registeredVINs.contains(VIN)) {
            throw new DuplicateVehicleException("Автомобиль с VIN " + VIN + " уже зарегистрирован.");
        }
        if (registeredCarNumbers.contains(carNumber)) {
            throw new DuplicateVehicleException("Автомобиль с номером " + carNumber + " уже зарегистрирован.");
        }

        registeredVINs.add(VIN);
        registeredCarNumbers.add(carNumber);
    }
}
