package basicmeeting.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import basicmeeting.demo.model.Meeting;
import basicmeeting.demo.service.MeetingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class MeetingController {
    @Autowired
    MeetingService infoserv;
    @PostMapping("/enterprofileinfo")
    public Meeting postMethodName(@RequestBody Meeting info) {        
        return infoserv.addprofileinfo(info);
    }
    @GetMapping("/getprofileinfo")
    public List<Meeting> getMethodName() {
        return infoserv.getprofileinfo();
    }
    @GetMapping("/getspecificprofile/{meetingid}")
    public Optional<Meeting> getMethodName1(@PathVariable Long meetingid) {
        return infoserv.getspecificprifileinfo(meetingid);
    }
    @PutMapping("/changehostkey/{meetingid}")
    public Meeting putMethodName(@PathVariable Long meetingid, @RequestBody Meeting meet) {
        return infoserv.changehostkey(meetingid, meet);
    }
    @DeleteMapping("/deleteinfo/{meetingid}")
    public String deleteinfo1(@PathVariable Long meetingid){
        return infoserv.deleteinfo(meetingid);
    } 
    @PutMapping("/changepassword/{meetingid}/{email}")
    public Meeting putMethodName(@PathVariable Long meetingid,@PathVariable String email, @RequestBody Meeting meet) {
        return infoserv.changepassword(meetingid, email, meet);
    }   
}