package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.payload;

import lombok.Data;

@Data
public class CategoryDto {
    private String name;
    private Integer parentCategoryId;
    private boolean active;
}
