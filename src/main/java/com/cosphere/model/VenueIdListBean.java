package com.cosphere.model;

public class VenueIdListBean {

	private String venueid;
	private String distance;
	public String getVenueid() {
		return venueid;
	}
	public void setVenueid(String venueid) {
		this.venueid = venueid;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "VenueIdListBean [venueid=" + venueid + ", distance=" + distance
				+ "]";
	}

}
