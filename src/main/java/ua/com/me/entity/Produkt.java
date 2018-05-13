package ua.com.me.entity;

import javax.persistence.*;
import java.util.*;

@Entity
public class Produkt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firmName;
    private String model;
    private double price;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> images= new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<User> users = new ArrayList<User>();

    public Produkt() {
    }

    public Produkt(String firmName, String model, double price, List<String> images) {
        this.firmName = firmName;
        this.model = model;
        this.price = price;
        this.images = images;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "id=" + id +
                ", firmName='" + firmName + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", images=" + images +
                '}';
    }
}


