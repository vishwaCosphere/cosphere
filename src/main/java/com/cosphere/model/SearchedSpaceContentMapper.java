package com.cosphere.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;


public class SearchedSpaceContentMapper implements RowMapper<SearchedSpaceContentBeans>{
	private static Logger logger=Logger.getLogger(SearchedSpaceContentMapper.class);
	public SearchedSpaceContentBeans mapRow(ResultSet rs, int arg1) throws SQLException {
//		logger.info("SearchedSpaceContentMapper");
		SearchedSpaceContentBeans searchedSpaceContentBeans =new SearchedSpaceContentBeans();
		
		searchedSpaceContentBeans.setAdditional_pic(rs.getString("additional_pic"));
		searchedSpaceContentBeans.setArea(rs.getString("area"));
		searchedSpaceContentBeans.setSpace_id(rs.getString("space_id"));
		searchedSpaceContentBeans.setArea_tag(rs.getString("area_tag"));
		searchedSpaceContentBeans.setCapacity_desk(rs.getString("capacity_desk"));
		searchedSpaceContentBeans.setCapacity_meeting_room(rs.getString("capacity_meeting_room"));
		searchedSpaceContentBeans.setCapacity_room(rs.getString("capacity_room"));
		searchedSpaceContentBeans.setCity(rs.getString("city"));
		searchedSpaceContentBeans.setFreeamenities(rs.getString("freeamenities"));
		searchedSpaceContentBeans.setFri_clos_time(rs.getString("fri_clos_time"));
		searchedSpaceContentBeans.setFri_op_time(rs.getString("fri_op_time"));
		searchedSpaceContentBeans.setGmap_pin(rs.getString("gmap_pin"));
		searchedSpaceContentBeans.setIs_bmd_verified(rs.getString("is_bmd_verified"));
		searchedSpaceContentBeans.setLong_desc(rs.getString("long_desc"));
		searchedSpaceContentBeans.setMain_pic(rs.getString("main_pic"));
		searchedSpaceContentBeans.setMain_pic_ven(rs.getString("main_pic_ven"));
		searchedSpaceContentBeans.setMon_clos_time(rs.getString("mon_clos_time"));
		searchedSpaceContentBeans.setMon_op_time(rs.getString("mon_op_time"));
		searchedSpaceContentBeans.setNo_of_like(rs.getString("no_of_like"));
		searchedSpaceContentBeans.setNo_of_spaces(rs.getString("no_of_spaces"));
		searchedSpaceContentBeans.setOpen_day(rs.getString("open_day"));
		searchedSpaceContentBeans.setPaidamenities(rs.getString("paidamenities"));
		searchedSpaceContentBeans.setPer_day(rs.getString("per_day"));
		searchedSpaceContentBeans.setPer_half_day(rs.getString("per_half_day"));
		searchedSpaceContentBeans.setPer_month(rs.getString("per_month"));
		searchedSpaceContentBeans.setPincode(rs.getString("pincode"));
		searchedSpaceContentBeans.setSat_clos_time(rs.getString("sat_clos_time"));
		searchedSpaceContentBeans.setSat_op_time(rs.getString("sat_op_time"));
		searchedSpaceContentBeans.setShort_desc(rs.getString("short_desc"));
		searchedSpaceContentBeans.setSpace_type(rs.getString("space_type"));
		searchedSpaceContentBeans.setStreet_address1(rs.getString("street_address1"));
		searchedSpaceContentBeans.setStreet_address2(rs.getString("street_address2"));
		searchedSpaceContentBeans.setSun_clos_time(rs.getString("sun_clos_time"));
		searchedSpaceContentBeans.setSun_op_time(rs.getString("sun_op_time"));
		searchedSpaceContentBeans.setThur_op_time(rs.getString("thur_op_time"));
		searchedSpaceContentBeans.setThur_clos_time(rs.getString("thur_clos_time"));
		searchedSpaceContentBeans.setTues_op_time(rs.getString("tues_op_time"));
		searchedSpaceContentBeans.setVenue_category(rs.getString("venue_category"));
		searchedSpaceContentBeans.setTues_clos_time(rs.getString("tues_clos_time"));
		searchedSpaceContentBeans.setVenue_name(rs.getString("venue_name"));
		searchedSpaceContentBeans.setVenue_ratings(rs.getString("venue_ratings"));
		searchedSpaceContentBeans.setVenueaddImg(rs.getString("venueaddImg"));
		searchedSpaceContentBeans.setVenueid(rs.getString("venueid"));
		searchedSpaceContentBeans.setWed_clos_time(rs.getString("wed_clos_time"));
		searchedSpaceContentBeans.setWed_op_time(rs.getString("wed_op_time"));
		searchedSpaceContentBeans.setGmap_coordinates(rs.getString("gmap_coordinates"));
		searchedSpaceContentBeans.setSpace_plan_term(rs.getString("space_plan_term"));
		searchedSpaceContentBeans.setSpace_Highlight(rs.getString("space_highlight"));
		searchedSpaceContentBeans.setLandlord_first_name(rs.getString("landlord_first_name"));
		searchedSpaceContentBeans.setSpace_description(rs.getString("space_desc"));
		searchedSpaceContentBeans.setVenueImageAdditional(rs.getString("venueImageAdditional"));
		searchedSpaceContentBeans.setNo_of_persons(rs.getString("no_of_persons"));
		searchedSpaceContentBeans.setSpace_name(rs.getString("space_name"));
		searchedSpaceContentBeans.setSpace_tag1(rs.getString("space_tag1"));
		searchedSpaceContentBeans.setSpace_tag2(rs.getString("space_tag2"));
		searchedSpaceContentBeans.setSpace_tag3(rs.getString("space_tag3"));
		searchedSpaceContentBeans.setSpace_tag4(rs.getString("space_tag4"));
		searchedSpaceContentBeans.setMin_hours(rs.getString("min_hours"));
		searchedSpaceContentBeans.setMin_pax(rs.getString("min_pax"));
		searchedSpaceContentBeans.setFully_booked(rs.getString("fully_booked"));
		searchedSpaceContentBeans.setSpace_creation_date(rs.getString("created_date"));
		searchedSpaceContentBeans.setVenueCompanyName(rs.getString("venue_company_name"));
		searchedSpaceContentBeans.setLandlordLastName(rs.getString("landlord_last_name"));
		searchedSpaceContentBeans.setLandlordEmail(rs.getString("landlord_email"));
		searchedSpaceContentBeans.setLandlordMobile(rs.getString("landlord_mobile"));
		searchedSpaceContentBeans.setLandloardPanNumber(rs.getString("landloard_pan_number"));
		searchedSpaceContentBeans.setLandloardServiceTax(rs.getString("landloard_service_tax"));
		searchedSpaceContentBeans.setLandloardServiceTaxNumber(rs.getString("landloard_service_tax_number"));	
		searchedSpaceContentBeans.setThumbnailPic(rs.getString("thumbnail_pic"));
		return searchedSpaceContentBeans;
	}

	
}
