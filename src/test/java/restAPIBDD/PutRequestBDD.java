package restAPIBDD;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class PutRequestBDD {

	@Test
	public void test1() {
		
		JSONObject jobj =  new JSONObject();
		jobj.put("name", "Priya put");
		jobj.put("salary", "6500");
		
		RestAssured.given()
					.baseUri("http://localhost:3000/employees")
					.contentType(ContentType.JSON)
					.accept(ContentType.JSON)
					.body(jobj.toString())
					.when()
					.put("/12")
					.then()
					.statusCode(200)
					.log()
					.body();				
	
	
	}

}

