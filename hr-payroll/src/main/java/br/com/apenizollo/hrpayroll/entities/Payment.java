package br.com.apenizollo.hrpayroll.entities;

import lombok.Data;

@Data
public class Payment {

    private String name;
    private Double dailyIncome;
    private Integer days;

    public Payment() {
    }

    public Payment(String name, Double dailyIncome, Integer days) {
        this.name = name;
        this.dailyIncome = dailyIncome;
        this.days = days;
    }

    public double getTotal() {
        return days * dailyIncome;
    }
}
