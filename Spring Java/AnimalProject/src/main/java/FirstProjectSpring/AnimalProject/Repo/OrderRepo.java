package FirstProjectSpring.AnimalProject.Repo;

import FirstProjectSpring.AnimalProject.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Order,Long> {
}
