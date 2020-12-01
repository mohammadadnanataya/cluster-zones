/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS
 */
@RestController
@RequestMapping("/movies")
public class MovieController {
    
    @Autowired
    private ConsumeExternalAPI consumeExternalAPI;
    
    @Value("${api.key}")
    private String key;
    
    @GetMapping("/{id}")
    public String getMovie(@RequestParam("id") String id) {
        String movie = consumeExternalAPI.getMovie(id, key);
        return movie;
    }
    
}

@FeignClient(name = "consume-external-api", url = "https://api.themoviedb.org/3/movie")
interface ConsumeExternalAPI {
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}?api_key={key}")
    String getMovie(@PathVariable("id") String id, @PathVariable("key") String key);
    
}
