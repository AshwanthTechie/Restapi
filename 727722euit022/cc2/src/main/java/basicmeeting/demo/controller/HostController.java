package basicmeeting.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RestController;

import basicmeeting.demo.model.Host;
import basicmeeting.demo.service.HostService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class HostController {
    @Autowired HostService infoserv;
    @PostMapping("/addhostinfo")
    public Host postMethodName1(@RequestBody Host info) {
        
        return infoserv.addinfo(info);
    }
    @GetMapping("/gethostinfo")
    public List<Host> getMethodName() {
        return infoserv.getinfo();
    }
    @GetMapping("/getpaginatedhosts/{page}/{size}/{sortBy}/{direction}")
    public Page<Host> getPaginatedHosts(@PathVariable int page, @PathVariable int size, @PathVariable String sortBy,
    @PathVariable String direction) {
        return infoserv.getPaginatedMeetings(page, size, sortBy, direction);
    }
}
