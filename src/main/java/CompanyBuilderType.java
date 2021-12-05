public class CompanyBuilderType implements CompanyBuilder {
    Company company = new Company();

    @Override
    public void buildName(String name) {
        company.setName(name);
    }

    @Override
    public void buildCompanyCapSize(String size) {
        company.setCapSize(size);
    }

    @Override
    public void buildIndustry(String industry) {
        company.setIndustry(industry);
    }

    @Override
    public void buildListing(String listing) {
        company.setListing(listing);
    }

    @Override
    public void buildEmployees(int employees) {
        company.setEmployees(employees);
    }

    @Override
    public Company getCompany() {
        return this.company;
    }
}
