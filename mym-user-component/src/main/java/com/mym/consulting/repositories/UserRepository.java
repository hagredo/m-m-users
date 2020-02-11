package com.mym.consulting.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Object, Integer> {
    public Object findUserByUserAndPassword(@Param("user") String user, @Param("password") String password);
}
