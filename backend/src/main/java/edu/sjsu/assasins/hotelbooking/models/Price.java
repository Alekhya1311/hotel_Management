package main.java.edu.sjsu.assasins.hotelbooking.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

@Document(collection = "price")
public class Price {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date fromdate;

    public Date getFromdate() {
        return fromdate;
    }

    public Date getTodate() {
        return todate;
    }

    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }

    public void setTodate(Date todate) {
        this.todate = todate;
    }

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date todate;
    @Column(name = "percent")
    private Integer percent;

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

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }
}
