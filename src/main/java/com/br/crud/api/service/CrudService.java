package com.br.crud.api.service;

import com.br.crud.api.repository.CRepository;
import com.br.crud.api.user.CrudUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudService {
    private CRepository crudRepository;

    public CrudService(CRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    public List<CrudUser> create(CrudUser crudUser) {
        crudRepository.save(crudUser);
        return list();
    }

    public List<CrudUser> list() {
        return crudRepository.findAll();
    }

    public List<CrudUser> update(CrudUser crudUser) {
        crudRepository.save(crudUser);
        return list();
    }

    public List<CrudUser> delete(Long id) {
        crudRepository.deleteById(id);
        return list();
    }


}
