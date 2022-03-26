package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
