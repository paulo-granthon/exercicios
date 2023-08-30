package pgranthon.ex2;

public class Invoice {
    private int number;
    private String description;
    private int amount;
    private double price;

    public Invoice(int number, String description, int amount, double price) {
        this.number = number;
        this.description = description;
        this.amount = amount > 0 ? amount : 0;
        this.price = price;
    }

    public double getInvoiceAmount () {
        return amount * price;
    }
    
    public int getNumber() { return number; }  
    public String getDescription() { return description; }
    public int getAmount() { return amount; }
    public double getPrice() { return price; }

    public void setNumber(int number) { this.number = number; }
    public void setDescription(String description) { this.description = description; }
    public void setAmount(int amount) {
        this.amount = amount > 0 ? amount : 0;
    }
    public void setPrice(double price) {
        this.price = price > 0 ? price : 0;
    }
    
}
