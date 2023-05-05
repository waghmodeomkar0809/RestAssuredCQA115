import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PutCallTest {

@Test
    public void modifypetDetails(){
    RequestSpecification request = RestAssured.given();
    request.header("Content-Type","application/Json");
    JSONObject json = new JSONObject();
    json.put("title","karan");
    json.put("author","waghmode");

    request.body(json.toJSONString());
    Response response = request.put("  http://localhost:3000/posts/4");

    System.out.println("status code:"+response.statusCode());
    System.out.println("Time:"+response.getTime());
    System.out.println("Response Body"+response.asPrettyString());
}

}
