package ru.vsu.cs.var_15.classes;

import ru.vsu.cs.var_15.classes.car.Automobile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Objects;

public class Application {
    private Customer customer;
    private Automobile automobile;
    private LocalDate dateOfApplication;

    public Application(Customer customer, Automobile automobile, LocalDate dateOfApplication) {
        this.customer = customer;
        this.automobile = automobile;
        setDateOfApplication(dateOfApplication);
    }

    public Application(Customer customer, LocalDate dateOfApplication) {
        this(customer, null, dateOfApplication);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Automobile getAutomobile() {
        return automobile;
    }

    public LocalDate getDateOfApplication() {
        return dateOfApplication;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAutomobile(Automobile automobile) {
        this.automobile = automobile;
    }

    public void setDateOfApplication(LocalDate dateOfApplication) {
        this.dateOfApplication = dateOfApplication;
    }

    public String getFormattedDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dateOfApplication.format(formatter);
    }

    @Override
    public String toString() {
        return "Application{" +
                "customer=" + customer +
                ", automobile=" + automobile +
                ", dateOfApplication=" + getFormattedDate() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Application that = (Application) o;
        return Objects.equals(customer, that.customer) && Objects.equals(automobile, that.automobile) && Objects.equals(dateOfApplication, that.dateOfApplication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer, automobile, dateOfApplication);
    }

    public void repairAutomobile() {
        if (Objects.isNull(automobile)) {
            return;
        }
    }
}
