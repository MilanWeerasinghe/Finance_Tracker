

🚀 **Personal Finance Tracker in Java** 🧾

Recent project I developed, a **Personal Finance Tracker** built entirely in Java, designed to help users monitor their expenses and manage budgets effectively. This project was an excellent opportunity to apply my understanding of **Object-Oriented Programming (OOP)** and dive deep into **SOLID principles** to create clean, maintainable, and scalable code.

### 🛠 Key Features:
- **Expense Management**: Users can add expenses with details such as amount, category (e.g., Food, Travel, Education), and recurrence for recurring expenses.
- **Budget Tracking**: The system tracks the total budget and updates remaining funds as expenses are added, preventing users from exceeding their set limits.
- **Expense Categories**: Users can classify expenses by categories using enums, adding an organized structure to financial data.

### ⚙️ Technical Highlights:
- **OOP Design**: The project is structured with core classes like `Expense`, `RecurringExpense`, `Budget`, and `ExpenseService`, leveraging **interfaces and inheritance** to promote code reusability and adhere to the **Single Responsibility Principle (SRP)**.
- **Singleton Pattern**: Implemented a singleton for the `Budget` class, ensuring a single, globally accessible budget instance for seamless budget management.
- **SOLID Principles**:
    - **S**: Each class has a clear, singular responsibility, simplifying updates and testing.
    - **O**: The design is open for extension, allowing for future addition of expense categories or budget rules without modifying existing code.
    - **L**: Classes like `RecurringExpense` inherit from `Expense`, ensuring they can be used interchangeably where applicable.
    - **I**: Interfaces like `IExpense` define core behaviors, making it easy to add new expense types in the future.
    - **D**: Dependency Injection is used in the `ExpenseService` class to manage dependencies, making the code more flexible and testable.

Through this project, I deepened my understanding of **Java** and **design patterns** while solidifying my skills in **clean code** and **software architecture**. Excited to apply these principles in larger, collaborative projects!

