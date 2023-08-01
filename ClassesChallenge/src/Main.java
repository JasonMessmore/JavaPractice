public class Main {
    public static void main(String[] args) {

        BankAccount first = new BankAccount();

        first.setAccountNumber(1234567899);
        first.setAccountBalance(200000);
        first.setCustomerName("John Brooks");
        first.setCustomerEmail("johnbrooks@example.com");
        first.setCustomerPhone(614123495);
        first.setWithdrawalAmount(200000);

        first.setDepositAmount(3432);
        first.depositFunds();


        first.accountInfo();
    }
}