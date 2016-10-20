package com.cosphere.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cosphere.request.OtpRequest;
import com.cosphere.response.HomePageResponse;
import com.cosphere.service.CommonService;

@Controller
public class CommonController {

	@Autowired
	private CommonService commonService;
	
	private static  Logger logger = Logger.getLogger(CommonController.class);
	
	
	@RequestMapping(value="/getHomePageData",method=RequestMethod.GET )
	public @ResponseBody HomePageResponse getHomePageData(){
		HomePageResponse homePageResponse = null;
		try{
			homePageResponse =commonService.getHomePagedata();
		}catch(Exception e){
			logger.error("Exception in getHomePageData", e);
		}
		return homePageResponse;
	}
	
	@RequestMapping(value="/sendOtp" , method=RequestMethod.POST)
	public @ResponseBody String sendOtp(@RequestBody OtpRequest OtpRequest){
		
		commonService.sendOtp(OtpRequest);
		return "Successfully otp sent";
	}
}
