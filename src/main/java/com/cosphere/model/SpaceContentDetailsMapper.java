package com.cosphere.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;



public class SpaceContentDetailsMapper implements RowMapper{
	private static Logger logger=Logger.getLogger(SpaceContentDetailsMapper.class);
	public SpaceContentBeans mapRow(ResultSet rs, int rowNum) throws SQLException { 
		logger.info("SpaceContentDetailsMapper");
		SpaceContentBeans spaceContentBeans = new SpaceContentBeans(); 
		spaceContentBeans.setAdditional_pic(rs.getString("additional_pic"));
		spaceContentBeans.setMain_pic(rs.getString("main_pic"));
		spaceContentBeans.setNo_of_like(rs.getString("no_of_like"));
		spaceContentBeans.setPer_day(rs.getString("per_day"));
		spaceContentBeans.setPer_half_day(rs.getString("per_half_day"));
		spaceContentBeans.setPer_month(rs.getString("per_month"));
		spaceContentBeans.setSpace_area(rs.getString("space_area"));
		spaceContentBeans.setSpace_capacity(rs.getString("space_capacity"));
		spaceContentBeans.setSpace_desc(rs.getString("space_desc"));
		spaceContentBeans.setSpace_highlight(rs.getString("space_highlight"));
		spaceContentBeans.setSpace_plan_term(rs.getString("space_plan_term"));
		spaceContentBeans.setSpace_type(rs.getString("space_type"));
		spaceContentBeans.setVenueid(rs.getInt("venueid"));
		spaceContentBeans.setSpace_type(rs.getString("space_type"));
		spaceContentBeans.setSpace_id(rs.getInt("space_id"));
		
		spaceContentBeans.setInstant_booking(rs.getString("instant_booking"));
		spaceContentBeans.setFreeamenities(rs.getString("freeamenities"));
		spaceContentBeans.setPaidamenities(rs.getString("paidamenities"));
		spaceContentBeans.setStatus(rs.getString("status"));
		spaceContentBeans.setSpace_tag1(rs.getString("space_tag1"));
		spaceContentBeans.setSpace_tag2(rs.getString("space_tag2"));
		spaceContentBeans.setSpace_tag3(rs.getString("space_tag3"));
		spaceContentBeans.setSpace_tag4(rs.getString("space_tag4"));
		spaceContentBeans.setFully_booked(rs.getString("fully_booked"));
		spaceContentBeans.setShow_on_home(rs.getString("show_on_home")); 
		spaceContentBeans.setFree_pass(rs.getString("free_pass"));
		spaceContentBeans.setThumbnail_pic(rs.getString("thumbnail_pic"));
		spaceContentBeans.setHost_email(rs.getString("host_email"));
		
		return  spaceContentBeans;
}

}
