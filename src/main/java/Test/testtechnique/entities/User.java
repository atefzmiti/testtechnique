package Test.testtechnique.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class User {

    @Id

    private String userId ;
    private String userName ;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime date;

    @OneToOne
    @JoinColumn(name = "custom_id", referencedColumnName = "id")
    private Custom custom;

    public Custom getCustom() {
        return custom;
    }

    public void setCustom(Custom custom) {
        this.custom = custom;
    }

    public User() {
    }

    public User(String userId, String userName, LocalDateTime date, Custom custom) {
        this.userId = userId;
        this.userName = userName;
        this.date = date;
        this.custom = custom;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }


}
