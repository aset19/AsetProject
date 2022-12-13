package FirstProjectSpring.AnimalProject.Controller;


import FirstProjectSpring.AnimalProject.Entity.Animal;
import FirstProjectSpring.AnimalProject.Entity.AnimalCart;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Set;

@AllArgsConstructor
@Controller
public class AnimalController {
    private final AnimalCart animalCart;

    @GetMapping("/list1")
    public String get(Model model){
        Set<Animal> animals = animalCart.getAnimals();

        model.addAttribute("animals",animals);
        model.addAttribute("animal", new Animal());
        return "animal";
    }

    @PostMapping("/list1")
    public String add(@Valid Animal animal, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("animal", animalCart.getAnimals());
        }
        animalCart.add(animal);
        return "redirect:/list1";
    }


}
