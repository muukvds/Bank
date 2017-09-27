public class BankAccount {

    private String ownerName;
    private int accountNumber;
    private int creditLevel;
    private int securityCode;

    public BankAccount(int accountNumber, String ownerName, int creditLevel, int securityCode) {


        if (accountNumber >= 0 && accountNumber <= 999999) {
            this.accountNumber = accountNumber;
        }
        this.ownerName = ownerName;
        if (creditLevel > -1000) {
            this.creditLevel = creditLevel;
        }
        if (securityCode >= 0 && securityCode <= 9999) {
            this.securityCode = securityCode;
        }
    }

    public void withDraw(int code, int amount) {
        if (code == securityCode) {
            if (creditLevel > -1000) {
                if (amount > 0) {
                    creditLevel -= amount;
                    System.out.println(amount + " is withdrawn.");
                } else {
                    System.out.println("amount need to be positive.");
                }
            } else {
                System.out.println("credit amount is under -1000 cant withdraw.");
            }
        } else {
            System.out.println("Security code incorrect.");
        }
    }

    public void deposit(int amount) {

    }
}
