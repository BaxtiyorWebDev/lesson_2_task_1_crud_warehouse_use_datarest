package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity.InputProduct;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.projection.CustomInputProduct;

@RepositoryRestResource(path = "inputProduct",excerptProjection = CustomInputProduct.class)
public interface InputProductRepos extends JpaRepository<InputProduct,Integer> {

}
