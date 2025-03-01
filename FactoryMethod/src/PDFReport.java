public class PDFReport implements IReport {

    @Override
    public void generate() {
        System.out.print("\033[31m");
        System.out.println("Generating PDF report");
        System.out.print("\033[0m");
    }

    @Override
    public void preview() {
        System.out.print("\033[31m");
        System.out.println("[Preview] PDF report");
        System.out.print("\033[0m");
    }
}
