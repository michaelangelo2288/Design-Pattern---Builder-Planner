Why use Builder pattern? More flexibility in object creation

Builder vs. (Simple) Factory Pattern - Builder pattern adds flexibility by using build() methods on top of
object (Company) getters/setters. Builder basically wraps build() methods around object getters/setters

- CompanyBuilderType implements CompanyBuilder
- Company implements CompanyPlan
- CompanyBuilderType creates Company object and wraps Company getters/setters using build() methods
- Director actually 'makes' the Company using CompanyBuilder


Advantages of the Builder pattern include:[3]
- Allows you to vary a product's internal representation.
- Encapsulates code for construction and representation.
- Provides control over steps of construction process.

Disadvantages of the Builder pattern include:[3]
- A distinct ConcreteBuilder must be created for each type of product.
- Builder classes must be mutable.
- May hamper/complicate dependency injection.