package data;

public enum Products {
    MDM("Юниверс MDM"),
    DQ("Юниверс DQ"),
    DG("Юниверс DG"),
    SmartETL("Юниверс SmartETL");

    public final String description;

    Products(String description) {
        this.description = description;
    }
}
