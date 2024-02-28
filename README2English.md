Introduction

You have just started as a developer at a company called Tech It Easy, which sells TVs. During the Spring Boot course, you will be programming a backend application for them. The store has an inventory of televisions that needs to be maintained. After each lesson, we will further develop this application as homework. This way, we gain step-by-step experience in building a backend application. At the end of the course, we will have a working Tech It Easy backend!

Recap of Previous Assignment

In the previous lesson, you started the application for your employer TechItEasy. You created a controller with various endpoints. These can be called via a frontend. You use Postman for this purpose. Since we don't know if everything the user requests exists, you also created an exception controller and a RecordNotFound exception. After a new Spring Boot lesson, you are ready for the next step in building your application.

Requirements

The project contains, in the correct location in the folder structure, a folder named models.
The project contains, in the correct location in the folder structure, a folder named repositories.
The project contains a Television class in the models folder.
The project contains a TelevisionRepository.
The project contains the following dependencies:
Spring Web
Spring Data JPA
PostgreSQL Driver
The application.properties contains the properties from chapter 5.3 of the Spring Boot course (with modified names).
The TelevisionRepository extends JpaRepository with the correct parameters.
The Television contains:
the attributes:
Long id (including annotations id and generatedValue)
String type
String brand
String name
Double price
Double availableSize
Double refreshRate
String screenType
String screenQuality
Boolean smartTv
Boolean wifi
Boolean voiceControl
Boolean hdr
Boolean bluetooth
Boolean ambiLight
Integer originalStock
Integer sold
default constructor
constructor
all getters and setters
Important
Ensure that the application.properties matches the data in PgAdmin.
You may use the following ResponseEntity as return values:
ResponseEntity.ok("television")
ResponseEntity.created(null).body("television")
ResponseEntity.noContent().build()
Make sure your database password is not the same as the password you use for your email, Facebook, or other applications. Since this application does not need to be deployed, you can choose an easy password such as "password" or "banana."
Steps

Note: It is more challenging to create your own step-by-step plan. If you are not sure where to start, you can follow the steps below:

Add the required dependencies to your POM.xml and let Maven install them.
Add the necessary properties to the application.properties.
Create a new database in PgAdmin (ensure that your application.properties matches the name, password, and user of the database).
Create a new folder in your project for models.
Create a new class named Television.
Add the @Entity annotation to the class.
Add the correct attributes to the class.
Add both constructors to the class.
Add all getters & setters to the class.
Create a new folder in your project for repositories.
Add a new class to this folder named TelevisionRepository.
Extend the repository with JpaRepository and provide the correct attributes (the model type and the ID type).
Bonus

A television has quite a few variables, but there is little variation in the types. They are only Strings, Booleans, or numbers. Try using other data types such as:

A Date for sold (saleDate) or originalStock (purchaseDate) (there are different options in Java to create a date).
An enumeration for one or more of availableSize, refreshRate, screenType, and screenQuality.
Look up how to create such data types on Baeldung, W3, GeeksForGeeks, etc.
Also, consider how this will be stored in your database. Is this different from other data types?
Also, make sure you input these data types correctly in Postman. You can find this information on the internet, but you can also find it using the trial-and-error method.
Note: You can also try other types, but you cannot (yet) use lists or other types of collections. Each variable becomes a column in the database table. Only one value can be in such a column, not a whole list of values.