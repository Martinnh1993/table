import lombok.Data;

import javax.persistence.*;
import java.util.Date;

    @MappedSuperclass
    @Data
    public class Person {

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column(name = "id",
                updatable = false)
        private int id;
        @Column(name = "firstname")
        private String firstName;
        @Column(name="lastname")
        private String lastName;
        @Column(unique = true)
        private String email;
        @Temporal(TemporalType.DATE)
        @Column(name="dob")
        private Date dateOfBirth;
        private String address;
        private String city;
        @Column(name="phoneNr")
        private String phoneNr;
}
