package com.QA.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class Restclient {

	// 1create get method 2.test the status code, number of users info on the response and header
	
	public void get(String url) throws ClientProtocolException, IOException {
		
	CloseableHttpClient httpclient=	HttpClients.createDefault();
	HttpGet httpget= new HttpGet(url);//http get request
	//the response will be stored in cHR obj
	CloseableHttpResponse closeablehttpresponse = httpclient.execute(httpget);//the same as sending on postman or hit the GET URL
		//status code
	    int statuscode=closeablehttpresponse.getStatusLine().getStatusCode();
		System.out.println("status code......"+statuscode);
		
		//to get the whole response in jsonstring
		String responsestring=EntityUtils.toString(closeablehttpresponse.getEntity(),"UTF-8");
		
		JSONObject responseJson=new JSONObject(responsestring);//to convert to json
		System.out.println("response json from API"+responseJson);
		
		//all headers
		Header[] headersarray= closeablehttpresponse.getAllHeaders();
		
		HashMap<String,String>allHeaders =new HashMap<String,String>();
		for(Header header: headersarray) {
			allHeaders.put(header.getName(),header.getValue());
		}
		System.out.println("Headers array"+allHeaders);
	}                                   
	
	
	
	
}
