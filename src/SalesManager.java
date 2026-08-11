import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SalesManager {
    private List<Sale> sales;
    private int nextId;

    public SalesManager() {
        sales = new ArrayList<>();
        nextId = 1;
    }

    // US-001: Record a Sale
    public void recordSale(String product, int quantity, String customer, double pricePerUnit) {
        double total = quantity * pricePerUnit;
        Sale sale = new Sale(nextId++, product, quantity, customer, total);
        sales.add(sale);
        System.out.println("✅ Sale recorded successfully! ID: " + sale.getId());
    }

    // US-002: View Sales Report
    public void viewSalesReport() {
        if (sales.isEmpty()) {
            System.out.println("No sales recorded yet.");
            return;
        }
        double totalRevenue = sales.stream().mapToDouble(Sale::getAmount).sum();
        System.out.println("\n======== SALES REPORT ========");
        System.out.println("Total Revenue: $" + String.format("%.2f", totalRevenue));
        System.out.println("Total Sales: " + sales.size());
        System.out.println("------------------------------");
        for (Sale s : sales) {
            System.out.println(s);
        }
    }

    // US-003: Apply Discount
    public void applyDiscount(int saleId, double percent) {
        for (Sale s : sales) {
            if (s.getId() == saleId) {
                s.applyDiscount(percent);
                System.out.println("✅ Discount applied. New amount: $" + String.format("%.2f", s.getAmount()));
                return;
            }
        }
        System.out.println("❌ Sale ID not found.");
    }

    // US-004: Search Sale by Customer Name
    public void searchByCustomer(String customerName) {
        List<Sale> results = sales.stream()
            .filter(s -> s.getCustomer().equalsIgnoreCase(customerName))
            .collect(Collectors.toList());
        
        if (results.isEmpty()) {
            System.out.println("No sales found for " + customerName);
        } else {
            System.out.println("\n--- Sales for " + customerName + " ---");
            results.forEach(System.out::println);
        }
    }
}