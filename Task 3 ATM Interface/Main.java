public class Main {

    public static void main(String[] args) {
        BankAccount useAccount = new BankAccount(1000);
        ATM atm = new ATM(useAccount);
        atm.start();
    }
}