package tommy.kay.tommyK.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class UserData {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
