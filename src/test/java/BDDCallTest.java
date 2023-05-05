import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class BDDCallTest {
    @Test
    public void GetBDDTest(){
        Response response = given().when().get("http://localhost:3000/posts/");
        System.out.println("Status Code:"+response.statusCode());
        System.out.println("Time:"+response.getTime());
        System.out.println("Json Body:"+response.asPrettyString());
    }
    @Test
    public void PostBDDTest(){
        JSONObject json = new JSONObject();
        json.put("id","4");
        json.put("title","omkar");
        json.put("author","waghmode");
        Response response = given().headers("Content-Type","application/Json").body(json.toJSONString()).when().post("http://localhost:3000/posts/");
        System.out.println("Status Code:"+response.statusCode());
        System.out.println("Time:"+response.getTime());
        System.out.println("Json Body:"+response.asPrettyString());
    }
    @Test
    public void PutBDDTest() {
        JSONObject json = new JSONObject();
        json.put("title", "karanjaan");
        json.put("author", "waghmode");
        Response response = given().headers("Content-Type", "application/Json").body(json.toJSONString()).when().put("http://localhost:3000/posts/4");
        System.out.println("Status Code:" + response.statusCode());
        System.out.println("Time:" + response.getTime());
        System.out.println("Json Body:" + response.asPrettyString());
    }
    @Test
    public void PatchBDDTest() {
        JSONObject json = new JSONObject();
        json.put("author", "waghmodeom");
        Response response = given().headers("Content-Type", "application/Json").body(json.toJSONString()).when().patch("http://localhost:3000/posts/4");
        System.out.println("Status Code:" + response.statusCode());
        System.out.println("Time:" + response.getTime());
        System.out.println("Json Body:" + response.asPrettyString());
    }
    @Test
    public void DeletBDDTest() {
        JSONObject json = new JSONObject();
        json.put("author", "waghmodeom");
        Response response = given().headers("Content-Type", "application/Json").body(json.toJSONString()).when().delete("http://localhost:3000/posts/4");
        System.out.println("Status Code:" + response.statusCode());
        System.out.println("Time:" + response.getTime());
        System.out.println("Json Body:" + response.asPrettyString());
    }
}
