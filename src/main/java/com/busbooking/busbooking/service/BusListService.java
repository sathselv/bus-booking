package com.busbooking.busbooking.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.busbooking.busbooking.entity.BusDetailEntity;

@Service
public interface BusListService {
	
	List<BusDetailEntity> getBusList(int sourceId, int destinationId, Date date);

}
