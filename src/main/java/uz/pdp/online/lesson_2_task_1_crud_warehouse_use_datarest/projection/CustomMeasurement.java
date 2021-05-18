package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity.Measurement;

@Projection(types = Measurement.class)
public interface CustomMeasurement {

    Integer getId();

    String getName();

    boolean isActive();


}
