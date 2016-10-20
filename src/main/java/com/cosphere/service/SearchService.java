package com.cosphere.service;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cosphere.beans.SpaceDetails;
import com.cosphere.beans.VenueType;
import com.cosphere.dao.CommonDao;
import com.cosphere.dao.MigrationDao;
import com.cosphere.dao.SearchDao;
import com.cosphere.model.SearchedSpaceContentBeans;
import com.cosphere.model.SpaceContentBeans;
import com.cosphere.model.UserDetails;
import com.cosphere.model.VenueDetailsBean;
import com.cosphere.request.OtpRequest;
import com.cosphere.request.SearchRequest;
import com.cosphere.response.SearchResponse;
import com.cosphere.response.SpaceDetailResponse;

@Service
public class SearchService {

	@Autowired
	private SearchDao searchDao;
	
	@Autowired
	private MigrationDao migrationDao;
	
	@Autowired
	private CommonDao commonDao;
	
	
	
	public void sendOtp(OtpRequest otpRequest){
		
		
		
	}

	public SearchResponse search(SearchRequest searchRequest){
		SearchResponse searchResponse = new SearchResponse();
		if(searchRequest.getCity()!=null){
			List<SpaceDetails> spaces = searchDao.getSpaceByCity(searchRequest.getCity());
			searchResponse.setSpaces(spaces);
			List<VenueDetailsBean> venues = searchDao.getVenueByCity(searchRequest.getCity());
			if(venues !=null){
				Map<Integer, VenueDetailsBean>  venueMap = new HashMap<Integer,VenueDetailsBean>();
				for(VenueDetailsBean venue : venues){
					venueMap.put(Integer.valueOf(venue.getVenueid()), venue);
				}
				searchResponse.setVenueMap(venueMap);
			}
		}
		return searchResponse;
	}
	
	
	public SpaceDetailResponse getSpaceDetailByProductId(String productId){
		SpaceDetailResponse spaceDetailResponse = new SpaceDetailResponse();
		SpaceDetails spaceDetail = searchDao.getSpaceDetaailsByProductId(productId);
		if(spaceDetail!=null){
			VenueDetailsBean venuedetail = searchDao.getVenueDetailBeanById(spaceDetail.getVenueId());
			spaceDetailResponse.setVenueDetailsBean(venuedetail);
			spaceDetailResponse.setSpaceDetails(spaceDetail);
		}
		return spaceDetailResponse;
	}
	
	
	
	public void saveUserDetails(UserDetails userDetails){
		searchDao.saveUserDetails(userDetails);
	}
	
	
	public void migrateCity(){
		VenueType spaceType = new VenueType();
		spaceType.setRecordId(1);
		spaceType.setVenueType("Hot Desk");
		spaceType.setActive(true);
		searchDao.saveCity(spaceType );
	}
	public void migration(){
		List<SpaceContentBeans> list = migrationDao.getSpacedetails();
		System.out.println("space detail list size"+list.size());
		//saveSpaceDetails(list);
	}
	
