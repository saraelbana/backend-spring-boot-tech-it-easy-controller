# Assignment Description

# Introduction

You have just started as a developer at a company called Tech It Easy, which sells TVs. During the Spring Boot course, you will be programming a backend application for the company. The store has an inventory of televisions that needs to be managed. After each lesson, we will further develop this application through homework assignments. This way, you will gain more experience step by step in building a backend application. By the end of the course, we will have a working Tech It Easy backend application!

# Recap of Previous Assignment

In the previous lesson, you expanded the application for your employer TechItEasy with a Model and a Repository. A Model is a Class in your project and contains variables and constructors, allowing you to create multiple objects of this Class in your database. The Repository has been extended with the JpaRepository, which allows you to perform standard find functions in the Service that we will add to the project in the next lesson. In addition to the standard queries already present in the JpaRepository, we can later write additional queries in the Repository for more complex find functions. But wouldn't it be cool if the project could run? Good news: after this lesson, the project will work and provide the correct response when we make requests via Postman.

# Preconditions

# The assignment must meet the following conditions:

- The project contains, in the correct location in the folder structure, a folder named services;
- The services folder contains a class named TelevisionService;
- The TelevisionService contains:
    -the correct annotation
    -a private variable TelevisionRepository
    -the connection of the Service and the Repository through autowired or constructor injection
    -a function for retrieving all Televisions
    -a function for retrieving 1 Television
    -a function for saving 1 Television
    -a function for deleting 1 Television
    -a function for updating 1 Television
- The Controller is linked to the Service through autowired or constructor injection;
- The project contains, in the correct location in the folder structure, a folder named Dtos;
- The dtos folder contains a TelevisionDto and a TelevisionInputDto;
- The requestMappings in the Controller are adjusted to pass the correct response through the Service;
- The Service uses the data passed through the Controller from the Dtos;
- The project contains the validation dependency from section 7.1 of the Spring Boot course in Edhub.

#Important

-After this lesson, the requestMappings in the controller must provide the correct responses.

It is important to understand how the layers in our multi-tier application work together:

- The Controller receives a request on an endpoint, if variables are passed to this request they come in through the TelevisionInputDto, the Path, or as RequestParam ->
- The Controller passes this on to the Service based on the request and any passed variables ->
- The Service calls the Repository based on the written function with the correct find function/query ->
- The Repository searches for the correct data based on the corresponding Model and sends it back to the Service ->
The Service applies the logic from the function and returns the response based on the TelevisionDto to the Controller
(The controller is called from the front-end or from Postman, and also returns the response.)

#Action Plan

Note: It is more challenging to create your own action plan. If you're not sure where to start, you can follow the steps below:

1- Add the required dependencies to your POM.xml and let Maven install them.
2- Create a folder named services in the folder structure.
3- Create a class named TelevisionService in the Services folder.
4- Add the Service annotation above the class.
5- Declare a private variable for the TelevisionRepository in the TelevisionService.
6- Add @Autowired to use the Repository in the TelevisionService.
7- Create the getTelevisions function in the TelevisionService based on the example in section 6.2 of the Spring Boot course in Edhub.
8- Do the same for getTelevision, saveTelevision, updateTelevision, and deleteTelevision functions.
9- Use @Autowired in the TelevisionController to use the Service in the Controller.
10- Create a folder named dtos in the project.
11- Create a class named TelevisionDto in this folder.
12- Define all variables that a Television object contains in this class (the same as defined in the model).
13- In the TelevisionService, create a public static function named toTelevisionDto. This function returns TelevisionDto and takes Television television as an attribute. (Bonus: this can also be done in a separate TelevisionMapper class)
14- In this function, create var dto = new TelevisionDto();.
15- For each variable declared above this function, add an assignment to the dto variable (for example: dto.name = television.getName(); ).
16- Return the dto object as the last step in this function and close the function.
17- Create a class named TelevisionInputDto in the dtos folder.
18- Also, define all variables that a Television object contains in this class.
19- In the TelevisionService, create a public function named toTelevision() with a return value of Television.
20- In this function, create var television = new Television();.
21- For each variable in the Television class, add an assignment to the television variable (for example: television.setName(name); ).
22- Adjust the RequestMappings in the TelevisionController so that the controller makes the request to the service layer and also receives the response from the service layer (this is because we want to keep the Controller as dumb as possible).
23- Adjust the service layer to use the data passed by the controller layer. The Service must then apply the logic to return a value using the Dtos to the controller.

#Bonus

Create an additional GetMapping that retrieves only the sales info of all Televisions.

- Also, create a corresponding service method for this.
- The sales info is {id, price, originalStock, sold}.
- Create a separate DTO for this.