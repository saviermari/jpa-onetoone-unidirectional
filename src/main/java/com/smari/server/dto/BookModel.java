package com.smari.server.dto;

import java.io.Serializable;

/**
 * POJO for Book DTO
 * @author smari
 */
public class BookModel  implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private String isbn;
    private ShipmentModel shipping;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public ShipmentModel getShipping() {
        return shipping;
    }

    public void setShipping(ShipmentModel shipping) {
        this.shipping = shipping;
    }
}
