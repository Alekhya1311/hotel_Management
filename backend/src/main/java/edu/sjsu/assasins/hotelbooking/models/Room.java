package main.java.edu.sjsu.assasins.hotelbooking.models;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

@Document(collection = "Room")
public class Room {
    public Room() {
    }

    @Id
    private String id;

    private String name;

    private int maxCount;

    private String phonenumber;

    private int rentPerDay;

    private int rentPerExtraGuestPerDay;

    private int freeGuestCount;

    private int percentHikePerDayOnWeekend;

    private List<String> imageUrls;

    private List<Booking> currentBookings;

    public Room(String id, String name, int maxCount, String phonenumber, int rentPerDay, int rentPerExtraGuestPerDay, int freeGuestCount, int percentHikePerDayOnWeekend, List<String> imageUrls, List<Booking> currentBookings, String type, String description, String location) {
        this.id = id;
        this.name = name;
        this.maxCount = maxCount;
        this.phonenumber = phonenumber;
        this.rentPerDay = rentPerDay;
        this.rentPerExtraGuestPerDay = rentPerExtraGuestPerDay;
        this.freeGuestCount = freeGuestCount;
        this.percentHikePerDayOnWeekend = percentHikePerDayOnWeekend;
        this.imageUrls = imageUrls;
        this.currentBookings = currentBookings;
        this.type = type;
        this.description = description;
        this.location = location;
    }

    private String type;

    private String description;

    private String location;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getRentPerDay() {
        return rentPerDay;
    }

    public void setRentPerDay(int rentPerDay) {
        this.rentPerDay = rentPerDay;
    }

    public int getRentPerExtraGuestPerDay() {
        return rentPerExtraGuestPerDay;
    }

    public void setRentPerExtraGuestPerDay(int rentPerExtraGuestPerDay) {
        this.rentPerExtraGuestPerDay = rentPerExtraGuestPerDay;
    }

    public int getFreeGuestCount() {
        return freeGuestCount;
    }

    public void setFreeGuestCount(int freeGuestCount) {
        this.freeGuestCount = freeGuestCount;
    }

    public int getPercentHikePerDayOnWeekend() {
        return percentHikePerDayOnWeekend;
    }

    public void setPercentHikePerDayOnWeekend(int percentHikePerDayOnWeekend) {
        this.percentHikePerDayOnWeekend = percentHikePerDayOnWeekend;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public List<Booking> getCurrentBookings() {
        return currentBookings;
    }

    public void setCurrentBookings(List<Booking> currentBookings) {
        this.currentBookings = currentBookings;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
