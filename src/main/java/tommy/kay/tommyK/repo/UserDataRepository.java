package tommy.kay.tommyK.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import tommy.kay.tommyK.model.UserData;

public interface UserDataRepository extends JpaRepository<UserData, Long> {
}
