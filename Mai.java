
import java.util.Scanner;

public class Mai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter your account number:");
        String accountNumber = scanner.nextLine();
        
        System.out.println("Enter initial balance:");
        double initialBalance = scanner.nextDouble();
        
        Customer customer = new Customer(name, accountNumber, initialBalance);
        
        boolean running = true;
        
        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter deposit amount:");
                    double depositAmount = scanner.nextDouble();
                    customer.depositToAccount(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter withdrawal amount:");
                    double withdrawAmount = scanner.nextDouble();
                    customer.withdrawFromAccount(withdrawAmount);
                    break;
                case 3:
                    customer.checkBalance();
                    break;
                case 4:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        scanner.close();
    }
}
