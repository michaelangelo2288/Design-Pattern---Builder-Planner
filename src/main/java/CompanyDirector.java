public class CompanyDirector {
    CompanyBuilder companyBuilder;

    public CompanyDirector(CompanyBuilder companyBuilder) {
        this.companyBuilder = companyBuilder;
    }

    public void makeCompany() {
        companyBuilder.buildName("Tran");
        companyBuilder.buildCompanyCapSize("large");
        companyBuilder.buildIndustry("tech");
        companyBuilder.buildListing("public");
        companyBuilder.buildEmployees(888);
    }

    public Company getCompany() {
        return this.companyBuilder.getCompany();
    }
}
