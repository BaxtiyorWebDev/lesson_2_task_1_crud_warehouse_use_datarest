package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {

    Integer getId();

    String getName();

    boolean isActive();
}
