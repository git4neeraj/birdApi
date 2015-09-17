package com.saltside.codingexcercise.birdApi.util;

import com.google.gson.Gson;
import com.saltside.codingexcercise.birdApi.domain.Bird;

import java.util.Date;

/**
 * Created by Neeraj on 9/15/2015.
 */
public class GsonUtil {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.setName("Tweety");
        bird.setVisible(true);
        bird.setAdded(new Date().toString());
        bird.getContinents().add("Asia");
        bird.getContinents().add("Latin");
        bird.getContinents().add("North America");
        bird.setFamily("f223");

        Gson gson = new Gson();
        String json = gson.toJson(bird);
        System.out.print(json);
    }
}
