package main.java.edu.sjsu.assasins.hotelbooking.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;

@Document(collection = "Booking")
public class Booking {
    @Id
    private String id;
    private String roomname;

    private String status;

    private Room room;

    private String userid;

//    @Temporal(TemporalType.DATE)
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date bookTime;

//    @Temporal(TemporalType.DATE)
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @JsonFormat( pattern = "dd-MM-yyyy")
    private Date fromdate;

//    @Temporal(TemporalType.DATE)
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @JsonFormat( pattern = "dd-MM-yyyy")
    private Date todate;

    private String extracostapplied;

    private String offerapplied;

    private int guestscount;

    private int totalamount;

    private int totaldays;

    private int remainingAmount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Date getBookTime() {
        return bookTime;
    }

    public void setBookTime(Date bookTime) {
        this.bookTime = bookTime;
    }

    public Date getFromdate() {
        return fromdate;
    }

    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }

    public Date getTodate() {
        return todate;
    }

    public void setTodate(Date todate) {
        this.todate = todate;
    }

    public String getExtracostapplied() {
        return extracostapplied;
    }

    public void setExtracostapplied(String extracostapplied) {
        this.extracostapplied = extracostapplied;
    }

    public String getOfferapplied() {
        return offerapplied;
    }

    public void setOfferapplied(String offerapplied) {
        this.offerapplied = offerapplied;
    }

    public int getGuestscount() {
        return guestscount;
    }

    public void setGuestscount(int guestscount) {
        this.guestscount = guestscount;
    }

    public int getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(int totalamount) {
        this.totalamount = totalamount;
    }

    public int getTotaldays() {
        return totaldays;
    }

    public void setTotaldays(int totaldays) {
        this.totaldays = totaldays;
    }

    public int getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(int remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

}
