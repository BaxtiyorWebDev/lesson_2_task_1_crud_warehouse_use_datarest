package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();

    String getName();

    Integer getCategory();

    Integer getPhoto();

    String getCode();

    Integer getMeasurement();

    boolean isActive();
}
