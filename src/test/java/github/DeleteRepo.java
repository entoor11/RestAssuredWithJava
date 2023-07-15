package github;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteRepo {

	@Test
	public void test1() throws IOException {
		
		byte[] dataFile = Files.readAllBytes(Paths.get("repodata.json"));
		
		RestAssured.baseURI = "https://api.github.com/user/repos";
		RequestSpecification request = RestAssured.given();
		
		Response response = request.auth().oauth2("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").delete();
				
		
		System.out.println("Response code is " + response.statusCode());
		Assert.assertEquals(response.statusCode(), 200);
		
		
	}

}


