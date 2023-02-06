package AsetData.example.MyData.DTO;


import javax.persistence.*;

@Entity //дает понять что это сущность которую надо сохранять в БД
@Table(name = "Person") //говорим что создаем табл с названием person
public class Person {


    @javax.persistence.Id //Задаем ID
    @GeneratedValue //Автомат генерируемое поле(как и в каком порядке будет генерироваться)
    @Column(name="id", nullable = false) //это поле назвается айд и она не может быть нулл
    private Long Id; //создаем


    @Column(name= "person_name")
    private String name;

    public Person() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
