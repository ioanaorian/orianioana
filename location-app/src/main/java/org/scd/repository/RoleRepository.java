package org.scd.repository;

import org.scd.model.security.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role, Long> {
    /**
     * Find role by id
     * @param id
     * @return
     */
    Optional<Role> findById(Long id);
}
