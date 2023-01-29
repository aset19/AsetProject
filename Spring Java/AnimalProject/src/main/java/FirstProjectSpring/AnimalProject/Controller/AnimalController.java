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
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@AllArgsConstructor
@Controller
@RequestMapping("/list1")
public class AnimalController {
    private final AnimalCart animalCart;

    @GetMapping
    public String get(Model model){
        Set<Animal> animals = animalCart.getAnimals();

        model.addAttribute("animal", new Animal());
        model.addAttribute("animals",animals);

        return "animal";
    }

    @PostMapping
    public String add(@Valid Animal animal, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("animal", animalCart.getAnimals());
        }
        animalCart.add(animal);
        return "redirect:/list1";
    }


}
