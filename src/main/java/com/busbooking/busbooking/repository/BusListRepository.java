package com.busbooking.busbooking.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.busbooking.busbooking.entity.BusListEntity;

@Repository
public interface BusListRepository extends JpaRepository<BusListEntity, Long> {


	@Query(nativeQuery = true, value = "select * from bus_list where source_id=:sourceId and destination_id=:destinationId and search_date=:searchDate")
	List<BusListEntity> findBusList (@Param("sourceId") int sourceId, @Param("destinationId") int destinationId, 
			@Param("searchDate") Date searchDate);

}
