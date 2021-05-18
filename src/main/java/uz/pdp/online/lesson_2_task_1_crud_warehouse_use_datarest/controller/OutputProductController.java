package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity.OutputProduct;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.payload.OutputProductDto;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.payload.Result;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.service.OutputProductService;

@RestController
@RequestMapping("/outputProduct")
public class OutputProductController {
    @Autowired
    OutputProductService outputProductService;

    @PostMapping
    public Result addOutputProduct(@RequestBody OutputProductDto outputProductDto) {
        Result result = outputProductService.addOutputProduct(outputProductDto);
        return result;
    }

    @GetMapping
    public Page<OutputProduct> getOutputProductPage(@RequestParam int page) {
        Page<OutputProduct> outputProductPage = outputProductService.getOutputProductPage(page);
        return outputProductPage;
    }

    @GetMapping("/{id}")
    public OutputProduct getOutputProduct(@PathVariable Integer id) {
        OutputProduct outputProduct = outputProductService.getOutputProduct(id);
        return outputProduct;
    }

    @PutMapping("/{id}")
    public Result editOutProduct(@PathVariable Integer id, @RequestBody OutputProductDto outputProductDto) {
        Result result = outputProductService.editOutputProduct(id, outputProductDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result deleteOutputProduct(@PathVariable Integer id) {
        Result result = outputProductService.deleteOutputProduct(id);
        return result;
    }
}
