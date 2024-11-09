package repo;

import entity.IExpense;

import java.util.ArrayList;
import java.util.List;

public class ExpenseRepo {
    private final List<IExpense> expenses;

    public ExpenseRepo() {
        expenses = new ArrayList<IExpense>();
    }

    public List<IExpense> getExpenses() {
        return expenses;
    }

    public void add(IExpense expense) {
        expenses.add(expense);
    }

    public IExpense getExpense(int id) {
        return expenses.get(id);
    }
}
