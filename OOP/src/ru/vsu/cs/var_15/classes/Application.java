package ru.vsu.cs.var_15.classes;

import ru.vsu.cs.var_15.classes.car.Automobile;

import java.util.Date;
import java.util.Objects;

public class Application {
    private Customer customer;

    private Automobile automobile;

    private Date dateOfApplication;

    public Application(Customer customer, Automobile automobile, Date dateOfApplication) {
        this.customer = customer;
        this.automobile = automobile;
        this.dateOfApplication = dateOfApplication;
    }

    public Application(Customer customer, Date dateOfApplication) {
        this(customer, null, dateOfApplication);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Automobile getAutomobile() {
        return automobile;
    }

    public Date getDateOfApplication() {
        return dateOfApplication;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAutomobile(Automobile automobile) {
        this.automobile = automobile;
    }

    public void setDateOfApplication(Date dateOfApplication) {
        this.dateOfApplication = dateOfApplication;
    }

    @Override
    public String toString() {
        return "Application{" +
                "customer=" + customer +
                ", automobile=" + automobile +
                ", dateOfApplication=" + dateOfApplication +
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
