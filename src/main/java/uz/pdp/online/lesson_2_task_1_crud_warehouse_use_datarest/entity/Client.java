package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity.template.AbstractEntity;

import javax.persistence.Entity;


@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Client extends AbstractEntity {
    private String phoneNumber;
}
