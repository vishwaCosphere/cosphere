package com.cosphere.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "spaceSearch")
public class SearchedSpaceContentBeans {
	
	@Id
	private String id;
	private String venueid;
	private String space_id;
	private String venue_name;
	private String venue_category;
	private String space_type;
	private String pincode;
	private String area;
	private String city;
	private String area_tag;
	private String no_of_spaces;
	private String street_address1;
	private String street_address2;
	private String capacity_desk;
	private String capacity_room;
	private String capacity_meeting_room;
	private String short_desc;
	private String long_desc;
	private String mon_op_time;
	private String mon_clos_time;
	private String tues_op_time;
	private String tues_clos_time;
	private String wed_op_time;
	private String wed_clos_time;
	private String thur_op_time;
	private String thur_clos_time;
	private String fri_op_time;
	private String fri_clos_time;
	private String sat_op_time;
	private String sat_clos_time;
	private String sun_op_time;
	private String sun_clos_time;
	private String open_day;
	private String additional_pic;
	private String venueaddImg;
	private String gmap_coordinates;
	private String gmap_pin;
	private String main_pic;
	private String no_of_like;
	private String per_half_day;
	private String per_day;
	private String per_month;
	private String freeamenities;
	private String paidamenities;
	private String main_pic_ven;
	private String venue_ratings;
	private String is_bmd_verified;
	private String space_plan_term;
	private String space_Highlight;
	private String landlord_first_name;
	private String space_description;
	private String venueImageAdditional;
	private String no_of_persons;
	private String space_name;
	private String min_hours;
	private String min_pax;
	private String space_tag1;
	private String space_tag2;
	private String space_tag3;
	private String space_tag4;
	private String fully_booked;
	private String space_creation_date;
	private String venueCompanyName;
	private String floorSuits;
	private String landlordLastName;
	private String landlordEmail;
	private String landlordMobile;
	private String landloardPanNumber;
	private String landloardServiceTaxNumber;
	private String landloardServiceTax;
	private String thumbnailPic;
	

	public String getSpace_description() {
		return space_description;
	}

	public void setSpace_description(String space_description) {
		this.space_description = space_description;
	}

	public String getLandlord_first_name() {
		return landlord_first_name;
	}

	public void setLandlord_first_name(String landlord_first_name) {
		this.landlord_first_name = landlord_first_name;
	}

	public String getSpace_Highlight() {
		return space_Highlight;
	}

	public void setSpace_Highlight(String space_Highlight) {
		this.space_Highlight = space_Highlight;
	}

	public String getSpace_plan_term() {
		return space_plan_term;
	}

	public void setSpace_plan_term(String space_plan_term) {
		this.space_plan_term = space_plan_term;
	}

	public String getVenueid() {
		return venueid;
	}

	public void setVenueid(String venueid) {
		this.venueid = venueid;
	}

	public String getVenue_name() {
		return venue_name;
	}

	public void setVenue_name(String venue_name) {
		this.venue_name = venue_name;
	}

	public String getVenue_category() {
		return venue_category;
	}

	public void setVenue_category(String venue_category) {
		this.venue_category = venue_category;
	}

	public String getSpace_type() {
		return space_type;
	}

