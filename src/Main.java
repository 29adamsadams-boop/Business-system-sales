import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SalesManager manager = new SalesManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== BUSINESS SALES SYSTEM =====");
            System.out.println("1. Record Sale");           // US-001 Must Have
            System.out.println("2. View Sales Report");    // US-002 Must Have
            System.out.println("3. Apply Discount");       // US-003 Should Have
            System.out.println("4. Search by Customer");   // US-004 Could Have
            System.out.println("5. Export to PDF");        // US-005 Won't Have
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Product: ");
                    String product = sc.nextLine();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Customer: ");
                    String customer = sc.nextLine();
                    System.out.print("Price per unit: ");
                    double price = sc.nextDouble();
                    manager.recordSale(product, qty, customer, price);
                    break;
                case 2:
                    manager.viewSalesReport();
                    break;
                case 3:
                    System.out.print("Enter Sale ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Discount %: ");
                    double disc = sc.nextDouble();
                    manager.applyDiscount(id, disc);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();
                    manager.searchByCustomer(name);
                    break;
                case 5:
                    System.out.println("⚠️ Export to PDF - Won't Have for v1.0");
                    break;
                case 0:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
        sc.close();
    }
}