package Week5.assignment;
import java.util.HashMap;
import java.util.Scanner;
public class StoreInventorySystem {
    private HashMap<String, Integer> inventory;

    public StoreInventorySystem() {
        inventory = new HashMap<>();
    }

    public void addItem(String itemName, int quantity) {
        inventory.put(itemName, quantity);
        System.out.println("Item '" + itemName + "' added to inventory.");
    }

    public void checkQuantity(String itemName) {
        if (inventory.containsKey(itemName)) {
            System.out.println("Quantity of '" + itemName + "' in inventory: " + inventory.get(itemName));
        } else {
            System.out.println("Item '" + itemName + "' not found in inventory.");
        }
    }

    public void removeItem(String itemName) {
        if (inventory.containsKey(itemName)) {
            inventory.remove(itemName);
            System.out.println("Item '" + itemName + "' removed from inventory.");
        } else {
            System.out.println("Item '" + itemName + "' not found in inventory.");
        }
    }

    public void listInventory() {
        System.out.println("Inventory:");
        for (String itemName : inventory.keySet()) {
            System.out.println("- " + itemName + ": " + inventory.get(itemName));
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Store Inventory System");
            System.out.println("----------------------");
            System.out.println("1. Add Item");
            System.out.println("2. Check Quantity");
            System.out.println("3. Remove Item");
            System.out.println("4. List Inventory");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            if (choice == 1) {
                System.out.print("Enter item name: ");
                String itemName = scanner.nextLine();
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // Consume the newline
                addItem(itemName, quantity);
            } else if (choice == 2) {
                System.out.print("Enter item name: ");
                String itemName = scanner.nextLine();
                checkQuantity(itemName);
            } else if (choice == 3) {
                System.out.print("Enter item name: ");
                String itemName = scanner.nextLine();
                removeItem(itemName);
            } else if (choice == 4) {
                listInventory();
            } else if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        StoreInventorySystem inventorySystem = new StoreInventorySystem();
        inventorySystem.run();
    }
}
