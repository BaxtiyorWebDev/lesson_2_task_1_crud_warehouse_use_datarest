package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.payload;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String password;
    private String prePassword;
    private boolean active;
    private List<Integer> warehousesId;
}
