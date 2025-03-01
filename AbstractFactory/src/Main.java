import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        DatabaseFactory factory;
        Application app;
        while (choice != 0) {
            System.out.println("Welcome to the Report Generator");
            System.out.println("Please select an option:");
            System.out.println("1. Connect to Mysql");
            System.out.println("2. Connect to PostgreSQL");
            System.out.println("0. Exit");

            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Exiting the program");
                    break;
                case 1:
                    factory = new MySQLFactory();
                    app = new Application(factory);
                    app.run();
                    break;
                case 2:
                    factory = new PostgreSQLFactory();
                    app = new Application(factory);
                    app.run();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}