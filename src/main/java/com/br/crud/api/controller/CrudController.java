package com.br.crud.api.controller;

import com.br.crud.api.service.CrudService;
import com.br.crud.api.user.CrudUser;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class CrudController {
    private CrudService crudService;

    public CrudController(CrudService crudService) {
        this.crudService = crudService;
    }

    @PostMapping
    List<CrudUser> create(@RequestBody CrudUser crudUser){
        return crudService.create(crudUser);
    }

    @GetMapping
    List<CrudUser> list(){
        return crudService.list();
    }

    @PutMapping
    List<CrudUser> update(@RequestBody CrudUser crudUser){
        return crudService.update(crudUser);
    }

    @DeleteMapping("{id}")
    List<CrudUser> delete(@PathVariable("id") Long id){
        return crudService.delete(id);
    }
}
