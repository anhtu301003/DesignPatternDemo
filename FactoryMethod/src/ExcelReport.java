public class ExcelReport implements IReport {

    @Override
    public void generate() {
        System.out.print("\033[32m");
        System.out.println("Generating Excel report");
        System.out.print("\033[0m");
    }

    @Override
    public void preview() {
        System.out.print("\033[32m");
        System.out.println("[Preview] Excel report");
        System.out.print("\033[0m");
    }
}
