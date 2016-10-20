package com.cosphere.beans;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "spaceDetails")
public class SpaceDetails {

	@Id
	private String id;
	
	private int recordId;
	private int spaceId;
	private int venueId;
	private String productId;
	private String spaceType;
	private List<String> pics;
	private String mainPic;
	private String noOfLike;
	private String perDay;
	private String perHalfDay;
	private String perMonth;
	private String space_area;
	private String space_capacity;
	private String space_desc;
	private String spaceHighlight;
	private boolean isActive;
	private String addedBy;
	private Date createdDate;
	
	private String instantBooking;
	private List<String> freeamenities;
	private List<String> paidamenities;
	private String spaceTag1;
	private String spaceTag2;
	private String spaceTag3;
	private String spaceTag4;
	private String fullyBooked;
	private String showOnHome;
	private String freePass;
	private String thumbnailPic;
	private String hostEmail;
	
	private String city;
	
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getAddedBy() {
		return addedBy;
	}
	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getRecordId() {
		return recordId;
	}
	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}
	public int getSpaceId() {
		return spaceId;
	}
	public void setSpaceId(int spaceId) {
		this.spaceId = spaceId;
	}
	public int getVenueId() {
		return venueId;
	}
	public void setVenueId(int venueId) {
		this.venueId = venueId;
	}
	public String getSpaceType() {
		return spaceType;
	}
	public void setSpaceType(String spaceType) {
		this.spaceType = spaceType;
	}
	public String getMainPic() {
		return mainPic;
	}
	public void setMainPic(String mainPic) {
		this.mainPic = mainPic;
	}
	public String getNoOfLike() {
		return noOfLike;
	}
	public void setNoOfLike(String noOfLike) {
		this.noOfLike = noOfLike;
	}
	public String getPerDay() {
		return perDay;
	}
	public void setPerDay(String perDay) {
		this.perDay = perDay;
	}
	public String getPerHalfDay() {
		return perHalfDay;
	}
	public void setPerHalfDay(String perHalfDay) {
		this.perHalfDay = perHalfDay;
	}
	public String getPerMonth() {
		return perMonth;
	}
	public void setPerMonth(String perMonth) {
		this.perMonth = perMonth;
	}
	public String getSpace_area() {
		return space_area;
	}
	public void setSpace_area(String space_area) {
		this.space_area = space_area;
	}
	public String getSpace_capacity() {
		return space_capacity;
	}
	public void setSpace_capacity(String space_capacity) {
		this.space_capacity = space_capacity;
	}
	public String getSpace_desc() {
		return space_desc;
	}
	public void setSpace_desc(String space_desc) {
		this.space_desc = space_desc;
	}
	public String getSpaceHighlight() {
		return spaceHighlight;
	}
	public void setSpaceHighlight(String spaceHighlight) {
		this.spaceHighlight = spaceHighlight;
	}
	public String getSpacePlanTerm() {
		return spacePlanTerm;
	}
	public void setSpacePlanTerm(String spacePlanTerm) {
		this.spacePlanTerm = spacePlanTerm;
	}
	private String spacePlanTerm;


	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public List<String> getPics() {
		return pics;
	}
	public void setPics(List<String> pics) {
		this.pics = pics;
	}
	public String getInstantBooking() {
		return instantBooking;
	}
	public void setInstantBooking(String instantBooking) {
		this.instantBooking = instantBooking;
	}
	public List<String> getFreeamenities() {
		return freeamenities;
	}
	public void setFreeamenities(List<String> freeamenities) {
		this.freeamenities = freeamenities;
	}
	public List<String> getPaidamenities() {
		return paidamenities;
	}
	public void setPaidamenities(List<String> paidamenities) {
		this.paidamenities = paidamenities;
	}
	public String getSpaceTag1() {
		return spaceTag1;
	}
	public void setSpaceTag1(String spaceTag1) {
		this.spaceTag1 = spaceTag1;
	}
	public String getSpaceTag2() {
		return spaceTag2;
	}
	public void setSpaceTag2(String spaceTag2) {
		this.spaceTag2 = spaceTag2;
	}
	public String getSpaceTag3() {
		return spaceTag3;
	}
	public void setSpaceTag3(String spaceTag3) {
		this.spaceTag3 = spaceTag3;
	}
	public String getSpaceTag4() {
		return spaceTag4;
	}
	public void setSpaceTag4(String spaceTag4) {
		this.spaceTag4 = spaceTag4;
	}
	public String getFullyBooked() {
		return fullyBooked;
	}
	public void setFullyBooked(String fullyBooked) {
		this.fullyBooked = fullyBooked;
	}
	public String getShowOnHome() {
		return showOnHome;
	}
	public void setShowOnHome(String showOnHome) {
		this.showOnHome = showOnHome;
	}
	public String getFreePass() {
		return freePass;
	}
	public void setFreePass(String freePass) {
		this.freePass = freePass;
	}
	public String getThumbnailPic() {
		return thumbnailPic;
	}
	public void setThumbnailPic(String thumbnailPic) {
		this.thumbnailPic = thumbnailPic;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHostEmail() {
		return hostEmail;
	}
	public void setHostEmail(String hostEmail) {
		this.hostEmail = hostEmail;
	}
	
}
