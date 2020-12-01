/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS
 */
@RestController
@RequestMapping("/movies")
/*public class MovieController {
    
    @Value("${api.key}")
    private String key;
    
    @GetMapping("/id")
    public Movie getMovie(@PathVariable("id") String id) {
        return new Movie();
    }
    
}

@FeignClient("https://api.themoviedb.org/3/movie/")
interface ConsumeExternalAPI {
    
    @RequestMapping(method = RequestMethod.GET, value = id + "" + key)
    Movie findById(@PathVariable("id") String id);
    
}
*/