package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {

    Integer getId();

    String getName();

    Category getParentCategory();
}
