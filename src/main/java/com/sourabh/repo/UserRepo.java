package com.sourabh.repo;

import com.sourabh.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepo extends CrudRepository<User ,Integer> {

    public List<User> findByNameLike(String name);
    public User findByNameAndId(String name ,int id);

    //More custom method can be like
    public List<User> findByNameStartingWith(String prefix);
    public List<User> findByNameEndingWith(String suffix);

    //JPQL Query
    @Query("select u from User u where u.name =:n")
    public List<User> getUserByName(@Param("n") String name);

    


}
