package FirstProjectSpring.AnimalProject.Entity;

import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Entity
public class Animal {


    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    @Column(name="id")
    private Long id;


    @Column(name="name")
    private String name;


}
