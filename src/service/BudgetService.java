package service;

import entity.Budget;

public class BudgetService {

    public void adjustBudget(double amount) {
        Budget.getInstance().setTotalBudget(amount);
    }
}
