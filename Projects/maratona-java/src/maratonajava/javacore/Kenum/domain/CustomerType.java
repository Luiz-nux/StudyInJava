package maratonajava.javacore.Kenum.domain;

public enum CustomerType {
    INDIVIDUAL(1, "Individual"),
    COMPANY(2, "Company"),
    START_UP(3, "Start up");

    public final int dbValue;
    public final String reportValue;

    CustomerType(int dbValue, String reportValue){
        this.dbValue = dbValue;
        this.reportValue = reportValue;
    }

    public static CustomerType getByReportValue(String reportValue){
        for (CustomerType customerType: values()){
            if (customerType.getReportValue().equalsIgnoreCase(reportValue)){
                return customerType;
            }
        }
        return null;
    }


    public int getDbValue() {
        return dbValue;
    }

    public String getReportValue() {
        return reportValue;
    }
}
