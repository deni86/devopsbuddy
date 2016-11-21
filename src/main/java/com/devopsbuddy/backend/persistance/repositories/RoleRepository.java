package com.devopsbuddy.backend.persistance.repositories;


import com.devopsbuddy.backend.persistance.domain.backend.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Deni86 on 21.11.2016..
 */
@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
}
