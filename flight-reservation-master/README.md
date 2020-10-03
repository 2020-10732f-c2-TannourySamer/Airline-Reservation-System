# Airline Reservation System
Airline Reservation System is a Java-based booking solution for flight tickets. 
Travelers may want to make changes in their bookings. The application allows them to book, cancel, view, and update their bookings with ease. All the bookings and flights can be viewed, added, and modified on a single application by the administrator. 

## Scope

Following is the functionality provided by the system:   
There are two categories of people who would access the system: customer and administrator.
Each of these would have some exclusive privileges.   

The customer can:
Create his user account. 
Login into the application. 
Check for available flights. 
Make a booking. 
View the bookings made. 
Cancel or modify a booking.   
The administrator can: 
Login into the application. 
Add flight details. 
View the flight details. 
Cancel or modify the flight details.  

The following functionalities have not been covered under the application:   

The application does not cover boarding pass generation and seating plans. 
Third-party applications like email & SMS integrations. 
Payment Gateways. 

## How it was built 
Created a web application where logged in users as well as search and book flights.
Added feature to register new users and implement login.
Used Spring Data JPA(hibernate) as an ORM to interact with the MYSQL database.
Designed front end templates using thymeleaf and styled them using Bootstrap and Css.
Used bower.js to install jquery and bootstrap dependencies.
Created Integration layer(REST API) for flight checkin microservice to check in passengers with reservations.

## Technologies Stack
Backend:
Java
Spring Boot
REST
Microservices
JPA
thymeleaf
HTML 5
CSS 3
Bootstrap 4

## Database Model
There are 6 tables (scripts available in resourses folder)

FLIGHT
RESERVATION
USER
PASSENGER
User_Role
Role

There is one to one mapping assumed between reservation and passenger as well as reservation and flight.
The role is used to classify different types of users for eg admin users and normal users.
User_role table creates a many to many relationship between users and roles. This means we can assign multiple roles to a user and a user can be assigned multiple roles.