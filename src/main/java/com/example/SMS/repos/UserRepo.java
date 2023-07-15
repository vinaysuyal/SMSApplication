package com.example.SMS.repos;

import com.example.SMS.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<UserEntity, Integer> {
    UserEntity getUserEntityByUserId(int id);
}
