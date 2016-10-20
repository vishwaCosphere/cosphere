package com.cosphere.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "venue")
public class VenueDetailsBean {

	@Id
	private String id;
	private String venueid;
	private String venue_name;
	private String venue_category;
	private String no_of_spaces;
	private String street_address1;
	private String street_address2;
	private String area;
	private String city;
	private String pincode;
	private String area_tag;
	private String total_area;
	private String capacity_desk;
	private String avail_capac_desk;
	private String capacity_room;
	private String avail_capac_room;
	private String capacity_meeting_room;
	private String aval_capac_meet_room;
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
	private String main_pic_ven;
	private String additional_pic;
	private String gmap_coordinates;
	private String gmap_pin;
	private String venue_ratings;
	private String status;
	private String freeamenities;
	private String paidamenities;
	private String is_bmd_verified;
	private String main_pic;
	private String no_of_like;
	private String space_id;
	private String space_type;
	private String space_main_pic;
	private String per_half_day;
	private String per_day;
	private String per_month;
    private String space_plan_term;
    private String createdDate;
    private SpaceRatingBean spaceRating;
    private VenueIdListBean venueDistance;
    private String thumbnailPic;
	
	public VenueIdListBean getVenueDistance() {
		return venueDistance;
	}

	public void setVenueDistance(VenueIdListBean venueDistance) {
		this.venueDistance = venueDistance;
	}
	
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public SpaceRatingBean getSpaceRating() {
		return spaceRating;
	}
	public void setSpaceRating(SpaceRatingBean spaceRating) {
		this.spaceRating = spaceRating;
	}
	public String getSpace_main_pic() {
		return space_main_pic;
	}
	public void setSpace_main_pic(String space_main_pic) {
		this.space_main_pic = space_main_pic;
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getArea_tag() {
		return area_tag;
	}
	public void setArea_tag(String area_tag) {
		this.area_tag = area_tag;
	}
	public String getTotal_area() {
		return total_area;
	}
	public void setTotal_area(String total_area) {
		this.total_area = total_area;
	}
	public String getCapacity_desk() {
		return capacity_desk;
	}
	public void setCapacity_desk(String capacity_desk) {
		this.capacity_desk = capacity_desk;
	}
	public String getAvail_capac_desk() {
		return avail_capac_desk;
	}
	public void setAvail_capac_desk(String avail_capac_desk) {
		this.avail_capac_desk = avail_capac_desk;
	}
	public String getCapacity_room() {
		return capacity_room;
	}
	public void setCapacity_room(String capacity_room) {
		this.capacity_room = capacity_room;
	}
	public String getAvail_capac_room() {
		return avail_capac_room;
	}
	public void setAvail_capac_room(String avail_capac_room) {
		this.avail_capac_room = avail_capac_room;
	}
	public String getCapacity_meeting_room() {
		return capacity_meeting_room;
	}
	public void setCapacity_meeting_room(String capacity_meeting_room) {
		this.capacity_meeting_room = capacity_meeting_room;
	}
	public String getAval_capac_meet_room() {
		return aval_capac_meet_room;
	}
	public void setAval_capac_meet_room(String aval_capac_meet_room) {
		this.aval_capac_meet_room = aval_capac_meet_room;
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
	public String getMain_pic_ven() {
		return main_pic_ven;
	}
	public void setMain_pic_ven(String main_pic_ven) {
		this.main_pic_ven = main_pic_ven;
	}
	public String getAdditional_pic() {
		return additional_pic;
	}
	public void setAdditional_pic(String additional_pic) {
		this.additional_pic = additional_pic;
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
	public String getVenue_ratings() {
		return venue_ratings;
	}
	public void setVenue_ratings(String venue_ratings) {
		this.venue_ratings = venue_ratings;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public String getSpace_type() {
		return space_type;
	}
	public void setSpace_type(String space_type) {
		this.space_type = space_type;
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
	
	public String getSpace_plan_term() {
		return space_plan_term;
	}
	public void setSpace_plan_term(String space_plan_term) {
		this.space_plan_term = space_plan_term;
	}
	
	public String getThumbnailPic() {
		return thumbnailPic;
	}

	public void setThumbnailPic(String thumbnailPic) {
		this.thumbnailPic = thumbnailPic;
	}
	
	@Override
	public String toString() {
		return "VenueDetailsBean [venueid=" + venueid + ", venue_name="
				+ venue_name + ", venue_category=" + venue_category
				+ ", no_of_spaces=" + no_of_spaces + ", street_address1="
				+ street_address1 + ", street_address2=" + street_address2
				+ ", area=" + area + ", city=" + city + ", pincode=" + pincode
				+ ", area_tag=" + area_tag + ", total_area=" + total_area
				+ ", capacity_desk=" + capacity_desk + ", avail_capac_desk="
				+ avail_capac_desk + ", capacity_room=" + capacity_room
				+ ", avail_capac_room=" + avail_capac_room
				+ ", capacity_meeting_room=" + capacity_meeting_room
				+ ", aval_capac_meet_room=" + aval_capac_meet_room
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
				+ sun_clos_time + ", open_day=" + open_day + ", main_pic_ven="
				+ main_pic_ven + ", additional_pic=" + additional_pic
				+ ", gmap_coordinates=" + gmap_coordinates + ", gmap_pin="
				+ gmap_pin + ", venue_ratings=" + venue_ratings + ", status="
				+ status + ", freeamenities=" + freeamenities
				+ ", paidamenities=" + paidamenities + ", is_bmd_verified="
				+ is_bmd_verified + ", main_pic=" + main_pic + ", no_of_like="
				+ no_of_like + ", space_id=" + space_id + ", space_type="
				+ space_type + ", space_main_pic=" + space_main_pic
				+ ", per_half_day=" + per_half_day + ", per_day=" + per_day
				+ ", per_month=" + per_month + ", space_plan_term="
				+ space_plan_term + ", createdDate=" + createdDate
				+ ", spaceRating=" + spaceRating + ", venueDistance="
				+ venueDistance + ", thumbnailPic=" + thumbnailPic + "]";
	}

	
	

}
