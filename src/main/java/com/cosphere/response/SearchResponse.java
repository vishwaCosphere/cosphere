package com.cosphere.response;

import java.util.List;
import java.util.Map;

import com.cosphere.beans.SpaceDetails;
import com.cosphere.model.VenueDetailsBean;

public class SearchResponse {

	private List<SpaceDetails> spaces;
	
	private Map<Integer,VenueDetailsBean > venueMap;

	public List<SpaceDetails> getSpaces() {
		return spaces;
	}

	public void setSpaces(List<SpaceDetails> spaces) {
		this.spaces = spaces;
	}

	public Map<Integer, VenueDetailsBean> getVenueMap() {
		return venueMap;
	}

	public void setVenueMap(Map<Integer, VenueDetailsBean> venueMap) {
		this.venueMap = venueMap;
	}
	
}
