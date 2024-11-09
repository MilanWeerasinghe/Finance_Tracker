package entity;

import java.time.LocalDate;

public interface IExpense {
    int getId();
    String getDescription();
    double getAmount();
    LocalDate getDate();
    Category getCategory();
}
