package org.manjeetcarpet.modelVO.product;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    private int id;

    private String name;
    private String description;
    private String color;
    private double price;
    private String imageURL;

    // **************************************
    // Constructorus
    //***************************************
    public Product(){
    }

    public Product(String name, String description, String color, double price, String imageURL) {
        this.name = name;
        this.description = description;
        this.color = color;
        this.price = price;
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Product [color=" + color + ", description=" + description + ", id=" + id + ", imageURL=" + imageURL
                + ", name=" + name + ", price=" + price + "]";
    }

    // **************************************
    // Getters and Setter Methods
    //***************************************
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getImageURL() {
        return imageURL;
    }
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
