public interface CompanyBuilder {
    public void buildName(String name);
    public void buildCompanyCapSize(String size);
    public void buildIndustry(String industry);
    public void buildListing(String listing);
    public void buildEmployees(int employees);
    public Company getCompany();
}
