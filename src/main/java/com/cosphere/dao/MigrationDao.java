package com.cosphere.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cosphere.model.SearchedSpaceContentBeans;
import com.cosphere.model.SearchedSpaceContentMapper;
import com.cosphere.model.SpaceContentBeans;
import com.cosphere.model.SpaceContentDetailsMapper;
import com.cosphere.model.VenueDetailsBean;
import com.cosphere.model.VenueDetailsMapper;

@Repository
public class MigrationDao {

	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	
	
	
	public List<VenueDetailsBean> getVenueDetails(){

		String sql = "SELECT * FROM venue";

		jdbcTemplate = new JdbcTemplate(dataSource);

	//	List<VenueDetailsBean> list  = jdbcTemplate.query(sql,new BeanPropertyRowMapper(VenueDetailsMapper.class));
		List<VenueDetailsBean> list = (List<VenueDetailsBean>) jdbcTemplate.query(sql,new VenueDetailsMapper());


		return list;
	}
	
	
	
	public List<SearchedSpaceContentBeans> showSpace() {
		 final String SQL="select thumbnail_pic, venue_company_name,floor_suits,landloard_service_tax,landloard_service_tax_number,landloard_pan_number,landlord_last_name,landlord_email,landlord_mobile,s.fully_booked,date(s.created_date) as created_date,s.space_tag1,s.space_tag2,s.space_tag3,s.space_tag4,s.min_hours,s.min_pax,s.space_desc,s.space_highlight,concat(v.landlord_email,',',v.venue_mail) landlord_first_name, s.space_plan_term,v.venueid,pincode,space_type,venue_name,venue_category,s.space_name,area,city,v.area_tag,no_of_spaces,street_address1,street_address2 ,capacity_desk,capacity_room,capacity_meeting_room,short_desc,long_desc,mon_op_time, mon_clos_time,tues_op_time, tues_clos_time, wed_op_time, wed_clos_time, thur_op_time,thur_clos_time, fri_op_time, fri_clos_time, sat_op_time, sat_clos_time,sun_op_time, sun_clos_time, open_day,main_pic main_pic_ven,main_pic,freeamenities,paidamenities,gmap_coordinates,s.additional_pic ,s.additional_pic as venueaddImg,v.additional_pic as venueImageAdditional,no_of_persons,venue_ratings,gmap_pin,is_bmd_verified,no_of_like,per_half_day,per_day,per_month,s.space_id from venue v , space s where v.status='active' and s.status='active' and v.venueid=s.venueid and s.show_on_home='yes'";
		 jdbcTemplate = new JdbcTemplate(dataSource);
		 List<SearchedSpaceContentBeans> searchedSpaceContentBeans = null ;
			try {
				searchedSpaceContentBeans = (List<SearchedSpaceContentBeans>) jdbcTemplate.query(SQL,new SearchedSpaceContentMapper());
			 } catch (Exception e) {
				e.printStackTrace();
			}
		return searchedSpaceContentBeans;
	}
	
	
	
	@SuppressWarnings("unchecked")
	public List<SpaceContentBeans> getSpacedetails(){
		String SQL ="SELECT * FROM space";
		 jdbcTemplate = new JdbcTemplate(dataSource);
		 List<SpaceContentBeans>  spaceContentBeans = null ;
		 try {
			 spaceContentBeans = (List<SpaceContentBeans>) jdbcTemplate.query(SQL,new SpaceContentDetailsMapper());
			 } catch (Exception e) {
				e.printStackTrace();
			}
		 return spaceContentBeans;
	}
}
