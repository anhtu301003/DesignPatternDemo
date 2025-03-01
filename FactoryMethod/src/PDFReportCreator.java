public class PDFReportCreator extends ReportCreator {
    @Override
    public IReport createReport() {
        return new PDFReport();
    }
}