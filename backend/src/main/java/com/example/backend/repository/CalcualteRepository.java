package com.example.backend.repository;

import com.example.backend.model.Calculate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalcualteRepository extends CrudRepository<Calculate, Long> {

}
