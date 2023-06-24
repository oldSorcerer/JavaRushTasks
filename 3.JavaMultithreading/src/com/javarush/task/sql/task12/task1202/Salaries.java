package com.javarush.task.sql.task12.task1202;

/* 
Entity с вычислением
*/

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "salaries_table", schema = "salaries")
public class Salaries {
    @Id
    private Long employeeID;

    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column(name = "paymentCode")
    private Boolean paymentCode;

    @Column(name = "employeeName")
    private String employeeName;
    @Column(name = "basicSalary")
    private double basicSalary;
    @Column(name = "bonus")
    private double bonus;
    @Column(name = "tax")
    private double tax;

    @Formula("basicSalary + bonus - tax")
    @Column(name = "total")
    private double total;


    public Long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Long employeeID) {
        this.employeeID = employeeID;
    }

    public Boolean getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(Boolean paymentCode) {
        this.paymentCode = paymentCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
