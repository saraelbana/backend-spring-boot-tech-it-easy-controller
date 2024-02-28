Introduction

You have just started as a developer at a company called Tech It Easy, which sells TVs. During the Spring Boot course, you will be programming a backend application for the company. The store has an inventory of televisions that needs to be maintained. After each lesson, we will gradually expand this application through homework assignments. This way, you will gain step-by-step experience in building a backend application. At the end of the course, we will have a working Tech It Easy backend application!

Assignment Description

You will create a project via the Spring Boot Initialzr, using the following dependency:

Spring Web
Throughout the Spring Boot course, it will gradually become clear why you need this dependency. For now, you can just take our word for it!

Requirements

The assignment must meet the following requirements:

The project contains, in the correct location in the folder structure, a folder named controllers.
The project contains, in the correct location in the folder structure, a folder named exceptions.
The project contains a TelevisionsController.
The project contains an ExceptionController.
The project contains a RecordNotFoundException.
The TelevisionsController contains:
a GET request for all televisions
a GET request for one television
a POST request for one television
a PUT request for one television
a DELETE request for one television
The ExceptionController contains:
an exception handler
The RecordNotFoundException contains:
a default exception
an exception with a message
Important
When submitting this assignment, the application is not yet fully functional because we need more knowledge about other techniques that will be covered later in the course.

You may use the following ResponseEntities as return values:

ResponseEntity.ok("television")
ResponseEntity.created(null).body("television")
ResponseEntity.noContent().build()
Steps

Note: It is more challenging to create your own step-by-step plan. If you are not sure where to start, you can follow the steps below:

Set up a new project via Spring Boot Initialzr named TechItEasy.
Create a new folder in your project named controllers.
Create a new folder in your project named exceptions.
Create a new class in the controllers folder for the TelevisionController.
Provide the class with the correct annotation.
Create the requested requests (as mentioned in the requirements) in the class with the appropriate response entities.
Create a new class in the controllers folder for the ExceptionController.
Provide the class with the correct annotation.
Create an exceptionHandler in the class with the correct notation and response entity.
Create a new class in the exceptions folder.
Extend the class with RuntimeException.
Fill in the class based on the example in chapter 3.4 of the Spring Boot course.
Bonus Assignment

Currently, for a few RequestMappings, we return the String "television". Ultimately, we intend to return data from a database. For now, this is unknown territory, but we can pretend we have a database.

Create a List of Strings named "televisionDataBase" in your controller class; this will serve as our database.
Ensure that your GET requests return the correct data from the list. (Use the "id" PathVariable as the index of the list)
Ensure that your POST request adds a new string to the list. (Consider adding a brand name or TV model name)
Ensure that your PUT request modifies the string at position x in the "database". (use the index of the list)
Ensure that your DELETE request removes the string at position x in the "database". (simulating removal by changing the value to null, similar to PUT)
Create an additional method in your ExceptionController class where you catch the IndexOutOfBoundsException (this is a standard Java exception). With this exception handler, we send a message (and HTTP status) to the user if they make a GET request with an id that is greater than the length of the database list.
Extra Bonus

In the ExceptionController, do not create a method that catches IndexOutOfBoundsException; instead, ensure that by throwing RecordNotFoundException in your controller, you don't get errors when you provide incorrect input in Postman (e.g., id 5 while you only have 2 items in your list).
Create a new exception with an appropriate name that you throw if the user tries to post a TV with a name longer than 20 letters. Apply this exception in the POST mapping and in the ExceptionHandler. Also, provide a suitable message and HTTP status in the controller/ExceptionHandler.