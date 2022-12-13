package asetAnimalProject.AnimalProject.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Data
@Entity
@Table(name = "orders")
public class Order {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "num", nullable = false)
    private Long num;

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;
    private String phone;
    private Date date=new Date();
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private Set<Animal> animals=new HashSet<>();
}
