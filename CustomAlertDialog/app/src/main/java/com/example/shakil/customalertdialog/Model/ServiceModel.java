package com.example.shakil.customalertdialog.Model;

public class ServiceModel {
    private String serviceName;
    private String sortDescription;
    private int serviceImage;

    public ServiceModel() {
    }

    public ServiceModel(String serviceName, String sortDescription, int serviceImage) {
        this.serviceName = serviceName;
        this.sortDescription = sortDescription;
        this.serviceImage = serviceImage;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getSortDescription() {
        return sortDescription;
    }

    public void setSortDescription(String sortDescription) {
        this.sortDescription = sortDescription;
    }

    public int getServiceImage() {
        return serviceImage;
    }

    public void setServiceImage(int serviceImage) {
        this.serviceImage = serviceImage;
    }
}
