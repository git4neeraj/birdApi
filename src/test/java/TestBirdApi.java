import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import org.junit.Before;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.expect;

/**
 * Created by Neeraj on 9/18/2015.
 */
public class TestBirdApi {

    @Before
    public void setUp(){
        RestAssured.basePath = "http://localhost:8080";
    }

    @Test
    public void testGetBirds(){
        expect().statusCode(200).contentType(ContentType.JSON).when()
                .get("/birds");
    }

    @Test
    public void testGetBirdsWithId(){
        expect().statusCode(200).contentType(ContentType.JSON).when()
                .get("/birds/55f73676005d21e7adee3313");
    }
}
