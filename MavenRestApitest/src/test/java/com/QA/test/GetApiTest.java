package com.QA.test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.QA.base.TestBase;
import com.QA.client.Restclient;

public class GetApiTest  extends TestBase{
	TestBase testbase;
	String serviceUrl;
	String apiurl;
	String url;
	Restclient rest;
	
	
	@BeforeMethod
	public void setuo() throws ClientProtocolException, IOException {
		TestBase testbase= new TestBase();
		 serviceUrl=prop.getProperty("URL");//string
		apiurl=prop.getProperty("serviceurl");
		//https://reqres.in/api/users
		
		
		 url=serviceUrl+apiurl;
	}
	@Test
	public void gettest() throws ClientProtocolException, IOException {
		 rest=new Restclient();
		 rest.get(url);
		
	}
	
	
	
	
}
