package ru.vsu.cs.var_15;

import java.util.Objects;

public class Customer {
    private String name;
    private String surname;
    private Integer age;
    private Gender gender;

    public Customer(String name, String surname, Integer age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
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
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Customer customer = (Customer) object;
        return Objects.equals(name, customer.name) && Objects.equals(surname, customer.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public enum Gender {
        MALE,
        FEMALE;
    }
}
