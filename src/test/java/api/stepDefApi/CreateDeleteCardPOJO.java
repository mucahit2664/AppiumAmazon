package api.stepDefApi;

import api.trelloPOJOS.FirstRequestPojo;
import api.trelloPOJOS.RequestPojo;
import api.utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class CreateDeleteCardPOJO extends TestBaseApi{
    Response response;
    RequestPojo repo;
    String cardId;

    @Given("Post request for create a card {string} with POJO")
    public void postRequestForCreateACardWithPOJO(String cardname) {
        //{{baseurl}}/1/cards?idList={{idListYD}}&key={{key}}&token={{token}}&name=umit
        FirstRequestPojo rePojo=
                new FirstRequestPojo(ConfigReader.getProperty("idListYD"),ConfigReader.getProperty("key"), ConfigReader.getProperty("token"), cardname);

        setUp();
        spec.pathParams("p1","cards");
        response=given()
                .contentType("application/json")
                .spec(spec)
                .body(rePojo)
                .when()
                .post("/{p1}");
        response.prettyPrint();

    }

    @And("get response with POJO")
    public void getResponseWithPOJO() {
        repo=response.as(RequestPojo.class);
        System.out.println(repo);
    }


    @And("Assert response {string}")
    public void assertResponse(String cardname) {
        Assert.assertEquals(200,response.statusCode());
        Assert.assertEquals(cardname,repo.getName());
        System.out.println(repo.getId());
        cardId=repo.getId();
    }

    @And("delete card")
    public void deleteCard() throws InterruptedException {
       // {{baseurl}}/1/cards/{{idCard}}?key={{apikey}}&token={{token }}
    Thread.sleep(5000);
        setUp();
        spec.pathParams("p1","cards","p2",cardId);

        HashMap<String,String> requestBody=new HashMap<>();
        requestBody.put("key", ConfigReader.getProperty("key"));
        requestBody.put("token",ConfigReader.getProperty("token"));

        response =given().
                spec(spec).
                contentType("application/json").
                body(requestBody).
                when().
                delete("/{p1}/{p2}");

        response.prettyPrint();
        Assert.assertEquals("delete olmadi",200,response.getStatusCode());



    }
}
