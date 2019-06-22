package com.hcl.ingsymphony.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.ingsymphony.entity.Rules;

public interface RuleRepository extends JpaRepository<Rules, Integer> {

	Rules findByAreaNameAndCategoryName(String string, String string2);

}
