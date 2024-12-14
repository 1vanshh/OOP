package ru.vsu.cs.var_15.classes;

import ru.vsu.cs.var_15.exceptions.InvalidPassportDataException;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Customer {
    private String name;
    private String surname;
    private int passportSeries;
    private int passportNumber;
    private Gender gender;
    private LocalDate birthday;

    public Customer(String name, String surname, int passportSeries, int passportNumber, Gender gender, LocalDate birthday) throws InvalidPassportDataException {
        this.name = name;
        this.surname = surname;
        setPassportSeries(passportSeries);
        setPassportNumber(passportNumber);
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPassportSeries() {
        return passportSeries;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Period getAge() {
        LocalDate today = LocalDate.now();

        Period p = Period.between(birthday, today);

        return p;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setPassportSeries(int passportSeries) throws InvalidPassportDataException {
        if (String.valueOf(passportSeries).length() != 4) {
            throw new InvalidPassportDataException("Серия паспорта должна быть длинной 4 символа.");
        }
        this.passportSeries = passportSeries;
    }

    public void setPassportNumber(int passportNumber) throws InvalidPassportDataException{
        if (String.valueOf(passportNumber).length() != 6) {
            throw new InvalidPassportDataException("Номер паспорта должен быть длинной 6 символа.");
        }
        this.passportNumber = passportNumber;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", passportSeries=" + passportSeries +
                ", passportNumber=" + passportNumber +
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return passportSeries == customer.passportSeries && passportNumber == customer.passportNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportSeries, passportNumber);
    }

    public enum Gender {
        MALE,
        FEMALE;
    }
}
