package com.pomoc.components.openapi;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public interface User {
   String getUserName();
   String getUserAddress();
   String getUserPhoneNumber();
   String getUserUniversity();
}
