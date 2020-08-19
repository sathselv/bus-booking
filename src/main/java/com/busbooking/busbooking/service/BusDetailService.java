package com.busbooking.busbooking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.busbooking.busbooking.entity.BusDetailEntity;

@Service
public interface BusDetailService {
	
	List<BusDetailEntity> getBusDetailList(List<Long> busId);

}
