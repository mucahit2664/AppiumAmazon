package api.stepDefApi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import api.utilities.ConfigReader;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class putRequestStepDef extends TestBaseApi{

    Response response;
    JsonPath jsonPath;


    @Given("put request new name as {string}")
    public void putRequestNewNameAs(String newName) {

        setUp();
        spec.pathParams("p1","boards","p2",ConfigReader.getProperty("idForPut"));

        HashMap<String,String> requestBody=new HashMap<>();

        requestBody.put("key", ConfigReader.getProperty("key"));
        requestBody.put("token",ConfigReader.getProperty("token"));
        requestBody.put("desc",newName);
        System.out.println(requestBody);

        response =given().
                spec(spec).
                contentType("application/json").
                body(requestBody).
                when().
                put("/{p1}/{p2}");

        response.prettyPrint();
        jsonPath=response.jsonPath();
    }

    @And("assert status")
    public void assertStatus() {
    }

    @And("assert new name {string}")
    public void assertNewName(String newName) {
    }
}

//{{baseurl}}/1/cards/{{idCard}}?key={{apikey}}&token={{token }}
  //      {{baseurl}}/1/cards?idList={{idList}}&key={{apikey}}&token={{token }}&name=card3
//{{baseurl}}/1/cards/{{idCardYeni}}/attachments?url=https://drive.google.com/drive/folders/10xO0LE7t_xx21ZVc_iwI2glGW3P3ygCE&key={{apikey}}&token={{token }}&name=resume
//{{baseurl}}/1/checklists?idCard={{idCard2}}&key={{apikey}}&token={{token }}

