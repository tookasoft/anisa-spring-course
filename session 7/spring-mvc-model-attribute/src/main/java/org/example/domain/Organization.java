package org.example.domain;

public class Organization {

    private int organizationId;
    private String companyName;
    private int yearOfIncorporation;
    private int postalCode;
    private int employeeCount;
    private String slogan;

    public Organization() {
    }

    public Organization(String companyName, int yearOfIncorporation, int postalCode, int employeeCount, String slogan) {
        this.companyName = companyName;
        this.yearOfIncorporation = yearOfIncorporation;
        this.postalCode = postalCode;
        this.employeeCount = employeeCount;
        this.slogan = slogan;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getYearOfIncorporation() {
        return yearOfIncorporation;
    }

    public void setYearOfIncorporation(int yearOfIncorporation) {
        this.yearOfIncorporation = yearOfIncorporation;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "organizationId=" + organizationId +
                ", companyName='" + companyName + '\'' +
                ", yearOfIncorporation=" + yearOfIncorporation +
                ", postalCode=" + postalCode +
                ", employeeCount=" + employeeCount +
                ", slogan='" + slogan + '\'' +
                '}';
    }
}
