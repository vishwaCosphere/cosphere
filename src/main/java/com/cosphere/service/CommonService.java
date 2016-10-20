package com.cosphere.service;

import java.util.List;
import java.util.Random;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cosphere.beans.City;
import com.cosphere.beans.SpaceType;
import com.cosphere.dao.CommonDao;
import com.cosphere.model.SearchedSpaceContentBeans;
import com.cosphere.request.OtpRequest;
import com.cosphere.response.HomePageResponse;

@Service
public class CommonService {

	@Autowired
	private CommonDao commonDao;
	
	
	public void sendOtp(OtpRequest otpRequest){
		String mobile = otpRequest.getMobileNo();
		System.out.println("mobile no ::" + mobile);
		if(mobile!=null && !"".equals(mobile)){
			try{
				int code = generateOtpCode();
				String sendUrl="https://www.smsgatewayhub.com/api/mt/SendSMS?APIKey=5PYIkWNHC0awY2cfcXnVqg&senderid=HelloI&channel=2&DCS=0&flashsms=0&number="+mobile+"&text=your%20confirmation%20code:"+code;
				GetMethod getMethod=new GetMethod(sendUrl);
				HttpClient httpclient = new HttpClient();
				httpclient.executeMethod(getMethod);
				System.out.println("status code ::"+getMethod.getStatusCode()+"Response for"+getMethod.getResponseBodyAsString());
				commonDao.saveOtp(mobile, code);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public HomePageResponse getHomePagedata(){
		HomePageResponse homePageResponse = new HomePageResponse();
		List<City> cities = getCityList();
		List<SpaceType> spaceType = getSpaceType();
		List<SearchedSpaceContentBeans> homePageVenues = getHomePageVenues();
		homePageResponse.setHomePageVenues(homePageVenues);
		homePageResponse.setCities(cities);
		homePageResponse.setSpaceType(spaceType);
		return homePageResponse;
	}
	
	private  List<City> getCityList(){
		return commonDao.getActiveCity();
	}
	
	private List<SpaceType> getSpaceType(){
		return commonDao.getSpaceType();
	}
	
	private List<SearchedSpaceContentBeans> getHomePageVenues(){
		return commonDao.getHomePageVenues();
	}
	
	
	private int  generateOtpCode(){
		Random rand = new Random();
		return  rand.nextInt(10000);
	}
	
	
}
 