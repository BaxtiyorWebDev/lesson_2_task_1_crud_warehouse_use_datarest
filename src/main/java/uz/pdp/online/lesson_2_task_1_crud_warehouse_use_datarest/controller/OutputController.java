package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity.Output;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.payload.OutputDto;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.payload.Result;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.service.OutputService;


@RestController
@RequestMapping("/output")
public class OutputController {
    @Autowired
    OutputService outputService;

    @PostMapping
    public Result addOutput(@RequestBody OutputDto outputDto) {
        Result result = outputService.addOutput(outputDto);
        return result;
    }

    @GetMapping
    public Page<Output> getOutputsList(@RequestParam int page) {
        Page<Output> outputsList = outputService.getOutputsList(page);
        return outputsList;
    }

    @GetMapping("/{id}")
    public Output getOutput(@PathVariable Integer id) {
        Output output = outputService.getOutput(id);
        return output;
    }

    @PutMapping("/{id}")
    public Result editOutput(@PathVariable Integer id, @RequestBody OutputDto outputDto) {
        Result result = outputService.editOutput(id, outputDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result deleteOutput(@PathVariable Integer id) {
        Result result = outputService.deleteOutput(id);
        return result;
    }
}
