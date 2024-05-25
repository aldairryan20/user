package com.ms.user.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ms.user.models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, UUID> {
}
