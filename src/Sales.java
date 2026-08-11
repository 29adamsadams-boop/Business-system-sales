public class Sale {
    private int id;
    private String product;
    private int quantity;
    private String customer;
    private double amount;
    private double discount;

    public Sale(int id, String product, int quantity, String customer, double amount) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.customer = customer;
        this.amount = amount;
        this.discount = 0.0;
    }

    // US-003: Apply Discount
    public void applyDiscount(double percent) {
        this.discount = percent;
        this.amount = this.amount * (1 - percent / 100);
    }

    public int getId() { return id; }
    public String getProduct() { return product; }
    public int getQuantity() { return quantity; }
    public String getCustomer() { return customer; }
    public double getAmount() { return amount; }

    @Override
    public String toString() {
        return "ID: " + id + " | Product: " + product + " | Qty: " + quantity + 
               " | Customer: " + customer + " | Amount: $" + String.format("%.2f", amount);
    }
}