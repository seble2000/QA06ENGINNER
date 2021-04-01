package restassuredpack;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;



public class CraftApitest {
	
	@Test
	public void getrequestmethod() {
		RestAssured.rootPath="location.address.name";
		given().
		when().
		 get("http://rahulshettyacademy.com/maps/api/place/get/json?place_id=b5cdd0f9a88a81e93eb55e9eb289d84a&key=qaclick123").
		 then().
		assertThat().
		statusCode(200).and().
		//body("find{find {l->l.address=='29, side layout, cohen 09'}.name}.name",equalTo("Frontline house")).and().
		header("Content-Length",equalTo("264"));;
		 
		
		
		
		
	}

}
