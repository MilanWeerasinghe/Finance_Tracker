package utils;

import entity.IExpense;

import java.util.List;

public class ExpensePrinter implements IPrinter{
    public List<IExpense> expenseList;

    public ExpensePrinter(List<IExpense> expenses){
        this.expenseList = expenses;
    }
    @Override
    public void print() {
        expenseList.forEach(expense -> System.out.println(
                "Expense{" +
                        "id=" + expense.getId()+
                        ", description='" + expense.getDescription() + '\'' +
                        ", amount=" + expense.getAmount() +
                        ", date=" + expense.getDate() +
                        ", category=" + expense.getCategory() +
                        '}'
        ));

    }
}
