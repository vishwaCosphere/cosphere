package com.cosphere.dao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.cosphere.beans.City;
import com.cosphere.beans.OtpCode;
import com.cosphere.beans.SpaceType;
import com.cosphere.model.SearchedSpaceContentBeans;
import com.cosphere.model.VenueDetailsBean;


@Repository
public class CommonDao {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	
	public void saveOtp(String mobileNo,int code){
		OtpCode otpCode = new OtpCode();
		otpCode.setMobileNo(mobileNo);
		otpCode.setCode(String.valueOf(code));
		otpCode.setActive(true);
		otpCode.setCreatedDate(new Date());
		mongoTemplate.save(otpCode, "otpCode");
	}
	
	public List<City> getActiveCity(){
		Query query = new Query();
		query.addCriteria(Criteria.where("isActive").is(true));
		return mongoTemplate.find(query, City.class);
	}
	
	public List<SpaceType> getSpaceType(){
		Query query = new Query();
		query.addCriteria(Criteria.where("isActive").is(true));
		return mongoTemplate.find(query, SpaceType.class);
	}
	
	public List<SearchedSpaceContentBeans> getHomePageVenues(){
		return mongoTemplate.findAll( SearchedSpaceContentBeans.class);
	}
	
	public List<VenueDetailsBean> getAllVenues(){
		return mongoTemplate.findAll(VenueDetailsBean.class);
	}
}
