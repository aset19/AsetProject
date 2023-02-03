package FirstProjectSpring.AnimalProject.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String phone;
    private Date date = new Date();
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private Set<Animal> animals = new HashSet<>();
}
