
import javax.persistence.*;


import lombok.*;

@Entity
@Data
public class Employee extends Person {

    @Column(name = "jobTitle")
    private String jobTitle;
    private boolean admin;


}
