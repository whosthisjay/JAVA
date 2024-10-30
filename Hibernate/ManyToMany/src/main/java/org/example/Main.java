package org.example;

import org.example.dao.LibraryDAO;
import org.example.model.Reader;
import org.example.model.Subscription;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryDAO libraryDAO = new LibraryDAO();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Create Reader");
            System.out.println("2. Create Subscription");
            System.out.println("3. View Reader");
            System.out.println("4. View Subscription");
            System.out.println("5. Update Reader");
            System.out.println("6. Update Subscription");
            System.out.println("7. Delete Reader");
            System.out.println("8. Delete Subscription");
            System.out.println("9. View All Readers");
            System.out.println("10. View All Subscriptions");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // Create Reader
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = scanner.nextLine();
                    Reader reader = new Reader(email, firstName, lastName);
                    libraryDAO.createReader(reader);
                    System.out.println("Reader created successfully.");
                    break;

                case 2:
                    // Create Subscription
                    System.out.print("Enter subscription name: ");
                    String subscriptionName = scanner.nextLine();
                    Subscription subscription = new Subscription(subscriptionName);
                    libraryDAO.createSubscription(subscription);
                    System.out.println("Subscription created successfully.");
                    break;

                case 3:
                    // View Reader
                    System.out.print("Enter Reader ID: ");
                    int readerId = scanner.nextInt();
                    Reader retrievedReader = libraryDAO.readReader(readerId);
                    if (retrievedReader != null) {
                        System.out.println("Reader ID: " + retrievedReader.getReaderId());
                        System.out.println("Email: " + retrievedReader.getEmail());
                        System.out.println("Name: " + retrievedReader.getFirstName() + " " + retrievedReader.getLastName());
                    } else {
                        System.out.println("Reader not found.");
                    }
                    break;

                case 4:
                    // View Subscription
                    System.out.print("Enter Subscription ID: ");
                    int subscriptionId = scanner.nextInt();
                    Subscription retrievedSubscription = libraryDAO.readSubscription(subscriptionId);
                    if (retrievedSubscription != null) {
                        System.out.println("Subscription ID: " + retrievedSubscription.getSubscriptionId());
                        System.out.println("Subscription Name: " + retrievedSubscription.getSubscriptionName());
                    } else {
                        System.out.println("Subscription not found.");
                    }
                    break;

                case 5:
                    // Update Reader
                    System.out.print("Enter Reader ID to update: ");
                    int updateReaderId = scanner.nextInt();
                    Reader updateReader = libraryDAO.readReader(updateReaderId);
                    if (updateReader != null) {
                        System.out.print("Enter new email: ");
                        updateReader.setEmail(scanner.next());
                        System.out.print("Enter new first name: ");
                        updateReader.setFirstName(scanner.next());
                        System.out.print("Enter new last name: ");
                        updateReader.setLastName(scanner.next());
                        libraryDAO.updateReader(updateReader);
                        System.out.println("Reader updated successfully.");
                    } else {
                        System.out.println("Reader not found.");
                    }
                    break;

                case 6:
                    // Update Subscription
                    System.out.print("Enter Subscription ID to update: ");
                    int updateSubscriptionId = scanner.nextInt();
                    Subscription updateSubscription = libraryDAO.readSubscription(updateSubscriptionId);
                    if (updateSubscription != null) {
                        System.out.print("Enter new subscription name: ");
                        updateSubscription.setSubscriptionName(scanner.next());
                        libraryDAO.updateSubscription(updateSubscription);
                        System.out.println("Subscription updated successfully.");
                    } else {
                        System.out.println("Subscription not found.");
                    }
                    break;

                case 7:
                    // Delete Reader
                    System.out.print("Enter Reader ID to delete: ");
                    int deleteReaderId = scanner.nextInt();
                    libraryDAO.deleteReader(deleteReaderId);
                    System.out.println("Reader deleted successfully.");
                    break;

                case 8:
                    // Delete Subscription
                    System.out.print("Enter Subscription ID to delete: ");
                    int deleteSubscriptionId = scanner.nextInt();
                    libraryDAO.deleteSubscription(deleteSubscriptionId);
                    System.out.println("Subscription deleted successfully.");
                    break;

                case 9:
                    // View All Readers
                    List<Reader> readers = libraryDAO.getAllReaders();
                    if (readers.isEmpty()) {
                        System.out.println("No readers found.");
                    } else {
                        System.out.println("List of Readers:");
                        for (Reader r : readers) {
                            System.out.println("Reader ID: " + r.getReaderId() +
                                    ", Email: " + r.getEmail() +
                                    ", First Name: " + r.getFirstName() +
                                    ", Last Name: " + r.getLastName());
                        }
                    }
                    break;


                case 10:
                    // View All Subscriptions
                    List<Subscription> subscriptions = libraryDAO.getAllSubscriptions();
                    for (Subscription s : subscriptions) {
                        System.out.println("Subscription ID: " + s.getSubscriptionId() + ", Name: " + s.getSubscriptionName());
                    }
                    break;

                case 11:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 11);

        scanner.close();
    }
}
