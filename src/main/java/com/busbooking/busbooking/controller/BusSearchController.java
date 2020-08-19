package com.busbooking.busbooking.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.busbooking.busbooking.entity.BusDetailEntity;
import com.busbooking.busbooking.service.BusListService;


@RestController
@RequestMapping(value = "/getBusList")
public class BusSearchController {

	@Autowired
	BusListService busListService;

	@GetMapping(value = "/{sourceId}/{destinationId}/{searchDate}")
	public List<BusDetailEntity> getBusList(@PathVariable("sourceId") int sourceId, @PathVariable("destinationId") int destinationId,
			@PathVariable("date") @DateTimeFormat(pattern="yyyy-MM-dd") Date searchDate){
		return busListService.getBusList(sourceId, destinationId, searchDate);
	}

}
