import java.util.Scanner;

interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

abstract class PartialOrder implements Order {
    String itemName;
    int quantity;
    int orderId;
    static int count = 100; 

   
    public void placeOrder(String item, int qty) {
        this.itemName = item;
        this.quantity = qty;
        this.orderId = ++count;

        System.out.println("Order Placed Successfully!");
        System.out.println("Order ID: " + orderId);
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
    }
}

class FinalOrder extends PartialOrder {

   
    public void cancelOrder(int orderId) {
        if (this.orderId == orderId) {
            System.out.println("Order " + orderId + " is Cancelled.");
            itemName = null;
            quantity = 0;
        } else {
            System.out.println("Invalid Order ID!");
        }
    }

  
    public void generateBill() {
        if (itemName == null || quantity == 0) {
            System.out.println("No active order to generate bill.");
            return;
        }

        int price = 100; 
        int total = quantity * price;

        System.out.println("\n----- BILL -----");
        System.out.println("Order ID: " + orderId);
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: ₹" + price);
        System.out.println("Total Amount: ₹" + total);
        System.out.println("----------------");
    }
}


public class Practical29
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FinalOrder order = new FinalOrder();

        System.out.println("Enter Item Name:");
        String item = sc.nextLine();

        System.out.println("Enter Quantity:");
        int qty = sc.nextInt();

        // Place Order
        order.placeOrder(item, qty);

        System.out.println("\nChoose Option:");
        System.out.println("1. Generate Bill");
        System.out.println("2. Cancel Order");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                order.generateBill();
                break;

            case 2:
                System.out.println("Enter Order ID to Cancel:");
                int id = sc.nextInt();
                order.cancelOrder(id);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}