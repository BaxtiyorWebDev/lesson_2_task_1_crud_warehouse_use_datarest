package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity.User;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.projection.CustomUser;

@RepositoryRestResource(path = "user",excerptProjection = CustomUser.class)
public interface UserRepos extends JpaRepository<User, Integer> {

    boolean existsByFirstNameAndPhoneNumber(String firstName, String phoneNumber);

    boolean existsByFirstNameAndPhoneNumberAndIdNot(String firstName, String phoneNumber, Integer id);
}
