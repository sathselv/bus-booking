package com.busbooking.busbooking.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.busbooking.busbooking.entity.BusDetailEntity;
import com.busbooking.busbooking.repository.BusDetailRepository;
import com.busbooking.busbooking.service.BusDetailService;


@Service
public class BusDetailServiceImpl implements BusDetailService {
	
	@Autowired
	BusDetailRepository busDetailRepository;

	@Override
	public List<BusDetailEntity> getBusDetailList(List<Long> busId) {
		return busDetailRepository.findAllById(busId);
	}

}
