package com.star.star.repository;

import com.star.star.model.TipDocument;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TipDocumentRepository extends JpaRepository<TipDocument,String> {

    public List<TipDocument> findAll();

}
