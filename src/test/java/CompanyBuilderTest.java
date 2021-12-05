import org.junit.Test;

public class CompanyBuilderTest {
    public static void main(String[] args) {
        // *** When you define a new interface, you are defining a new reference data type. You can use interface names anywhere you can use any other data type name. If you define a reference variable whose type is an interface, any object you assign to it must be an instance of a class that implements the interface.
        // CompanyBuilder = inteface; CompanyBuilderType = class implementing CompanyBuilder
        CompanyBuilder companyBuilder = new CompanyBuilderType();

        CompanyDirector companyDirector = new CompanyDirector(companyBuilder);

        companyDirector.makeCompany();
        System.out.println(companyDirector.getCompany().name);
        System.out.println(companyDirector.getCompany().capSize);
        System.out.println(companyDirector.getCompany().industry);
        System.out.println(companyDirector.getCompany().listing);
        System.out.println(companyDirector.getCompany().employees);
    }
}
