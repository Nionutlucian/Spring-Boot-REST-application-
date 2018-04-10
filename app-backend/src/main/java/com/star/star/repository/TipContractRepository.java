package com.star.star.repository;

import com.star.star.model.TipContract;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TipContractRepository extends JpaRepository<TipContract,String> {

    public List<TipContract> findAll();
}
