package bai1;

public class Bai1 {
    public static void main(String[] args) {
        Account account =  Account.getInstance(1,"Quỳnh",20);
        System.out.println(account);
        Account account1  = Account.getInstance(2,"Tần",20);
        System.out.println(account1);
    }
}
