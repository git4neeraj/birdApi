package com.saltside.codingexcercise.birdApi.service;

import com.saltside.codingexcercise.birdApi.domain.Bird;
import com.saltside.codingexcercise.birdApi.repo.BirdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Neeraj on 9/14/2015.
 */
@Service
public class BirdServiceImpl implements BirdService {

    private final BirdRepository birdRepository;

    @Autowired
    public BirdServiceImpl(BirdRepository birdRepository) {
        this.birdRepository = birdRepository;
    }

    @Override
    public Bird create(Bird bird) {
        return birdRepository.save(bird);
    }

    @Override
    public Bird delete(String id) {
        Bird toDeleteBird =birdRepository.findOne(id);
        birdRepository.delete(toDeleteBird);
        return toDeleteBird;
    }

    @Override
    public List<Bird> findAll() {
        return birdRepository.findAll();
    }

    @Override
    public Bird findById(String id) {
        return birdRepository.findOne(id);
    }

    @Override
    public Bird update(Bird bird) {
        return birdRepository.save(bird);
    }
}
