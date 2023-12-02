package com.sourabh.repo;

import com.sourabh.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User ,Integer> {

}
