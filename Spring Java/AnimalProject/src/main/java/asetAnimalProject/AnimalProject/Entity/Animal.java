package asetAnimalProject.AnimalProject.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@Data
@Entity
public class Animal {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "num", nullable = false)
    private Long num;

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;
    private String name;

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }
}
