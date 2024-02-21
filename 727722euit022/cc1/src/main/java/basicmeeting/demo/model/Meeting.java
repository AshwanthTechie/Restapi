package basicmeeting.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "profile")
public class Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long meetingid;
    int hostkey;
    String email,username,password;
    String activeplan;
    String timezone;
    public Long getMeetingid() {
        return meetingid;
    }
    public void setMeetingid(Long meetingid) {
        this.meetingid = meetingid;
    }
    public int getHostkey() {
        return hostkey;
    }
    public void setHostkey(int hostkey) {
        this.hostkey = hostkey;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getActiveplan() {
        return activeplan;
    }
    public void setActiveplan(String activeplan) {
        this.activeplan = activeplan;
    }
    public String getTimezone() {
        return timezone;
    }
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

}
