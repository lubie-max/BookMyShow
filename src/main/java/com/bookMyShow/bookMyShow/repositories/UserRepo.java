package com.bookMyShow.bookMyShow.repositories;

import com.bookMyShow.bookMyShow.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepo extends JpaRepository<Users, UUID> {

//    List<Users> findByEmail(String email);
    Optional<Users> findByEmail(String email); // this is required!

}
