package asetAnimalProject.AnimalProject.Controller;

import asetAnimalProject.AnimalProject.Entity.AnimalCart;
import asetAnimalProject.AnimalProject.Entity.Order;
import asetAnimalProject.AnimalProject.Repo.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



import java.util.List;

@AllArgsConstructor
@Controller
public class OrderController {
    private final OrderRepository orderRepository;
    private final AnimalCart productCart;


    @GetMapping("/order")
    public String get(Model model) {
        List<Order> orders=orderRepository.findAll();
        model.addAttribute("orders", orders);
        return "order";
    }

    @PostMapping("/order")
    public String order(String phone) {
        Order order=new Order();
        order.setPhone(phone);
        order.setAnimals(productCart.getAnimals());

        orderRepository.save(order);
         //после заказа очищаем корзину, чтобы можно было набирать ее снова
        productCart.clear();
        return  "redirect:/order";
    }
}
