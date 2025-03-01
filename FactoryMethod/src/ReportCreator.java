public abstract class ReportCreator {
    public void previewReport() {
        IReport report = createReport();
        report.preview();
    }

    public void generateReport() {
        IReport report = createReport();
        report.generate();
    }

    // Factory method - phương thức trừu tượng
    public abstract IReport createReport();
}
