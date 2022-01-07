package com.smari.server.dto;

import java.io.Serializable;

/**
 * POJO for Shipment DTO
 * @author smari
 */
public class ShipmentModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String city;
    private String zipCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
