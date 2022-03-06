package api.stepDefApi;

import api.trelloPOJOS.FirstRequestPojo;
import api.trelloPOJOS.RequestPojo;
import api.utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class CreateCartPOJO extends TestBaseApi{
    Response response;
    RequestPojo repo;
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

    @And("Assert response {String}")
    public void assertResponse(String cardname) {

        Assert.assertEquals(200,response.statusCode());
        Assert.assertEquals(cardname,repo.getName());
        repo.getId();
    }
}
