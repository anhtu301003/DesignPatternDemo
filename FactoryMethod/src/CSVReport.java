public class CSVReport implements IReport {

    @Override
    public void generate() {
        System.out.print("\033[33m");
        System.out.println("Generating CSV report");
        System.out.print("\033[0m");
    }

    @Override
    public void preview() {
        System.out.print("\033[33m");
        System.out.println("[Preview] CSV report");
        System.out.print("\033[0m");
    }
}
