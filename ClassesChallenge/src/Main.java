public class Main {
    public static void main(String[] args) {

//        BankAccount first = new BankAccount("5435434435345", 200000.00, "John Dover", "johndover@example.com", "6142830394");
        BankAccount account = new BankAccount("Jansen Epicness", "jansen@epicness.com", "3433426435");
        System.out.println("Account Number:" + account.getAccountNumber() + "; name: " + account.getCustomerName()
        + "; Balance: " + account.getAccountBalance());
//        first.setAccountNumber(1234567899);
//        first.setAccountBalance(200000);
//        first.setCustomerName("John Brooks");
//        first.setCustomerEmail("johnbrooks@example.com");
//        first.setCustomerPhone(614123495);
//        first.setWithdrawalAmount(200000);

//        first.setDepositAmount(3432);
//        first.depositFunds();
//
//
//        first.accountInfo();
    }
}