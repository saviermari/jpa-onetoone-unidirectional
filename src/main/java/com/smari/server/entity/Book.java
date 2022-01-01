package com.smari.server.entity;

import javax.persistence.*;

/**
 * Entity class for Book object
 * @author smari
 */
@Entity
@Table(name="Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "isbn", nullable = false)
    private String isbn;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToOne(cascade=CascadeType.ALL, orphanRemoval=true)
    @JoinColumn(name = "shipping_id")
    private Shipment shipping;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shipment getShipping() {
        return shipping;
    }

    public void setShipping(Shipment shipping) {
        this.shipping = shipping;
    }
}
