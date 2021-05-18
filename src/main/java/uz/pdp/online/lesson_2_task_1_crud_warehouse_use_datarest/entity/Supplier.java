package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity.template.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Supplier extends AbstractEntity {

    @Column(unique = true, nullable = false)
    private String phoneNumber;


}
