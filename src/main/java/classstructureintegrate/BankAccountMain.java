package classstructureintegrate;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("11223344-12345678-96385214","Tóth Kálmán",15000);
        BankAccount bankAccount2 = new BankAccount("22334477-98765412-96325874","Teszt Elek",20000);

        bankAccount1.deposit(20000);
        bankAccount1.withdraw(5000);
        bankAccount2.deposit(10000);
        bankAccount2.withdraw(2000);

        System.out.println("Egyenlegek:");
        System.out.println(bankAccount1.getInfo());
        System.out.println(bankAccount2.getInfo());

        bankAccount1.transfer(bankAccount2,3000);

        System.out.println("Egyenlegek transfer után:");
        System.out.println(bankAccount1.getInfo());
        System.out.println(bankAccount2.getInfo());



    }
}
