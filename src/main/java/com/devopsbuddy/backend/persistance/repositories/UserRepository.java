package com.devopsbuddy.backend.persistance.repositories;

import com.devopsbuddy.backend.persistance.domain.backend.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Deni86 on 19.11.2016..
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {//User je key a Long je tip posto je userId tipa long

}
