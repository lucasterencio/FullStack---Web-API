package com.br.crud.api.repository;


import com.br.crud.api.user.CrudUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudRepository extends JpaRepository<CrudUser, Long> {
}
