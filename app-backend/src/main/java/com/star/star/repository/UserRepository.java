package com.star.star.repository;

import com.star.star.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,String> {

    User findByUsernameAndPassword(String username,String password);

    @Query("select u from User u where u.username = ?1 and u.password = ?2")
    User loginQuery(String username,String password);

}
