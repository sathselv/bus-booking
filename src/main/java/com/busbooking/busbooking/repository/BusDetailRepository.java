package com.busbooking.busbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.busbooking.busbooking.entity.BusDetailEntity;

@Repository
public interface BusDetailRepository extends JpaRepository<BusDetailEntity, Long> {
	

}
