package basicmeeting.demo.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.Data;
@Transactional
@Entity
@Table(name = "host")
@Data
public class Host {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int meeting_id;

    String username;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "meetingid")
    List<Attendance> attendance;
}