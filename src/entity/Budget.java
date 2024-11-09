package entity;

public class Budget {
    private static Budget budget;
    private int id;
    private double totalBudget;
    private double currentSpent;

    private Budget() {
        this.totalBudget = 0;
        this.currentSpent = 0;
    }

    public static Budget getInstance() {
        if (budget == null){
            budget = new Budget();
        }
        return budget;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTotalBudget(double totalBudget) {
        this.totalBudget = totalBudget;
    }

    public double getTotalBudget() {
        return totalBudget;
    }
    public double getCurrentSpent() {
        return currentSpent;
    }
    public void setCurrentSpent(double currentSpent) {
        this.currentSpent += currentSpent;
    }
}
