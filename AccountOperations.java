public interface AccountOperations {

     double checkAccountBalance();
     void makePayment(double amount) throws AccountOperationsException;
     void makeTransfer(double amount, BankAccount to) throws AccountOperationsException;

}
