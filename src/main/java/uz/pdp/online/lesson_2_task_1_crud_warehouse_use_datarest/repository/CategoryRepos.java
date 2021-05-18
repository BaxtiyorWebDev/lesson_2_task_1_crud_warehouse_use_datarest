package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity.Category;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.projection.CustomCategory;

@RepositoryRestResource(path = "category", excerptProjection = CustomCategory.class)
public interface CategoryRepos extends JpaRepository<Category,Integer> {

    boolean existsByNameAndIdNot(String name, Integer id);
}
