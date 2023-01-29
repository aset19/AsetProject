package FirstProjectSpring.AnimalProject.Controller;


import FirstProjectSpring.AnimalProject.Entity.AnimalCart;
import FirstProjectSpring.AnimalProject.Entity.Order;
import FirstProjectSpring.AnimalProject.Repo.OrderRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/list2")
public class OrderController {
    private final OrderRepo orderRepo;
    private final AnimalCart animalCart;

    @GetMapping
    public String get(Model model){
        List<Order> orders = orderRepo.findAll();
        model.addAttribute("orders",orders);
        return "order";
    }

    @PostMapping
    public  String create(String phone){
        Order order = new Order();
        order.setPhone(phone);
        order.setAnimals(animalCart.getAnimals());


        orderRepo.save(order);

        animalCart.clear();

        return "redirect:/list2";
    }



}
