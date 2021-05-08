package com.example.shakil.customalertdialog.Model;

public class EmployeeModel {
    private int employeeImage;
    private String employeeName;
    private String employeeSpecialist;
    private String employeeNationality;

    public EmployeeModel() {
    }

    public EmployeeModel(int employeeImage, String employeeName, String employeeSpecialist, String employeeNationality) {
        this.employeeImage = employeeImage;
        this.employeeName = employeeName;
        this.employeeSpecialist = employeeSpecialist;
        this.employeeNationality = employeeNationality;
    }

    public int getEmployeeImage() {
        return employeeImage;
    }

    public void setEmployeeImage(int employeeImage) {
        this.employeeImage = employeeImage;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSpecialist() {
        return employeeSpecialist;
    }

    public void setEmployeeSpecialist(String employeeSpecialist) {
        this.employeeSpecialist = employeeSpecialist;
    }

    public String getEmployeeNationality() {
        return employeeNationality;
    }

    public void setEmployeeNationality(String employeeNationality) {
        this.employeeNationality = employeeNationality;
    }
}
