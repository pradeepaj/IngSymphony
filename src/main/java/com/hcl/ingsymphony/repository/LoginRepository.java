package com.hcl.ingsymphony.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.ingsymphony.entity.Role;

public interface LoginRepository extends JpaRepository<Role, Integer> {

	Role findByUserIdAndRoleName(int i, String roleName);

}
