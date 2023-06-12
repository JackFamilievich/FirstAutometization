package hellotest;

public class BankAccount {
    String name;
    int Balance = 100;
    int id;

    void popolnenieSheta (int Popolnenie) {
        System.out.println("Balance: " + Balance);
        Balance += Popolnenie;
        System.out.println("Balance: " + Popolnenie);
    }
    void spisanieSoScheta (int Spisanie) {
        System.out.println("Balance: " + Balance);
        Balance -= Spisanie;
        System.out.println("Balance: " + Spisanie);
        System.out.println("Balance:" + Balance);
    }
}
class BATest {
    public static void main (String[]args) {
        BankAccount BAt = new BankAccount();
        BAt.popolnenieSheta(90);
        BAt.spisanieSoScheta(50);
    }
}

