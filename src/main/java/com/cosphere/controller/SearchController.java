package com.cosphere.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cosphere.model.UserDetails;
import com.cosphere.request.SearchRequest;
import com.cosphere.response.SearchResponse;
import com.cosphere.response.SpaceDetailResponse;
import com.cosphere.service.SearchService;


@Controller
public class SearchController {

	@Autowired
	private SearchService searchService;
	
	@RequestMapping(value="/test",method=RequestMethod.GET )
	public @ResponseBody String getCibil(){
		UserDetails userDetails = new UserDetails();
		userDetails.setName("vishwajeet");
		userDetails.setEmail("vishwajeet@cosphere.in");
		//searchService.saveUserDetails(userDetails );
		searchService.migration();
		return "Its Working";
	}
	
	
	@RequestMapping(value="/insert", method=RequestMethod.GET)
	public @ResponseBody String saveStaticData(){
		searchService.migrateCity();
		return "saved";
	}
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public @ResponseBody SearchResponse search(@RequestBody SearchRequest searchRequest){
		return searchService.search(searchRequest);
	}
	
	@RequestMapping(value="/getSpaceDetail",method=RequestMethod.GET)
	public @ResponseBody SpaceDetailResponse getSpaceDetail(@RequestParam String id){
		SpaceDetailResponse spaceDetailResponse = new SpaceDetailResponse();
		System.out.println("Id :: "+id);
		spaceDetailResponse = searchService.getSpaceDetailByProductId(id);
		return spaceDetailResponse;
	}
	
}
