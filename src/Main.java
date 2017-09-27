public class Main {

    public static void main(String[] args)
    {
        BankAccount bankAccount = new BankAccount(123456,"Bob",200,1234);
        bankAccount.deposit(800);

        bankAccount.withDraw(0231,200);
        bankAccount.withDraw(1234,200);
        bankAccount.withDraw(1234,-200);
    }

}
