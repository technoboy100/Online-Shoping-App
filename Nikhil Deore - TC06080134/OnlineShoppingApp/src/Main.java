import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Prime Account details - Account ID: ");
            int primeAccountId = scanner.nextInt();

            System.out.print("Enter Prime Account details - Account Name: ");
            String primeAccountName = scanner.next();

            System.out.print("Enter Prime Account details - Initial Balance: ");
            float primeInitialBalance = scanner.nextFloat();

            System.out.print("Is Prime Account active? (true/false): ");
            boolean isPrimeActive = scanner.nextBoolean();

            ShopFactory shopFactory = new GSShopFactory();

            PrimeAcc primeAccount = shopFactory.getNewPrimeAcc(primeAccountId, primeAccountName, primeInitialBalance, isPrimeActive);

            System.out.print("\nEnter Normal Account details - Account ID: ");
            int normalAccountId = scanner.nextInt();

            System.out.print("Enter Normal Account details - Account Name: ");
            String normalAccountName = scanner.next();

            System.out.print("Enter Normal Account details - Initial Balance: ");
            float normalInitialBalance = scanner.nextFloat();

            NormalAcc normalAccount = shopFactory.getNewNormalAcc(normalAccountId, normalAccountName, normalInitialBalance);

            primeAccount.bookProduct(5.0f);
            normalAccount.bookProduct(5.0f);

            System.out.println("\nPrime Account details: ");
            System.out.println(primeAccount.toString());

            System.out.println("\nNormal Account details: ");
            System.out.println(normalAccount.toString());
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid values.");
            e.printStackTrace(); // You may choose to handle the exception more gracefully.
        } finally {
            scanner.close(); 
        }
    }
}