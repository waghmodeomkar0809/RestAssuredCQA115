import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.junit.runner.Request;
import org.testng.annotations.Test;

public class PostCallTest {
    @Test
    public void AddpetTest(){
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/Json");
        JSONObject json = new JSONObject();
        json.put("id","4");
        json.put("title","omkar");
        json.put("author","waghmode");

        request.body(json.toJSONString());
      Response response = request.post(" http://localhost:3000/posts/");

      System.out.println("status code:"+response.statusCode());
      System.out.println("Time:"+response.getTime());
      System.out.println("Response Body"+response.asPrettyString());
        

    }
}
