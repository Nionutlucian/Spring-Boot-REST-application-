package com.star.star.repository;

import com.star.star.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DocumentRepository extends JpaRepository<Document,String> {

    @Query("select d from Document d where d.id_user = ?1")
    public List<Document> afisareDocumente(int id_user);

}
