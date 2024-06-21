public class Test {

    public static void main(String[] args){

        Account account = new Account();
        Account account1 = new Account("adrgd","kaan","kb@","5514100403",1000);
        Account account2 = new Account("akif","536226");

        account.bilgileriGoster();
        System.out.println("-----------------------------------------------");
        account1.bilgileriGoster();
        System.out.println("-----------------------------------------------");
        account2.bilgileriGoster();



    }
}
