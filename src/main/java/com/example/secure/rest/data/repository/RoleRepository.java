package com.example.secure.rest.data.repository;

import com.example.secure.rest.data.model.Role;
import com.example.secure.rest.data.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
