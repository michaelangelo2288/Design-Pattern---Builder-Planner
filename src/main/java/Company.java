public class Company implements CompanyPlan {
    String name;
    String capSize;
    String industry;
    String listing;
    int employees;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setCapSize(String size) {
        this.capSize = size;
    }

    @Override
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Override
    public void setListing(String listing) {
        this.listing = listing;
    }

    @Override
    public void setEmployees(int employees) {
        this.employees = employees;
    }
}
