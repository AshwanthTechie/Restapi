package basicmeeting.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import basicmeeting.demo.model.Host;
import basicmeeting.demo.repository.HostRepo;

@Service
public class HostService {
    @Autowired HostRepo inforepo;
    public Host addinfo (Host info){
        return inforepo.save(info);
    }
    public List<Host> getinfo(){
        return inforepo.findAll();
    }
    public Page<Host> getPaginatedMeetings(int page, int size, String sortBy, String direction) {
        Sort sort = Sort.by(direction.equals("asc") ? Sort.Direction.ASC : Sort.Direction.DESC, sortBy);
        Pageable pageable = PageRequest.of(page, size, sort);
        return inforepo.findAll(pageable);
    }
}
