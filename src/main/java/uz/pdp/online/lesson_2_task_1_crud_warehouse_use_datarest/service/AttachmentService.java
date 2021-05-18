package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.service;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity.Attachment;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity.AttachmentContent;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.payload.Result;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.repository.AttachmentContentRepo;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.repository.AttachmentRepository;

import java.util.Iterator;
import java.util.Optional;

@Service
public class AttachmentService {

    @Autowired
    AttachmentRepository attachmentRepository;
    @Autowired
    AttachmentContentRepo attachmentContentRepo;

    @SneakyThrows//exception
    public Result uploadFile(MultipartHttpServletRequest request) {
        Iterator<String> fileNames = request.getFileNames();
        MultipartFile file = request.getFile(fileNames.next());

        Attachment attachment = new Attachment();
        attachment.setName(file.getOriginalFilename());
        attachment.setSize(file.getSize());
        attachment.setContentType(file.getContentType());
        Attachment savedAttachment = attachmentRepository.save(attachment);

        AttachmentContent attachmentContent = new AttachmentContent();
        attachmentContent.setBytes(file.getBytes());
        attachmentContent.setAttachment(savedAttachment);
        attachmentContentRepo.save(attachmentContent);

        return new Result("Fayl saqlandi", true);
    }

    public Page<Attachment> getAttachmentsList(int page) {
        Pageable pageable = PageRequest.of(page, 20);
        Page<Attachment> attachments = attachmentRepository.findAll(pageable);
        return attachments;
    }

    public Attachment getAttachment(Integer id) {
        Optional<Attachment> optionalAttachment = attachmentRepository.findById(id);
        return optionalAttachment.get();
    }


    public Result deleteAttachment(Integer id) {
        Optional<Attachment> optionalAttachment = attachmentRepository.findById(id);
        if (!optionalAttachment.isPresent())
            return new Result("Bunday ma'lumot topilmadi", false);
        AttachmentContent byAttachmentId = attachmentContentRepo.findByAttachmentId(id);
        attachmentContentRepo.delete(byAttachmentId);
        attachmentRepository.delete(optionalAttachment.get());
        return new Result("Ma'lumot o'chirildi", true);
    }
}
