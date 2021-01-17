package com.neutronstar.webstore.resources;

import com.neutronstar.webstore.entities.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @GetMapping
    public List <Category> listar(){

        Category cat1 = new Category(1L, "Informática");
        Category cat2 = new Category(2L, "Escritório");

        List<Category> list = new ArrayList<>();
        list.add(cat1);
        list.add(cat2);
        
        return list;
    }
}
