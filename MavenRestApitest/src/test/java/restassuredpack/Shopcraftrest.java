package restassuredpack;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class Shopcraftrest {
	
  @Test
	public void test_numberOfCircuitFor2017_Season() {
	  //JsonPath j=Response.jsonPath();
	 // RestAssured.rootPath="id.first.last.department";
	  //((RestAssured) JsonPath=("http://api.icraftsoft.net:6060/users/"));
	   given().
	   when().
		    get("http://api.icraftsoft.net:6060/users/").
		then().
		   assertThat().
		   statusCode(200).//statuscode
		   and().
		   //body("id.first.last.department",hasSize(32)).//body
		   and().
		   header("Transfer-Encoding",equalTo("chunked"));//header
		
		

}
}