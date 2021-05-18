package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.payload;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class InputDto {
    private Timestamp date;
    private Integer warehouseId;
    private Integer supplierId;
    private Integer currencyId;
    private String factureNumber;
}
