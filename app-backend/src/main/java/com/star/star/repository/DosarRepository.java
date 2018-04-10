package com.star.star.repository;

import com.star.star.model.Dosar;
import com.star.star.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DosarRepository extends JpaRepository<Dosar,String> {

    @Query("select d from Dosar d where d.id_user = ?1")
    List<Dosar> findDosare(int id_user);



}
