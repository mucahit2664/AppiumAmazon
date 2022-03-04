package api.stepDefApi;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;


public class TestBaseApi {

    protected RequestSpecification spec;


    public void setUp(){
        spec= new RequestSpecBuilder()
                .setBaseUri("https://api.trello.com/1").build();
    }

}
