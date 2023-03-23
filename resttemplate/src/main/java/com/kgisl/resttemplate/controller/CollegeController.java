package com.kgisl.resttemplate.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgisl.resttemplate.model.College;

@RestController
@RequestMapping("/college")
public class CollegeController {
    @RequestMapping("/{id}")
    public ResponseEntity<College> getCollegeById(@PathVariable("id") int id)
    {
        College c = new College();
         c.setCollegeid(101);
          c.setCollegename("psna");
     c.setAddress("Dindigul");
      return new ResponseEntity<College>(c,HttpStatus.OK);
     }
}
