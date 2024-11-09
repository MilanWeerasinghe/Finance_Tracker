import entity.*;
import repo.ExpenseRepo;
import service.ExpenseService;
import utils.ExpensePrinter;
import utils.IPrinter;

public class Main {
    public static void main(String[] args) {
        Budget budget = Budget.getInstance();
        budget.setTotalBudget(1700);
        budget.setId(1);

        IExpense expense1 = new Expense(1,"food expense",1200, Category.FOOD);
        IExpense expense2 = new RecurringExpense(2,"drink",500, Category.OTHER,"Daily");

        ExpenseRepo expenseRepo = new ExpenseRepo();
        ExpenseService expenseService = new ExpenseService(expenseRepo);
        expenseService.add(expense1);
        expenseService.add(expense2);

        IPrinter expensePrinter = new ExpensePrinter(expenseRepo.getExpenses());
        expensePrinter.print();

    }
}