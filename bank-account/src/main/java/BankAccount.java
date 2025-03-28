public class BankAccount {
    private boolean isAccountOpen;
    private int balance;

    public void open() {
        isAccountOpen = true;
    }

    public synchronized void deposit(int cash) throws BankAccountActionInvalidException {
        if (!isAccountOpen)
            throw new BankAccountActionInvalidException("Account closed");
        if (cash < 0)
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        balance += cash;
    }

    public synchronized void withdraw(int cash) throws BankAccountActionInvalidException {
        if (!isAccountOpen)
            throw new BankAccountActionInvalidException("Account closed");
        if (cash < 0)
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        if (balance == 0)
            throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
        if (cash > balance)
            throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
        balance -= cash;
    }

    public void close() {
        isAccountOpen = false;
    }

    public int getBalance() throws BankAccountActionInvalidException {
        if (!isAccountOpen)
            throw new BankAccountActionInvalidException("Account closed");
        return balance;
    }
}