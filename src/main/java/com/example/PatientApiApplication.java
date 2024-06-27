/**

     Just Going Viral © 2024
     API Template
     
     -- Main Program --

    Author: Lancey Fem Denise Cruz
    lancey@justgoingviral.com
    
    This API template uses Java, Kotlin, and Spring Boot to give you a solid starting point for building RESTful APIs. 
    It's designed to be flexible and modern, so you can jump right into developing endpoints without a lot of setup 
    hassle. With both Java and Kotlin in the mix, you get the best of both worlds—whether you prefer a more traditional 
    approach or the newer, more concise syntax of Kotlin. The template comes with basic CRUD operations already set up, 
    so you can start testing your API right away and easily add more complex features as needed.
    
    Plus, we've integrated it with Postman to make testing and documenting your API a breeze. The included Postman collection 
    lets you quickly interact with the API and check that everything's working correctly as you build. Thanks to Spring Boot, 
    this template is not just easy to get up and running, but it's also built to be scalable and maintainable in the long run. 
    Whether you're working on a class project or a personal side gig, this setup will save you time and help you follow best 
    practices for API development.

**/




package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatientApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(PatientApiApplication.class, args);
    }
}
