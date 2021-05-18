package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity.Input;

public interface InputRepos extends JpaRepository<Input,Integer> {

    boolean existsByFactureNumber(String factureNumber);

    boolean existsByFactureNumberAndIdNot(String factureNumber, Integer id);

}
