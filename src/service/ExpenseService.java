package service;

import entity.Budget;
import entity.IExpense;
import repo.ExpenseRepo;

public class ExpenseService {
    private ExpenseRepo expenseRepo;

    public ExpenseService(ExpenseRepo expenseRepo) {
        this.expenseRepo = expenseRepo;
    }

    public boolean isWithinBudget(IExpense expense) {
        Budget budget = Budget.getInstance();
        return expense.getAmount() <= (budget.getTotalBudget()-budget.getCurrentSpent());
    }

    public void add(IExpense expense) {
        boolean isWithinBudget = isWithinBudget(expense);
        if (isWithinBudget) {
            expenseRepo.add(expense);
            Budget.getInstance().setCurrentSpent(expense.getAmount());
        }else {
            throw new RuntimeException("Expense is not within the budget");
        }
    }
}
