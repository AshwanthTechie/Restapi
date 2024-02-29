package basicmeeting.demo.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.Data;

@Transactional
@Entity
@Table(name = "attendance")
@Data
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int m_id;
    String email;
    String username;
    //@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    String entry_time;
    

    //@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    String exit_time;
}
