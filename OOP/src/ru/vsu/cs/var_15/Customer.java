package ru.vsu.cs.var_15;

import java.util.Objects;

public class Customer {
    private String name;
    private String surname;
    private int passportSeries;
    private int passportNumber;
    private Integer age;
    private Gender gender;

    public Customer(String name, String surname, int passportSeries, int passportNumber, Integer age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
        this.age = age;
        this.gender = gender;
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

    public Integer getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPassportSeries(int passportSeries) {
        this.passportSeries = passportSeries;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void setAge(Integer age) {
        this.age = age;
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
                ", age=" + age +
                ", gender=" + gender +
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
