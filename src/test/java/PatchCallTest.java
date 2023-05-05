import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PatchCallTest {
    @Test
    public void modifypetDetails(){
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/Json");
        JSONObject json = new JSONObject();
        json.put("author","kasbe");

        request.body(json.toJSONString());
        Response response = request.patch("  http://localhost:3000/posts/4");

        System.out.println("status code:"+response.statusCode());
        System.out.println("Time:"+response.getTime());
        System.out.println("Response Body"+response.asPrettyString());
    }

}
