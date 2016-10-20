package com.cosphere.model;

public class SpaceRatingBean {
	private String averageRating;
	private String sid;
	private String reviewCount;
	
	public String getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(String averageRating) {
		this.averageRating = averageRating;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getReviewCount() {
		return reviewCount;
	}
	public void setReviewCount(String reviewCount) {
		this.reviewCount = reviewCount;
	}
	@Override
	public String toString() {
		return "SpaceRatingBean [averageRating=" + averageRating + ", sid="
				+ sid + ", reviewCount=" + reviewCount + "]";
	}
	

}
