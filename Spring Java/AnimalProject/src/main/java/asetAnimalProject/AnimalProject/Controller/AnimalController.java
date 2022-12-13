package asetAnimalProject.AnimalProject.Controller;

import asetAnimalProject.AnimalProject.Entity.Animal;
import asetAnimalProject.AnimalProject.Entity.AnimalCart;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Set;

@AllArgsConstructor
@Controller
public class AnimalController {

    private final AnimalCart animalCart;
    @GetMapping("/")
    public String get(Model model) {
        Set<Animal> animals = animalCart.getAnimals();
        model.addAttribute("animals", animals);//список животных для вывода
        model.addAttribute("animal", new Animal());//новое пустое животное
        return "index";
        //которое будет заполнено значением в шаблоне и попадет в параметр метода add() контроллера

        //Эти атрибуты доступны в представлении по именам ${animal} и ${animals} — см. код index.html
    }
    @PostMapping("/")
    public String add(Animal animal) {
        animalCart.add(animal);
        return  "redirect:/";
    }


}