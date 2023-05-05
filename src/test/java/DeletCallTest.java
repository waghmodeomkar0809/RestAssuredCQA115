import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeletCallTest {
    @Test
    public void GetTest() {
        Response response = RestAssured.delete(" http://localhost:3000/posts/4");
        System.out.println("Status Code:" + response.statusCode());
        System.out.println("Time:" + response.getTime());
        System.out.println("Json Body:" + response.asPrettyString());
        Assert.assertEquals(response.statusCode(), 200);
    }
}