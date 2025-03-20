import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class OrderQueen {
    private Queue<String> pizzaOrders;

    public OrderQueen() {
        pizzaOrders = new LinkedList<>();
    }

    
    public void addOrder(String order) {
        pizzaOrders.add(order);
    }

    
    public void displayFirstOrder() {
        if (!pizzaOrders.isEmpty()) {
            System.out.println(pizzaOrders.peek());
        } else {
            System.out.println("The queue is empty.");
        }
    }

    
    public String removeOrder() {
        if (!pizzaOrders.isEmpty()) {
            return pizzaOrders.poll();
        } else {
            System.out.println("The queue is empty.");
            return null;
        }
    }

    
    public boolean isQueueEmpty() {
        return pizzaOrders.isEmpty();
    }

    
    public void handleQueue() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose what you want to do with pizza orders queue:");
            System.out.println("1. Add an order");
            System.out.println("2. Display the first order");
            System.out.println("3. Remove an order");
            System.out.println("4. Check if the queue is empty");
            System.out.print("Enter your choice (1 – 4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the order details: ");
                    scanner.nextLine(); 
                    String order = scanner.nextLine();
                    addOrder(order);
                    break;
                case 2:
                    displayFirstOrder();
                    break;
                case 3:
                    removeOrder();
                    break;
                case 4:
                    if (isQueueEmpty()) {
                        System.out.println("The queue is empty");
                    } else {
                        System.out.println("The queue is not empty");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}