package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class product {
    @Id
    private int id;
    private String productname;
    private double productPrice;

    public product() {
    }

    public product(int id, String productname, double productPrice) {
        this.id = id;
        this.productname = productname;
        this.productPrice = productPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", productname='" + productname + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}

