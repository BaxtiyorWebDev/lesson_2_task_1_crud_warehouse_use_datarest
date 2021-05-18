package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity.Supplier;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.projection.CustomSupplier;

@RepositoryRestResource(path = "supplier", excerptProjection = CustomSupplier.class)
public interface SupplierRepos extends JpaRepository<Supplier,Integer> {
    boolean existsByNameAndPhoneNumber(String name, String phoneNumber);

    boolean existsByNameAndPhoneNumberAndIdNot(String name, String phoneNumber, Integer id);
}
