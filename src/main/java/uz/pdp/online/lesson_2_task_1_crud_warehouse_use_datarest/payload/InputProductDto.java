package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.payload;

import lombok.Data;

import java.sql.Date;

@Data
public class InputProductDto {
    private Integer productId;
    private double amount;
    private double price;
    private Date expireDate;
    private Integer inputId;
}
