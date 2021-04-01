package restassuredpack;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetcallBDD {
	
	
	@Test
	public void test_numberOfCircuitFor2017_Season() {
		
//		given().
//		when().
//		then().
//		assert().
//		
		given().
		when().
		    get("http://ergast.com/api/f1/2017/circuits.json").
		then().
		   assertThat().
		   statusCode(200).//statuscode
		   and().
		   body("MRData.CircuitTable.Circuits.circuitId",hasSize(20)).//body
		   and().
		   header("Content-Length",equalTo("4551"));//header
		
		
		
		
	}
	
	

}
