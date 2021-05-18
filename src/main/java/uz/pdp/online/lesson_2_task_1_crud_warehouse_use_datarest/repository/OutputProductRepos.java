package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity.OutputProduct;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.projection.CustomOutputProduct;

@RepositoryRestResource(path = "outputProduct", excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepos extends JpaRepository<OutputProduct,Integer> {

}