	public void setSpace_type(String space_type) {
		this.space_type = space_type;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea_tag() {
		return area_tag;
	}

	public void setArea_tag(String area_tag) {
		this.area_tag = area_tag;
	}

	public String getNo_of_spaces() {
		return no_of_spaces;
	}

	public void setNo_of_spaces(String no_of_spaces) {
		this.no_of_spaces = no_of_spaces;
	}

	public String getStreet_address1() {
		return street_address1;
	}

	public void setStreet_address1(String street_address1) {
		this.street_address1 = street_address1;
	}

	public String getStreet_address2() {
		return street_address2;
	}

	public void setStreet_address2(String street_address2) {
		this.street_address2 = street_address2;
	}

	public String getCapacity_desk() {
		return capacity_desk;
	}

	public void setCapacity_desk(String capacity_desk) {
		this.capacity_desk = capacity_desk;
	}

	public String getCapacity_room() {
		return capacity_room;
	}

	public void setCapacity_room(String capacity_room) {
		this.capacity_room = capacity_room;
	}

	public String getCapacity_meeting_room() {
		return capacity_meeting_room;
	}

	public void setCapacity_meeting_room(String capacity_meeting_room) {
		this.capacity_meeting_room = capacity_meeting_room;
	}

	public String getShort_desc() {
		return short_desc;
	}

	public void setShort_desc(String short_desc) {
		this.short_desc = short_desc;
	}

	public String getLong_desc() {
		return long_desc;
	}

	public void setLong_desc(String long_desc) {
		this.long_desc = long_desc;
	}

	public String getMon_op_time() {
		return mon_op_time;
	}

	public void setMon_op_time(String mon_op_time) {
		this.mon_op_time = mon_op_time;
	}

	public String getMon_clos_time() {
		return mon_clos_time;
	}

	public void setMon_clos_time(String mon_clos_time) {
		this.mon_clos_time = mon_clos_time;
	}

	public String getTues_op_time() {
		return tues_op_time;
	}

	public void setTues_op_time(String tues_op_time) {
		this.tues_op_time = tues_op_time;
	}

	public String getTues_clos_time() {
		return tues_clos_time;
	}

	public void setTues_clos_time(String tues_clos_time) {
		this.tues_clos_time = tues_clos_time;
	}

	public String getWed_op_time() {
		return wed_op_time;
	}

	public void setWed_op_time(String wed_op_time) {
		this.wed_op_time = wed_op_time;
	}

	public String getWed_clos_time() {
		return wed_clos_time;
	}

	public void setWed_clos_time(String wed_clos_time) {
		this.wed_clos_time = wed_clos_time;
	}

	public String getThur_op_time() {
		return thur_op_time;
	}

	public void setThur_op_time(String thur_op_time) {
		this.thur_op_time = thur_op_time;
	}

	public String getThur_clos_time() {
		return thur_clos_time;
	}

	public void setThur_clos_time(String thur_clos_time) {
		this.thur_clos_time = thur_clos_time;
	}

	public String getFri_op_time() {
		return fri_op_time;
	}

	public void setFri_op_time(String fri_op_time) {
		this.fri_op_time = fri_op_time;
	}

	public String getFri_clos_time() {
		return fri_clos_time;
	}

	public void setFri_clos_time(String fri_clos_time) {
		this.fri_clos_time = fri_clos_time;
	}

	public String getSat_op_time() {
		return sat_op_time;
	}

	public void setSat_op_time(String sat_op_time) {
		this.sat_op_time = sat_op_time;
	}

	public String getSat_clos_time() {
		return sat_clos_time;
	}

	public void setSat_clos_time(String sat_clos_time) {
		this.sat_clos_time = sat_clos_time;
	}

	public String getSun_op_time() {
		return sun_op_time;
	}

	public void setSun_op_time(String sun_op_time) {
		this.sun_op_time = sun_op_time;
	}

	public String getSun_clos_time() {
		return sun_clos_time;
	}

	public void setSun_clos_time(String sun_clos_time) {
		this.sun_clos_time = sun_clos_time;
	}

	public String getOpen_day() {
		return open_day;
	}

	public void setOpen_day(String open_day) {
		this.open_day = open_day;
	}

	public String getAdditional_pic() {
		return additional_pic;
	}

	public void setAdditional_pic(String additional_pic) {
		this.additional_pic = additional_pic;
	}

	public String getVenueaddImg() {
		return venueaddImg;
	}

	public void setVenueaddImg(String venueaddImg) {
		this.venueaddImg = venueaddImg;
	}

	public String getGmap_coordinates() {
		return gmap_coordinates;
	}

	public void setGmap_coordinates(String gmap_coordinates) {
		this.gmap_coordinates = gmap_coordinates;
	}

	public String getGmap_pin() {
		return gmap_pin;
	}

	public void setGmap_pin(String gmap_pin) {
		this.gmap_pin = gmap_pin;
	}

	public String getMain_pic() {
		return main_pic;
	}

	public void setMain_pic(String main_pic) {
		this.main_pic = main_pic;
	}

	public String getNo_of_like() {
		return no_of_like;
	}

	public void setNo_of_like(String no_of_like) {
		this.no_of_like = no_of_like;
	}

	public String getPer_half_day() {
		return per_half_day;
	}

	public void setPer_half_day(String per_half_day) {
		this.per_half_day = per_half_day;
	}

	public String getPer_day() {
		return per_day;
	}

	public void setPer_day(String per_day) {
		this.per_day = per_day;
	}

	public String getPer_month() {
		return per_month;
	}

	public void setPer_month(String per_month) {
		this.per_month = per_month;
	}

	public String getFreeamenities() {
		return freeamenities;
	}

	public void setFreeamenities(String freeamenities) {
		this.freeamenities = freeamenities;
	}

	public String getPaidamenities() {
		return paidamenities;
	}

	public void setPaidamenities(String paidamenities) {
		this.paidamenities = paidamenities;
	}

	public String getMain_pic_ven() {
		return main_pic_ven;
	}

	public void setMain_pic_ven(String main_pic_ven) {
		this.main_pic_ven = main_pic_ven;
	}

	public String getVenue_ratings() {
		return venue_ratings;
	}

	public void setVenue_ratings(String venue_ratings) {
		this.venue_ratings = venue_ratings;
	}

	public String getIs_bmd_verified() {
		return is_bmd_verified;
	}

	public void setIs_bmd_verified(String is_bmd_verified) {
		this.is_bmd_verified = is_bmd_verified;
	}

	public String getSpace_id() {
		return space_id;
	}

	public void setSpace_id(String space_id) {
		this.space_id = space_id;
	}

	public String getVenueImageAdditional() {
		return venueImageAdditional;
	}

	public void setVenueImageAdditional(String venueImageAdditional) {
		this.venueImageAdditional = venueImageAdditional;
	}

	public String getNo_of_persons() {
		return no_of_persons;
	}

	public void setNo_of_persons(String no_of_persons) {
		this.no_of_persons = no_of_persons;
	}
	
	public String getSpace_name() {
		return space_name;
	}

	public void setSpace_name(String space_name) {
		this.space_name = space_name;
	}

	

	public String getMin_hours() {
		return min_hours;
	}

	public void setMin_hours(String min_hours) {
		this.min_hours = min_hours;
	}

	public String getMin_pax() {
		return min_pax;
	}

	public void setMin_pax(String min_pax) {
		this.min_pax = min_pax;
	}

	public String getSpace_tag1() {
		return space_tag1;
	}

	public void setSpace_tag1(String space_tag1) {
		this.space_tag1 = space_tag1;
	}

	public String getSpace_tag2() {
		return space_tag2;
	}

	public void setSpace_tag2(String space_tag2) {
		this.space_tag2 = space_tag2;
	}

	public String getSpace_tag3() {
		return space_tag3;
	}

	public void setSpace_tag3(String space_tag3) {
		this.space_tag3 = space_tag3;
	}

	public String getSpace_tag4() {
		return space_tag4;
	}

	public void setSpace_tag4(String space_tag4) {
		this.space_tag4 = space_tag4;
	}
	public String getFully_booked() {
		return fully_booked;
	}

	public void setFully_booked(String fully_booked) {
		this.fully_booked = fully_booked;
	}

	public String getSpace_creation_date() {
		return space_creation_date;
	}

	public void setSpace_creation_date(String space_creation_date) {
		this.space_creation_date = space_creation_date;
	}

	public String getVenueCompanyName() {
		return venueCompanyName;
	}

	public void setVenueCompanyName(String venueCompanyName) {
		this.venueCompanyName = venueCompanyName;
	}

	public String getFloorSuits() {
		return floorSuits;
	}

	public void setFloorSuits(String floorSuits) {
		this.floorSuits = floorSuits;
	}

	public String getLandlordLastName() {
		return landlordLastName;
	}

	public void setLandlordLastName(String landlordLastName) {
		this.landlordLastName = landlordLastName;
	}

	public String getLandlordEmail() {
		return landlordEmail;
	}

	public void setLandlordEmail(String landlordEmail) {
		this.landlordEmail = landlordEmail;
	}

	public String getLandlordMobile() {
		return landlordMobile;
	}

	public void setLandlordMobile(String landlordMobile) {
		this.landlordMobile = landlordMobile;
	}

	public String getLandloardPanNumber() {
		return landloardPanNumber;
	}

	public void setLandloardPanNumber(String landloardPanNumber) {
		this.landloardPanNumber = landloardPanNumber;
	}

	public String getLandloardServiceTaxNumber() {
		return landloardServiceTaxNumber;
	}

	public void setLandloardServiceTaxNumber(String landloardServiceTaxNumber) {
		this.landloardServiceTaxNumber = landloardServiceTaxNumber;
	}

	public String getLandloardServiceTax() {
		return landloardServiceTax;
	}

	public void setLandloardServiceTax(String landloardServiceTax) {
		this.landloardServiceTax = landloardServiceTax;
	}

	
	
	public String getThumbnailPic() {
		return thumbnailPic;
	}

	public void setThumbnailPic(String thumbnailPic) {
		this.thumbnailPic = thumbnailPic;
	}

	@Override
	public String toString() {
		return "SearchedSpaceContentBeans [venueid=" + venueid + ", space_id="
				+ space_id + ", venue_name=" + venue_name + ", venue_category="
				+ venue_category + ", space_type=" + space_type + ", pincode="
				+ pincode + ", area=" + area + ", city=" + city + ", area_tag="
				+ area_tag + ", no_of_spaces=" + no_of_spaces
				+ ", street_address1=" + street_address1 + ", street_address2="
				+ street_address2 + ", capacity_desk=" + capacity_desk
				+ ", capacity_room=" + capacity_room
				+ ", capacity_meeting_room=" + capacity_meeting_room
				+ ", short_desc=" + short_desc + ", long_desc=" + long_desc
				+ ", mon_op_time=" + mon_op_time + ", mon_clos_time="
				+ mon_clos_time + ", tues_op_time=" + tues_op_time
				+ ", tues_clos_time=" + tues_clos_time + ", wed_op_time="
				+ wed_op_time + ", wed_clos_time=" + wed_clos_time
				+ ", thur_op_time=" + thur_op_time + ", thur_clos_time="
				+ thur_clos_time + ", fri_op_time=" + fri_op_time
				+ ", fri_clos_time=" + fri_clos_time + ", sat_op_time="
				+ sat_op_time + ", sat_clos_time=" + sat_clos_time
				+ ", sun_op_time=" + sun_op_time + ", sun_clos_time="
				+ sun_clos_time + ", open_day=" + open_day
				+ ", additional_pic=" + additional_pic + ", venueaddImg="
				+ venueaddImg + ", gmap_coordinates=" + gmap_coordinates
				+ ", gmap_pin=" + gmap_pin + ", main_pic=" + main_pic
				+ ", no_of_like=" + no_of_like + ", per_half_day="
				+ per_half_day + ", per_day=" + per_day + ", per_month="
				+ per_month + ", freeamenities=" + freeamenities
				+ ", paidamenities=" + paidamenities + ", main_pic_ven="
				+ main_pic_ven + ", venue_ratings=" + venue_ratings
				+ ", is_bmd_verified=" + is_bmd_verified + ", space_plan_term="
				+ space_plan_term + ", space_Highlight=" + space_Highlight
				+ ", landlord_first_name=" + landlord_first_name
				+ ", space_description=" + space_description
				+ ", venueImageAdditional=" + venueImageAdditional
				+ ", no_of_persons=" + no_of_persons + ", space_name="
				+ space_name + ", min_hours=" + min_hours + ", min_pax="
				+ min_pax + ", space_tag1=" + space_tag1 + ", space_tag2="
				+ space_tag2 + ", space_tag3=" + space_tag3 + ", space_tag4="
				+ space_tag4 + ", fully_booked=" + fully_booked
				+ ", space_creation_date=" + space_creation_date
				+ ", venueCompanyName=" + venueCompanyName + ", floorSuits="
				+ floorSuits + ", landlordLastName=" + landlordLastName
				+ ", landlordEmail=" + landlordEmail + ", landlordMobile="
				+ landlordMobile + ", landloardPanNumber=" + landloardPanNumber
				+ ", landloardServiceTaxNumber=" + landloardServiceTaxNumber
				+ ", landloardServiceTax=" + landloardServiceTax
				+ ", thumbnailPic=" + thumbnailPic + "]";
	}

	
		
}
