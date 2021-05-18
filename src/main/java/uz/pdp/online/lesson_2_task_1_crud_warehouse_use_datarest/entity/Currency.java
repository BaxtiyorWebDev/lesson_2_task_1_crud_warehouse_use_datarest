package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity.template.AbstractEntity;

import javax.persistence.Entity;


@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Currency extends AbstractEntity {

}
