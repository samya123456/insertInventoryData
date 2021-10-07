package com.samya.insertInventoryData.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samya.insertInventoryData.Jpamodel.BranchJpa;

public interface BranchRepo extends JpaRepository<BranchJpa,Integer> {
	
	List<BranchJpa> findAllBybranchStatus(String branchStatus);

}
