package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity.Attachment;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.payload.Result;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.service.AttachmentService;


@RestController
@RequestMapping("attachment")
public class AttachmentController {

    @Autowired
    AttachmentService attachmentService;

    @PostMapping("/upload")
    public Result upload(MultipartHttpServletRequest request) {
        Result result = attachmentService.uploadFile(request);
        return result;
    }

    @GetMapping
    public Page<Attachment> getAttachmentsList(@RequestParam int page) {
        Page<Attachment> attachmentsList = attachmentService.getAttachmentsList(page);
        return attachmentsList;
    }

    @GetMapping("/{id}")
    public Attachment getAttachment(@PathVariable Integer id) {
        Attachment attachment = attachmentService.getAttachment(id);
        return attachment;
    }


//    @DeleteMapping("/{id}")
//    public Result deleteAttachment(@PathVariable Integer id) {
//        Result result = attachmentService.deleteAttachment(id);
//        return result;
//    }
}