	private void saveSpaceDetails(List<SpaceContentBeans> list){
		List<VenueDetailsBean> venues = commonDao.getAllVenues();
		Map<String,String> venueCityMap = new HashMap<String,String>();
		for(VenueDetailsBean venue : venues){
			venueCityMap.put(venue.getVenueid(), venue.getCity());
		}
		int count =1;
		int productId =100001;
		for(SpaceContentBeans spaceContentBean : list){
			SpaceDetails spaceDetail = new SpaceDetails();
			String addPics = spaceContentBean.getAdditional_pic();
			
			if(addPics!=null && !"0".equals(addPics)){
				System.out.println("addPics "+addPics);
				String[] pics = addPics.split("\\|");
				System.out.println("array size "+pics.length); 
				List<String> picList = new LinkedList<String>();
				for(String pc : pics){
					System.out.println("pc "+pc);
					if(!"".equals(pc)){
						picList.add(pc);
					}
				}
				spaceDetail.setPics(picList);
				
			}
			spaceDetail.setMainPic(spaceContentBean.getMain_pic());
			spaceDetail.setNoOfLike(spaceContentBean.getNo_of_like());
			spaceDetail.setPerDay(spaceContentBean.getPer_day());
			spaceDetail.setPerHalfDay(spaceContentBean.getPer_half_day());
			spaceDetail.setPerMonth(spaceContentBean.getPer_month());
			spaceDetail.setRecordId(count);
			count++;
			spaceDetail.setProductId(String.valueOf(productId));
			productId++;
			spaceDetail.setSpace_area(spaceContentBean.getSpace_area());
			spaceDetail.setSpace_capacity(spaceContentBean.getSpace_capacity());
			spaceDetail.setSpace_desc(spaceContentBean.getSpace_desc());
			spaceDetail.setSpaceHighlight(spaceContentBean.getSpace_highlight());
			spaceDetail.setSpaceId(spaceContentBean.getSpace_id());
			spaceDetail.setSpacePlanTerm(spaceContentBean.getSpace_plan_term());
			spaceDetail.setSpaceType(spaceContentBean.getSpace_type());
			spaceDetail.setVenueId(spaceContentBean.getVenueid());
			spaceDetail.setAddedBy("Arjun");
			spaceDetail.setCreatedDate(new Date());
			if(spaceContentBean.getStatus().equals("active")){
				spaceDetail.setActive(true);
			}else{
				spaceDetail.setActive(false);
			}
			
			spaceDetail.setInstantBooking(spaceContentBean.getInstant_booking());
			if(spaceContentBean.getFreeamenities()!=null && !"".equals(spaceContentBean.getFreeamenities())){
				String[] freeAmenities = spaceContentBean.getFreeamenities().split(",");
				List<String> freeAme = new LinkedList<String>();
				for(String amenity : freeAmenities){
					if(!"".equals(amenity)){
						freeAme.add(amenity);
					}
				}
				spaceDetail.setFreeamenities(freeAme);
			}
			
			if(spaceContentBean.getPaidamenities()!=null && !"".equals(spaceContentBean.getPaidamenities())){
				String[] paidAmenities = spaceContentBean.getPaidamenities().split(",");
				List<String> paidAmenity = new LinkedList<String>();
				for(String paidAme : paidAmenities){
					if(!"".equals(paidAme)){
						paidAmenity.add(paidAme);
					}
				}
				spaceDetail.setPaidamenities(paidAmenity);
			}
			
			spaceDetail.setSpaceTag1(spaceContentBean.getSpace_tag1());
			spaceDetail.setSpaceTag2(spaceContentBean.getSpace_tag2());
			spaceDetail.setSpaceTag3(spaceContentBean.getSpace_tag3());
			spaceDetail.setSpaceTag4(spaceContentBean.getSpace_tag4());
			spaceDetail.setFullyBooked(spaceContentBean.getFully_booked());
			spaceDetail.setShowOnHome(spaceContentBean.getShow_on_home());
			spaceDetail.setFreePass(spaceContentBean.getFree_pass());
			spaceDetail.setThumbnailPic(spaceContentBean.getThumbnail_pic());
			spaceDetail.setHostEmail(spaceContentBean.getHost_email());
			
			String venueIdString =String.valueOf( spaceContentBean.getVenueid());
			String city =venueCityMap.get(venueIdString);
			spaceDetail.setCity(city);
			
			searchDao.saveSpaceDetails(spaceDetail);
		}
	}
	
	
	private void saveSpaceSearch(List<SearchedSpaceContentBeans> list){
		for(SearchedSpaceContentBeans sp  : list){
			searchDao.saveSpaceSearch(sp);
		}
	}
	
	private void saveVenueDetails(List<VenueDetailsBean> list){
		for(VenueDetailsBean venueDetailsBean : list){
			searchDao.saveVenueDetails(venueDetailsBean);
		}
		
	}
	
	
}
