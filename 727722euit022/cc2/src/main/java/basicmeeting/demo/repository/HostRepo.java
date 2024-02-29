package basicmeeting.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import basicmeeting.demo.model.Host;

public interface HostRepo extends JpaRepository<Host,Integer>{
    
}
