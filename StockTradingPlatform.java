import java.util.Scanner;

public class StockTradingPlatform {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;
        int stocks = 0;
        double stockPrice = 500;

        while (true) {

            System.out.println("\n===== STOCK TRADING PLATFORM =====");
            System.out.println("1. View Portfolio");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Balance: ₹" + balance);
                    System.out.println("Stocks Owned: " + stocks);
                    break;

                case 2:
                    System.out.print("How many stocks do you want to buy? ");
                    int buy = sc.nextInt();

                    double buyCost = buy * stockPrice;

                    if (buyCost <= balance) {
                        balance -= buyCost;
                        stocks += buy;
                        System.out.println("Stocks purchased successfully!");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;

                case 3:
                    System.out.print("How many stocks do you want to sell? ");
                    int sell = sc.nextInt();

                    if (sell <= stocks) {
                        balance += sell * stockPrice;
                        stocks -= sell;
                        System.out.println("Stocks sold successfully!");
                    } else {
                        System.out.println("Not enough stocks.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using Stock Trading Platform!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}