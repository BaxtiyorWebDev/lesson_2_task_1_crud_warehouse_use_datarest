package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity.Client;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.projection.CustomClient;

@RepositoryRestResource(path = "client",excerptProjection = CustomClient.class)
public interface ClientRepos extends JpaRepository<Client,Integer> {
    boolean existsByNameAndPhoneNumber(String name, String phoneNumber);

    boolean existsByNameAndPhoneNumberAndIdNot(String name, String phoneNumber, Integer id);
}
