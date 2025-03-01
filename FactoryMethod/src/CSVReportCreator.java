public class CSVReportCreator extends ReportCreator {
    @Override
    public IReport createReport() {
        return new CSVReport();
    }
}