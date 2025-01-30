# Bank Account System with TDD  


## Summary  
This project implements a **bank account management system** using the **Mockist Test-Driven Development (TDD) approach**. The goal was to create an **account service** that allows users to:  

✅ **Deposit money**  
✅ **Withdraw money**  
✅ **Print transaction history**  

To enhance functionality, we introduced:  
✔ **Transaction filtering** to display only deposits or withdrawals.  
✔ **Exporting transactions to a CSV file** for record-keeping.  

This solution follows **TDD principles**, ensuring each feature was designed and implemented only after writing tests, leading to a **robust, maintainable, and testable system**.  

---

## Development Steps  

### 🟢 `AccountService.java` (Main Business Logic)  
Manages deposits, withdrawals, and balance updates.  

**Key responsibilities:**  
✔ Stores transactions in `TransactionRepository`.  
✔ Calls `StatementPrinter` to display transactions.  
✔ Ensures transactions follow correct business rules.  

---

### 🟢 `Transaction.java` (Transaction Model)  
Represents a single financial transaction.  

**Attributes:**  
✔ `date` → Transaction date.  
✔ `amount` → Transaction amount (positive for deposits, negative for withdrawals).  
✔ `type` → `DEPOSIT` or `WITHDRAWAL`.  

This class helps structure data and ensures transactions are easily manageable.  

---

### 🟢 `TransactionRepository.java` (Data Storage)  
Stores transactions in memory.  

**Responsibilities:**  
✔ Adds new transactions.  
✔ Retrieves all past transactions.  

This allows the `AccountService` to **retrieve and process** account history efficiently.  

---

### 🟢 `StatementPrinter.java` (Displaying Transactions)  
Formats and displays transactions in a user-friendly way.  

**Responsibilities:**  
✔ Prints transactions in a **formatted table**.  
✔ Computes and displays the **balance dynamically**.  

This ensures users have a clear **visual representation** of their account history.  

---

### 🟢 `AccountServiceTest.java` (Unit Testing with Mockito)  
Contains **test cases** to validate the system using **Mockito**.  

✔ Ensures **deposits and withdrawals are recorded** correctly.  
✔ Verifies that the **printer and repository methods are called correctly**.  
✔ Uses **mocking** to isolate components, improving test accuracy.  

By using **TDD**, all tests were written before implementation, ensuring a fully testable system.  

---

## Additional Features  

### Filtered Transactions (Deposits Only)  
Implemented a **filtering system** to display **only deposit transactions**.  

✔ Improves **readability** when reviewing account history.  
✔ Allows users to **analyze deposits separately**, aiding financial tracking.  

### Export Transactions to CSV  
Implemented **CSV exporting** to allow users to **save their transaction history**.  

✔ Helps in **record-keeping** for financial audits.  
✔ Ensures users can access **offline transaction logs**.  

By computing the **balance dynamically**, we ensure that CSV files are always accurate and up to date.  

---

**This project not only enhances my expertise in Java development but also showcases the power of TDD in creating well-tested and maintainable software solutions.**  


---

### Contact  
📧 **Email:** yassineourara@gmail.com  
🔗 **LinkedIn:** [Yassine Ourara](https://www.linkedin.com/in/yassine-ourara)  
🎨 **Behance:** [Yassine Ourara](https://www.behance.net/yacineourara)  

<div align="right">
  <img src="https://github.com/user-attachments/assets/fa22395f-ca02-4da5-bf3a-d0d50a04a44a" alt="Logo" width="300px">
</div>

