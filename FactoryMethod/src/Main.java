import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        ReportCreator creator;
        while (choice != 0) {
            System.out.println("Welcome to the Report Generator");
            System.out.println("Please select an option:");
            System.out.println("1. Report from PDF");
            System.out.println("2. Report from Excel");
            System.out.println("3. Report from CSV");
            System.out.println("0. Exit");

            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Exiting the program");
                    break;
                case 1:
                    creator = new PDFReportCreator();
                    creator.previewReport();
                    creator.generateReport();
                    break;
                case 2:
                    creator = new ExcelReportCreator();
                    creator.previewReport();
                    creator.generateReport();
                    break;
                case 3:
                    creator = new CSVReportCreator();
                    creator.previewReport();
                    creator.generateReport();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}