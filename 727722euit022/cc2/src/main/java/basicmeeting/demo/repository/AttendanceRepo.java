package basicmeeting.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import basicmeeting.demo.model.Attendance;

public interface AttendanceRepo extends JpaRepository<Attendance,Integer>{
    
}
