package ch06.lecture.exercise;

public class AccountExample {
    public static void main(String[] args) {
        Account1 account = new Account1();

        account.setBalance(10_000);
        System.out.println("account=" + account.getBalance());

        account.setBalance(-100);
        System.out.println("account=" + account.getBalance());

        account.setBalance(2_000_000);
        System.out.println("account=" + account.getBalance());

        account.setBalance(300_000);
        System.out.println("account=" + account.getBalance());
    }
}
