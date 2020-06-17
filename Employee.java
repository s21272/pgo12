import java.util.ArrayList;

public class Employee extends User {
    private static int COUNTER = 0;
    int employeeID;

    ArrayList <Client> clients = new ArrayList<>();

    public Employee( String name, String surname) {
        super(name, surname);
        this.employeeID = COUNTER++;

    }
    public Client addClient( String name, String surname, double accountBalance){
        BankAccount b = new BankAccount(accountBalance,null);
        Client c = new Client( b, name, surname);
        return c;
    }

    public void acceptPayment(double payment, BankAccount account) throws AccountOperationsException {
        account.makePayment(payment);
    }

    public void acceptPayment(double payment, BankAccount from, BankAccount to) throws AccountOperationsException {
        from.makeTransfer(payment,to);
    }

}
