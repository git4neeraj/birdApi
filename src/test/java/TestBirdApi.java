import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.saltside.codingexcercise.birdApi.domain.Bird;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

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

    @Test
    public void testDeleteBirdsWithId(){
        expect().statusCode(200).contentType(ContentType.JSON).when()
                .delete("/birds/55f73676005d21e7adee3313");
    }

    @Test
    public void testPostBird(){
        Bird bird = new Bird();
        bird.setName("Tweety");
        bird.setVisible(true);
        bird.setAdded(new Date().toString());
        bird.getContinents().add("Asia");
        bird.getContinents().add("Latin");
        bird.getContinents().add("North America");
        bird.setFamily("f223");
        expect().statusCode(200).contentType(ContentType.JSON).when()
                .post("/birds",bird);
    }

}
