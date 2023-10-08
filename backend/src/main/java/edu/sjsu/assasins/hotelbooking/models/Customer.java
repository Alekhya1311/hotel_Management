package main.java.edu.sjsu.assasins.hotelbooking.models;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Id;

@Document(collection = "Customer")
public class Customer{
    @Id
    @Column(name = "id")
    private String id;
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    private String password;
    private String name;
    private boolean isAdmin;
    private int rewardPoints;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public boolean getAdmin() {
        return isAdmin;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public Customer() {
    }

    public Customer(String email, String password, String name, Boolean isAdmin, int rewardPoints) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.isAdmin = isAdmin;
        this.rewardPoints = rewardPoints;
    }
}