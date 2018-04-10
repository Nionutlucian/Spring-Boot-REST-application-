package com.star.star.repository;

import com.star.star.model.DenumireEntitate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DenumireEntitateRepository extends JpaRepository<DenumireEntitate,String> {

    public List<DenumireEntitate> findAll();
}
