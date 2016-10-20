package com.cosphere.response;

import com.cosphere.beans.SpaceDetails;
import com.cosphere.model.VenueDetailsBean;

public class SpaceDetailResponse {

	private SpaceDetails spaceDetails;
	
	private VenueDetailsBean venueDetailsBean;

	public SpaceDetails getSpaceDetails() {
		return spaceDetails;
	}

	public void setSpaceDetails(SpaceDetails spaceDetails) {
		this.spaceDetails = spaceDetails;
	}

	public VenueDetailsBean getVenueDetailsBean() {
		return venueDetailsBean;
	}

	public void setVenueDetailsBean(VenueDetailsBean venueDetailsBean) {
		this.venueDetailsBean = venueDetailsBean;
	}
	
}
