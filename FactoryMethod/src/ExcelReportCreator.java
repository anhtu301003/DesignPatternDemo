public class ExcelReportCreator extends ReportCreator {
    @Override
    public IReport createReport() {
        return new ExcelReport();
    }
}