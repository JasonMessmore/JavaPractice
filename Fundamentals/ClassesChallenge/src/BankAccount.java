public class BankAccount {

    private String accountNumber = "0";
    private double accountBalance = 0;
    private String customerName = "John";
    private String customerEmail = "john@example.com";
    private String customerPhone = "614234567";

    public BankAccount() {
        this("43545", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }
    public BankAccount(String accountNumber, double accountBalance, String customerName, String customerEmail, String customerPhone) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhone) {
        this("99999", 100.55, customerName, customerEmail, customerPhone);
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        System.out.println("Based constructor called");
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public String getCustomerPhone() {
        return customerPhone;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    private double withdrawalAmount = 0;

    public double getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public void setWithdrawalAmount(double withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }
    int status = 0;
    public void withdrawalFunds() {
        if (withdrawalAmount > accountBalance) {
            System.out.println("Insufficient Funds Available" + newLine +
                    "You tried to withdrawal " + withdrawalAmount + " with a current balance of " + accountBalance);
            System.exit(1);
        }
        accountBalance = accountBalance - withdrawalAmount;
    }

    public void depositFunds() {
        accountBalance = accountBalance + depositAmount;
        System.out.println("You deposited " + depositAmount + newLine +
                "You now have " + accountBalance + " funds available.");
    }

    private double depositAmount = 0;

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String newLine = System.getProperty("line.separator");
    public void accountInfo() {
        System.out.println(
                "Name: " + customerName + newLine +
                "Balance: " + accountBalance);
    }
}
