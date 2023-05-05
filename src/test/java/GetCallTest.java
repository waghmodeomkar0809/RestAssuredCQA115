import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetCallTest {
    @Test
    public void GetTest(){
        Response response = RestAssured.get(" http://localhost:3000/posts/");
        System.out.println("Status Code:"+response.statusCode());
        System.out.println("Time:"+response.getTime());
        System.out.println("Json Body:"+response.asPrettyString());
        Assert.assertEquals(response.statusCode(),200);
    }
    @Test
    public void GetPetTest(){
        Response response = RestAssured.get("https://editor.swagger.io/?_ga=2.198218735.1537229629.1682261252-1643591187.1681922146");
        System.out.println("Status Code:"+response.statusCode());
        System.out.println("Time:"+response.getTime());
        System.out.println("Json Body:"+response.asPrettyString());
        Assert.assertEquals(response.statusCode(),200);
    }
}
