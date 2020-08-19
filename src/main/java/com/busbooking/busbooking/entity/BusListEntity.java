package com.busbooking.busbooking.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bus_list")
public class BusListEntity {

	@Id
	@Column(name = "bus_id")
	private long busId;
	
	@Column(name = "source_id")
	private int sourceId;
	
	@Column(name = "destination_id")
	private int DestinationId;

	@Column(name = "search_date")
	private Date searchDate;

	public long getBusId() {
		return busId;
	}

	public void setBusId(long busId) {
		this.busId = busId;
	}

	public int getSourceId() {
		return sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public int getDestinationId() {
		return DestinationId;
	}

	public void setDestinationId(int destinationId) {
		DestinationId = destinationId;
	}

	public Date getSearchDate() {
		return searchDate;
	}

	public void setSearchDate(Date searchDate) {
		this.searchDate = searchDate;
	}
}
