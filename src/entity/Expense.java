package entity;

import java.time.LocalDate;

public class Expense implements IExpense {
    private int id;
    private String description;
    private double amount;
    private LocalDate date;
    private Category category;


    public Expense(){}

    public Expense(int id, String description, double amount, Category category) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.date = LocalDate.now();
        this.category = category;
    }




    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public Category getCategory() {
        return category;
    }
}
