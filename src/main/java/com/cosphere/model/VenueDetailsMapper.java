package com.cosphere.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;


public class VenueDetailsMapper implements RowMapper<VenueDetailsBean>{
	private static Logger logger=Logger.getLogger(VenueDetailsMapper.class);
	
	public VenueDetailsBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		logger.info("VenuedetailsMapper");
		VenueDetailsBean venueDetailsBean =new VenueDetailsBean();
		venueDetailsBean.setAdditional_pic(rs.getString("additional_pic"));
		venueDetailsBean.setArea(rs.getString("area"));
		venueDetailsBean.setArea_tag(rs.getString("area_tag"));
		venueDetailsBean.setAdditional_pic(rs.getString("additional_pic"));
		venueDetailsBean.setArea(rs.getString("area"));
		//venueDetailsBean.setSpace_id(rs.getString("space_id"));
		venueDetailsBean.setArea_tag(rs.getString("area_tag"));
		venueDetailsBean.setCapacity_desk(rs.getString("capacity_desk"));
		venueDetailsBean.setCapacity_meeting_room(rs.getString("capacity_meeting_room"));
		venueDetailsBean.setCapacity_room(rs.getString("capacity_room"));
		venueDetailsBean.setCity(rs.getString("city"));
		//venueDetailsBean.setFreeamenities(rs.getString("freeamenities"));
		venueDetailsBean.setFri_clos_time(rs.getString("fri_clos_time"));
		venueDetailsBean.setFri_op_time(rs.getString("fri_op_time"));
		venueDetailsBean.setGmap_pin(rs.getString("gmap_pin"));
		venueDetailsBean.setIs_bmd_verified(rs.getString("is_bmd_verified"));
		venueDetailsBean.setLong_desc(rs.getString("long_desc"));
		venueDetailsBean.setMain_pic(rs.getString("main_pic_ven"));
		venueDetailsBean.setMon_clos_time(rs.getString("mon_clos_time"));
		venueDetailsBean.setMon_op_time(rs.getString("mon_op_time"));
		//venueDetailsBean.setNo_of_like(rs.getString("no_of_like"));
		venueDetailsBean.setNo_of_spaces(rs.getString("no_of_spaces"));
		venueDetailsBean.setOpen_day(rs.getString("open_day"));
		//venueDetailsBean.setPaidamenities(rs.getString("paidamenities"));
		venueDetailsBean.setPincode(rs.getString("pincode"));
		venueDetailsBean.setSat_clos_time(rs.getString("sat_clos_time"));
		venueDetailsBean.setSat_op_time(rs.getString("sat_op_time"));
		venueDetailsBean.setShort_desc(rs.getString("short_desc"));
	//	venueDetailsBean.setSpace_type(rs.getString("space_type"));
		venueDetailsBean.setStreet_address1(rs.getString("street_address1"));
		venueDetailsBean.setStreet_address2(rs.getString("street_address2"));
		venueDetailsBean.setSun_clos_time(rs.getString("sun_clos_time"));
		venueDetailsBean.setSun_op_time(rs.getString("sun_op_time"));
		venueDetailsBean.setThur_clos_time(rs.getString("thur_clos_time"));
		venueDetailsBean.setTues_op_time(rs.getString("tues_op_time"));
		venueDetailsBean.setVenue_category(rs.getString("venue_category"));
		venueDetailsBean.setTues_op_time(rs.getString("tues_op_time"));
		venueDetailsBean.setTues_clos_time(rs.getString("tues_op_time"));
		venueDetailsBean.setVenue_name(rs.getString("venue_name"));
		venueDetailsBean.setVenue_ratings(rs.getString("venue_ratings"));
		venueDetailsBean.setVenueid(rs.getString("venueid"));
		venueDetailsBean.setWed_clos_time(rs.getString("wed_clos_time"));
		venueDetailsBean.setWed_op_time(rs.getString("wed_op_time"));
		venueDetailsBean.setGmap_coordinates(rs.getString("gmap_coordinates"));
		//venueDetailsBean.setSpace_main_pic(rs.getString("main_pic"));
		//venueDetailsBean.setPer_day(rs.getString("per_day"));
		//venueDetailsBean.setPer_half_day(rs.getString("per_half_day"));
		//venueDetailsBean.setPer_month(rs.getString("per_month"));
		//venueDetailsBean.setSpace_plan_term(rs.getString("space_plan_term"));
		//venueDetailsBean.setCreatedDate(rs.getString("created_date"));
		//venueDetailsBean.setThumbnailPic(rs.getString("thumbnail_pic"));
		return venueDetailsBean;
	}

	

}

