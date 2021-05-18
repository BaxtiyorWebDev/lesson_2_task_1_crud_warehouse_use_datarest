package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity.template.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category extends AbstractEntity {

    @ManyToOne
    private Category parentCategory;

}
