# LundeWebForm

<H4> Web form using SpringBoot, Thymeleaf, h2 database and Hibernate. </h4>

<div align="Left">
    <img src="/images/WebFormSnippet.png" width="800px"</img> 
</div>
App Snippet 
<br><br>
Uppon startup RequestTypes are put into the h2 database. 
<br>
Upon GET request to the main page, the dropdownlist is populated.
<br>
Request server-side validated.

---------------------------

App is running at http://localhost:8080

H2 console at http://localhost:8080/h2-console    
Driver Class: org.h2.Driver  
JDBC URL: jdbc:h2:mem:requestsDB  
User Name: dk  
Password: password 

---------------------------

<br>
<br>
<br>
<div align="left">
    <img src="/images/schema.png" width="600px"</img> 
</div>
SQL schema
<br>
<br>

<h3>issues/TODOs</h3>
WebForm not displaying success message on successfull submit, also after the submit the fields are not reloaded to blank fields.<br>
JUnit tests not completed.<br>
Documentation not completed.<br>
In-memory db used for simplicity, use eg. PostgreSQL.<br>
Instead of SpringMVC use WebFlux.<br>
Add Kafka for handling backpressure.
