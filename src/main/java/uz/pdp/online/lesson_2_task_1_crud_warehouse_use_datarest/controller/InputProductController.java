package uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.entity.InputProduct;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.payload.InputProductDto;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.payload.Result;
import uz.pdp.online.lesson_2_task_1_crud_warehouse_use_datarest.service.InputProductService;


@RestController
@RequestMapping("/inputProduct")
public class InputProductController {
    @Autowired
    InputProductService inputProductService;

    @PostMapping
    public Result addInputProduct(@RequestBody InputProductDto inputProductDto) {
        Result result = inputProductService.addInputProduct(inputProductDto);
        return result;
    }

    @GetMapping
    public Page<InputProduct> getInputProductPage(@RequestParam int page) {
        Page<InputProduct> inputProductPage = inputProductService.getInputProductPage(page);
        return inputProductPage;
    }

    @GetMapping("/{id}")
    public InputProduct getInputProduct(@PathVariable Integer id) {
        InputProduct inputProduct = inputProductService.getInputProduct(id);
        return inputProduct;
    }

    @PutMapping("/{id}")
    public Result editInputProduct(@PathVariable Integer id, @RequestBody InputProductDto inputProductDto) {
        Result result = inputProductService.editInputProduct(id, inputProductDto);
        return result;
    }

    @DeleteMapping("/{id}")
    public Result deleteInputProduct(@PathVariable Integer id) {
        Result result = inputProductService.deleteInputProduct(id);
        return result;
    }
}
