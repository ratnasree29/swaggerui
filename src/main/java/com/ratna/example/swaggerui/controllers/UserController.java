package com.ratna.example.swaggerui.controllers;

import com.ratna.example.swaggerui.models.CreateUserRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {


    //Request is DTO
    @RequestMapping(method= RequestMethod.POST, path = "/create")
    public String createUser(@RequestBody CreateUserRequest request) {
        return "User Created Successfully ";
    }

    //Response is DTO
    @RequestMapping(method=RequestMethod.GET, path = "/id/{userID}")
    public CreateUserResponse createUser(@PathVariable String userID) {

        System.out.println("Loading Values of user : " + userID);
        CreateUserResponse response = new CreateUserResponse();
        response.setEmail("Tekk.Teacher@gmail.com");
        response.setFirstName("Tek");
        response.setLastName("Teacher");

        return response;
    }
}
