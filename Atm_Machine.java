import java.util.Scanner;

public class Atm_Machine{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // set initial balance to 1000
        // print menu
        int balance = 1000;
       
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");


        while (true) {
            
            // get user choice
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: " + balance);
                    System.out.println("------------------------");
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    int withdrawAmount = scanner.nextInt();

                    // check if there is enough balance
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Successfully withdrawn " + withdrawAmount);
                        System.out.println("Your new balance is: " + balance);
                    }
                    System.out.println("------------------------");

                    break;
                case 3:
                    System.out.println("Enter amount to deposit:");
                    int depositAmount = scanner.nextInt();

                    balance += depositAmount;
                    System.out.println("Successfully deposited " + depositAmount);
                    System.out.println("Your new balance is: " + balance);
                    System.out.println("------------------------");
                    break;
                case 4:
                    System.exit(0);
                    System.out.println("------------------------");
                    break;
                default:
                    System.out.println("Invalid choice");
                    System.out.println("------------------------");
            }
        }
    }
}

