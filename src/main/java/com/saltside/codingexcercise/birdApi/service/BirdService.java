package com.saltside.codingexcercise.birdApi.service;

import com.saltside.codingexcercise.birdApi.domain.Bird;

import java.util.List;

/**
 * Created by Neeraj on 9/14/2015.
 */
public interface BirdService {

    Bird create(Bird bird);

    Bird delete(String id);

    List<Bird> findAll();

    Bird findById(String id);

    Bird update(Bird bird);
}
