package basicmeeting.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import basicmeeting.demo.model.Meeting;

@Repository
public interface MeetingRepo extends JpaRepository<Meeting,Long>{
    
}
