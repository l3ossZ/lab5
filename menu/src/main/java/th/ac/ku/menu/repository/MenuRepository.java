package th.ac.ku.menu.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.menu.model.Menu;

import java.util.UUID;
public interface MenuRepository extends JpaRepository<Menu, UUID>{


}
