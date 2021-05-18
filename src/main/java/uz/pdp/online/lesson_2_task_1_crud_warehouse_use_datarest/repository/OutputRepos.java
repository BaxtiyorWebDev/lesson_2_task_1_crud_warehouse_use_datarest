package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity.Output;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.projection.CustomOutput;

@RepositoryRestResource(path = "output",excerptProjection = CustomOutput.class)
public interface OutputRepos extends JpaRepository<Output,Integer> {

    boolean existsByFactureNumber(String factureNumber);

    boolean existsByFactureNumberAndIdNot(String factureNumber, Integer id);

}
