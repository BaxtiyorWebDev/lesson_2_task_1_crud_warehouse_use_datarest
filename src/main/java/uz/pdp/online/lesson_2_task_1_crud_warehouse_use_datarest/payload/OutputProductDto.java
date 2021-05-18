package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.payload;

import lombok.Data;

@Data
public class OutputProductDto {
    private Integer productId;
    private double amount;
    private double price;
    private Integer outputId;
}
