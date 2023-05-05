package Response;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TwitterApiTest {
    @Test
    public void postTweetTest(){

        Response response = RestAssured.given().
                auth().
                oauth("L9KliTgYRkMYnSjcOcQKVGr6J",
                        "DIe8Rzo2Xb8JsU3QYw8rgF6skFbw3cTW4MLTFymNzKrLSTsLtY",
                        "1651860257357041670-aEQIDD6zxSwu94YXl0J5OccFaeUdCt",
                        "SWOUV45M7skgeqdUYB19nPwgtywbgrwMLfnmfkvFAzq5M").post("https://api.twitter.com/1.1/statuses/update.json?status=Hello");

        System.out.println("Body : "+response.asPrettyString());
        System.out.println("status code : "+response.getStatusCode());
    }
    @Test
    public void retweetTest(){

        Response response = RestAssured.
                given().
                auth().
                oauth("L9KliTgYRkMYnSjcOcQKVGr6J",
                        "DIe8Rzo2Xb8JsU3QYw8rgF6skFbw3cTW4MLTFymNzKrLSTsLtY",
                        "1651860257357041670-aEQIDD6zxSwu94YXl0J5OccFaeUdCt",
                        "SWOUV45M7skgeqdUYB19nPwgtywbgrwMLfnmfkvFAzq5M").
                post("https://api.twitter.com/1.1/statuses/retweet/1651871322706948096.json");

        System.out.println("Body : "+response.asPrettyString());
        System.out.println("status code : "+response.getStatusCode());
    }

    @Test
    public void UndoReTweetTest(){

        Response response= RestAssured.
                given().
                auth().
                oauth("L9KliTgYRkMYnSjcOcQKVGr6J",
                        "DIe8Rzo2Xb8JsU3QYw8rgF6skFbw3cTW4MLTFymNzKrLSTsLtY",
                        "1651860257357041670-aEQIDD6zxSwu94YXl0J5OccFaeUdCt",
                        "SWOUV45M7skgeqdUYB19nPwgtywbgrwMLfnmfkvFAzq5M").
                post("https://api.twitter.com/1.1/statuses/unretweet/1651873982667456512.json");

        System.out.println("Body : "+response.asPrettyString());
        System.out.println("status code : "+response.getStatusCode());
    }

    @Test
    public void deleteTweetTest(){

        Response response= RestAssured.
                given().
                auth().
                oauth("L9KliTgYRkMYnSjcOcQKVGr6J",
                        "DIe8Rzo2Xb8JsU3QYw8rgF6skFbw3cTW4MLTFymNzKrLSTsLtY",
                        "1651860257357041670-aEQIDD6zxSwu94YXl0J5OccFaeUdCt",
                        "SWOUV45M7skgeqdUYB19nPwgtywbgrwMLfnmfkvFAzq5M").
                post("https://api.twitter.com/1.1/statuses/destroy/1651871322706948096.json");

        System.out.println("Body : "+response.asPrettyString());
        System.out.println("status code : "+response.getStatusCode());
    }

}
