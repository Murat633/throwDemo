public class Main {
    public static void main(String[] args) {
        try {
            AccountManager manager = new AccountManager();
            System.out.println("Bakiyeniz :"+manager.getBalance());

            manager.deposit(100);
            System.out.println("Bakiyeniz :"+manager.getBalance());

            manager.withdraw(20);
            System.out.println("Bakiyeniz :"+manager.getBalance());

            manager.withdraw(90);
            System.out.println("Bakiyeniz :"+manager.getBalance());
        } catch (BalanceInsufficentException e) {
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}