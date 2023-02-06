package AsetData.example.MyData.Controller;


import AsetData.example.MyData.DTO.Person;
import AsetData.example.MyData.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(name="", produces = "application/json")
public class PersonController {

    @Autowired
    PersonRepository personRep;

    @RequestMapping("create-person")
    public Person createPerson(){
        return personRep.save(new Person());
    }//создаваться новая первона (каждый раз новый обьект)

    @RequestMapping("find/{id}")
    public Optional<Person> findPerson(@PathVariable Long id){
        return personRep.findById(id);
    }//находим нашего персону с айдишником



}
