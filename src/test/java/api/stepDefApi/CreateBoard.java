package api.stepDefApi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import ui.utilities.ConfigReader;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class CreateBoard extends TestBaseApi {

    Response response;
    JsonPath jsonPath;
    String id;


    @Given("Send POST request for create {string} board")
    public void send_post_request_for_create_board(String boardName) {

        //url tanımla
        //expected data-request data
       // request gönder
        //resposu al
        //assert et
        setUp();
        spec.pathParams("parametre","boards");

        HashMap<String,String> requestBody=new HashMap<>();
        requestBody.put("name",boardName);
        requestBody.put("key", ConfigReader.getProperty("key"));
        requestBody.put("token",ConfigReader.getProperty("token"));

        System.out.println(requestBody);

        response =given().
                 spec(spec).
                 contentType("application/json").
                 body(requestBody).
                 when().
                 post("{parametre}");

        response.prettyPrint();
        jsonPath=response.jsonPath();


    }

    @Then("Assert status code {int}")
    public void assertStatusCode(int statusCode) {

        Assert.assertEquals(statusCode,response.getStatusCode());

    }

    @Then("Assert board name is {string}")
    public void assert_board_name_is(String boardName) {
        id= jsonPath.getString("id");
        System.out.println(id);
        Assert.assertEquals(boardName,jsonPath.getString("name"));

    }


    @Given("send a Get request {string} board")
    public void sendAGetRequestBoard(String boardName) {
        //{{baseurl}}/1/boards/{{id}}?key={{key}}&token={{token}}
        String id="62220360cb37db5f543bd2d7";
        setUp();
        spec.pathParams("p1","boards","p2",id);

        HashMap<String,String> requestBody=new HashMap<>();
        requestBody.put("key", ConfigReader.getProperty("key"));
        requestBody.put("token",ConfigReader.getProperty("token"));

        response =given().
                spec(spec).
                contentType("application/json").
                body(requestBody).
                when().
                get("/{p1}/{p2}");

        response.prettyPrint();
        jsonPath=response.jsonPath();
    }

    @Given("send a delete request {string}")
    public void sendADeleteRequest(String boardName) {
       // https://api.trello.com/1/boards/{{id}}?key={{key}}&token={{token}}

        String id="62220360cb37db5f543bd2d7";
        setUp();
        spec.pathParams("p1","boards","p2",id);

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
        jsonPath=response.jsonPath();

    }

    @And("assert deleting")
    public void assertDeleting() {
        Assert.assertEquals("delete olmadi",200,response.getStatusCode());

    }

    @Then("Assert get status code {int}")
    public void assertGetStatusCode(int statusCode) {
        Assert.assertEquals("assert olmadi200",statusCode,response.getStatusCode());

    }

    @And("Assert get board name is {string}")
    public void assertGetBoardNameIs(String boardName) {
        Assert.assertEquals("assert olmadi",boardName,jsonPath.getString("name"));


    }
}
