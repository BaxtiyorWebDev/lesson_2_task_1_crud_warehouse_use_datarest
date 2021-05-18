package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String firstName;

    private String lastName;

    @Column(unique = true, nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String code;//tartib raqami

    @Column(nullable = false)

    private String password;

    private boolean active=true;

    /*/set qo'yishdan maqsad 1 ta userga 1 ta ombor biriktirilgandan so'ng,
     o'sha ombor shu userga qayta biriktirilmasligi uchun*/
    @ManyToMany
    private List<Warehouse> warehouses;
}
