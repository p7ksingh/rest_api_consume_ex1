package com.rest.ex.restconsume1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {

    @Autowired
    RestTemplate restTemplate;

    public String getApiData() {
        return restTemplate.getForObject("http://restapi.adequateshop.com/api/Tourist/286964", String.class);

    }

}
