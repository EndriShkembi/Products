package com.shoppingcart.Products.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productid")
    private long productId;
    @Column(name = "supplierid")
    private long supplierId;
    //private long categoryId;
    @Column(name = "productname")
    private String productName;
    @Column(name = "unitprice")
    private double unitPrice;

    public Products(){super();}

    public Products(long productId, String productName, long supplierId/*, long categoryId*/, double unitPrice) {
        this.productId = productId;
        this.productName = productName;
        this.supplierId = supplierId;
        //this.categoryId = categoryId;
        this.unitPrice = unitPrice;
    }

    @ManyToOne
    @JoinColumn(name = "categoryid")
    @JsonBackReference
    Categories categories;

}
