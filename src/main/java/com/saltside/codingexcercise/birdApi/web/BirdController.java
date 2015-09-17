package com.saltside.codingexcercise.birdApi.web;

import com.saltside.codingexcercise.birdApi.domain.Bird;
import com.saltside.codingexcercise.birdApi.exception.ResourceNotFoundException;
import com.saltside.codingexcercise.birdApi.service.BirdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Neeraj on 9/14/2015.
 */
@RestController
@RequestMapping("/birds")
public class BirdController {

    @Autowired
    private BirdService service;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    Bird create(@RequestBody @Valid Bird bird) {
        return service.create(bird);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    Bird delete(@PathVariable("id") String id) {
        return service.delete(id);
    }


    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    List<Bird> findAll() {
        return service.findAll();
    }


    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    Bird findById(@PathVariable("id") String id) throws ResourceNotFoundException {
        Bird birdResult = service.findById(id);
        if (birdResult != null) {
            return birdResult;
        } else {
            throw new ResourceNotFoundException();
        }
    }


    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    Bird update(@RequestBody @Valid Bird bird) {
        return service.update(bird);
    }


    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleTodoNotFound(ResourceNotFoundException ex) {
        return "/404.html";
    }
}
