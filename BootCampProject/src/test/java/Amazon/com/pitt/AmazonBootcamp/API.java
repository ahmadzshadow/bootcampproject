package Amazon.com.pitt.AmazonBootcamp;
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
public class API {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Response responsive = get("https://reqres.in/api/users?page=2");
	responsive.prettyPrint();
	int statusprint=responsive.statusCode();
	System.out.println(statusprint);

	}

}
