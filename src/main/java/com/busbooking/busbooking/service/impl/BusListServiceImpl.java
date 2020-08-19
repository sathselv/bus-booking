package com.busbooking.busbooking.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.busbooking.busbooking.entity.BusDetailEntity;
import com.busbooking.busbooking.entity.BusListEntity;
import com.busbooking.busbooking.repository.BusListRepository;
import com.busbooking.busbooking.service.BusDetailService;
import com.busbooking.busbooking.service.BusListService;


@Service
public class BusListServiceImpl implements BusListService {

	@Autowired
	BusListRepository busListRepository;

	@Autowired
	BusDetailService busDetailService;

	@Override
	public List<BusDetailEntity> getBusList(int sourceId, int destinationId, Date searchDate) {
		List<Long> busIdList = new ArrayList<Long>();
		List<BusListEntity> busList = busListRepository.findBusList(sourceId, destinationId, searchDate);
		busList.forEach(entity -> busIdList.add(entity.getBusId()));
		return busDetailService.getBusDetailList(busIdList);
	}

}
