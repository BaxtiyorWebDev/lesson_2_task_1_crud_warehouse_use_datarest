package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity.AttachmentContent;

public interface AttachmentContentRepo extends JpaRepository<AttachmentContent, Integer> {
    AttachmentContent findByAttachmentId(Integer attachment_id);
}
