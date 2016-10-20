package com.cosphere.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.cosphere.beans.SpaceDetails;
import com.cosphere.beans.VenueType;
import com.cosphere.model.SearchedSpaceContentBeans;
import com.cosphere.model.UserDetails;
import com.cosphere.model.VenueDetailsBean;

@Repository
public class SearchDao {

	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public void  saveUserDetails(UserDetails userDetails){
		mongoTemplate.save(userDetails, "userDetails");
	}
	
	
	public void saveVenueDetails(VenueDetailsBean venueDetailsBean){
		mongoTemplate.save(venueDetailsBean, "venue");
	}
	
	public void saveSpaceSearch(SearchedSpaceContentBeans searchedSpaceContentBeans){
		mongoTemplate.save(searchedSpaceContentBeans, "spaceSearch");
	}
	
	public void saveCity(VenueType spaceType){
		mongoTemplate.save(spaceType, "venueType");
	}
	
	public void saveSpaceDetails(SpaceDetails spaceDetails){
		mongoTemplate.save(spaceDetails,"spaceDetails");
	}
	
	
	public VenueDetailsBean getVenueDetailBeanById(Integer venueId){
		VenueDetailsBean venueDetailsBean = new VenueDetailsBean();
		try{
			Query query = new Query();
			query.addCriteria(Criteria.where("venueid").is(String.valueOf(venueId)));
			venueDetailsBean = mongoTemplate.findOne(query, VenueDetailsBean.class);
		}catch(Exception e){
			
		}
		return venueDetailsBean;
	}
	
	public SpaceDetails getSpaceDetaailsByProductId(String productId){
		SpaceDetails spaceDetails = null;
		try{
			Query query = new Query();
			query.addCriteria(Criteria.where("isActive").is(true).and("productId").is(productId));
			spaceDetails = mongoTemplate.findOne(query, SpaceDetails.class);
		}catch(Exception e){
			
		}
		return spaceDetails;
	}
	
	
	public List<SpaceDetails> getSpaceByCity(String city){
		List<SpaceDetails> spaces = null;
		try{
			Query query = new Query();
			query.addCriteria(Criteria.where("isActive").is(true).and("city").is(city));
			spaces = mongoTemplate.find(query, SpaceDetails.class);
		}catch(Exception e){
			
		}
		return spaces;
	}
	
	public List<VenueDetailsBean> getVenueByCity(String city){
		List<VenueDetailsBean> venues = null;
		try{
			Query query = new Query();
			query.addCriteria(Criteria.where("city").is(city));
			venues = mongoTemplate.find(query, VenueDetailsBean.class);
		}catch(Exception e){
			
		}
		return venues;
	}
}
