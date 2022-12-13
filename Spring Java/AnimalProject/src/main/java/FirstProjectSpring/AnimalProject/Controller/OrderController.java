package FirstProjectSpring.AnimalProject.Controller;


import FirstProjectSpring.AnimalProject.Entity.AnimalCart;
import FirstProjectSpring.AnimalProject.Entity.Order;
import FirstProjectSpring.AnimalProject.Repo.OrderRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@AllArgsConstructor
@Controller
public class OrderController {
    private final OrderRepo orderRepo;
    private final AnimalCart animalCart;

    @GetMapping("/list2")
    public String get(Model model){
        List<Order> orders = orderRepo.findAll();
        model.addAttribute("orders",orders);
        return "order";
    }

    @PostMapping("/list2")
    public  String order(String name){
        Order order = new Order();
        order.setAnimals(animalCart.getAnimals());

        orderRepo.save(order);

        animalCart.clear();

        return "redirect:/list2";
    }



}
