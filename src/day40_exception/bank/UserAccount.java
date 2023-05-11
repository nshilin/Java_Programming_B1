package day40_exception.bank;

public class UserAccount {
    public static void main(String[] args) {
        Bank accountOne = new Bank();
        accountOne.balance = 1000;

        accountOne.withdraw(9000);

        try {
            accountOne.login("Test", "0000");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End");
    }
}
