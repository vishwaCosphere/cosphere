package com.cosphere.response;

import java.util.List;

import com.cosphere.beans.City;
import com.cosphere.beans.SpaceType;
import com.cosphere.model.SearchedSpaceContentBeans;

public class HomePageResponse {

	private List<City> cities;
	
	private List<SpaceType> spaceType;
	
	private List<SearchedSpaceContentBeans> homePageVenues;

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public List<SpaceType> getSpaceType() {
		return spaceType;
	}

	public void setSpaceType(List<SpaceType> spaceType) {
		this.spaceType = spaceType;
	}

	public List<SearchedSpaceContentBeans> getHomePageVenues() {
		return homePageVenues;
	}

	public void setHomePageVenues(List<SearchedSpaceContentBeans> homePageVenues) {
		this.homePageVenues = homePageVenues;
	}
	
}
