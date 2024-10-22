package report_generation_system;

public class HTMLReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("HTML Report Header");
    }

    @Override
    protected void formatBody() {
        System.out.println("HTML Report Body");
    }

    @Override
    protected void formatFooter() {
        System.out.println("HTML Report Footer");
    }
}