package com.saltside.codingexcercise.birdApi.repo;

import com.saltside.codingexcercise.birdApi.domain.Bird;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.Repository;

import java.util.List;


/**
 * Created by Neeraj on 9/14/2015.
 */
public interface BirdRepository extends MongoRepository<Bird, String> {

    void delete(Bird deleted);

    List<Bird> findAll();

    Bird findOne(String id);

    Bird save(Bird saved);
}
