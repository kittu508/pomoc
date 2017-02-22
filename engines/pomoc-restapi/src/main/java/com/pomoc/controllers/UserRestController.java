package com.pomoc.controllers;

import com.pomoc.components.openapi.domain.Student;
import org.apache.catalina.User;
import org.springframework.util.MimeType;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

   @RequestMapping(method = RequestMethod.GET,produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
   public com.pomoc.components.openapi.User getTest(){

      Student student= new Student();
      student.setUserAddress("8604 Valley Ranch Pkwy");
      student.setUserName("Rama Krishna Gollapudi");
      student.setUserPhoneNumber("7242087886");
      student.setUserUniversity("Texas State University");

      return  student;
   }
}
