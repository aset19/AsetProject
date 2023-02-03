package FirstProjectSpring.AnimalProject.Entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    private Long id;
    @NotBlank
    @Size(min=2, max=50)
    private String name;


}
