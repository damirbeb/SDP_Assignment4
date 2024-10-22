package report_generation_system;

public class Main {
    public static void main(String[] args) {
        ReportingSystem reportingSystem = new ReportingSystem();

        reportingSystem.generateReport(new PDFReportGenerator());
        reportingSystem.generateReport(new HTMLReportGenerator());
        reportingSystem.generateReport(new PlainTextReportGenerator());
    }
}