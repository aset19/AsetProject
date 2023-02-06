package AsetData.example.MyData.Repository;


import AsetData.example.MyData.DTO.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person,Long>{
} //унаследовали все метод передали наш обьект на котором бдуем применять
