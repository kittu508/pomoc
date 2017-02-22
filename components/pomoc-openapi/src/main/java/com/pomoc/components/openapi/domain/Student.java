package com.pomoc.components.openapi.domain;

import com.pomoc.components.openapi.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Student implements User {

   private String userName;

   private String userAddress;

   private String userPhoneNumber;
   private String userUniversity;
}