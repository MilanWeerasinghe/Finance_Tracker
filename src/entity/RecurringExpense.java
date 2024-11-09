package entity;

public class RecurringExpense extends Expense{
    private String frequency; // e.g., weekly, monthly

    public RecurringExpense(int id, String description, double amount, Category category, String frequency) {
        super(id, description, amount, category);
        this.frequency = frequency;
    }

    public String getFrequency() {
        return frequency;
    }
}
