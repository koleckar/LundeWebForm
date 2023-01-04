# LundeWebForm

<H4> Web form using SpringBoot, Thymeleaf, h2 database and Hibernate. </h4>

<div align="Left">
    <img src="/images/WebFormSnippet.png" width="800px"</img> 
</div>
App Snippet 
<br>
Uppon startup RequestTypes are put into the h2 database. 
Upon GET request to the main page, the dropdownlist is populated.
Request server-side validated.

---------------------------
<br>
<br>
App is running at http://localhost:8080
<br>
H2 console at http://localhost:8080/h2-console    
 <br>
 <br>
Driver Class: org.h2.Driver  
<br>
JDBC URL: jdbc:h2:mem:requestsDB  
<br>
User Name: dk  
<br>
Password: password 
<br>
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
WebForm not displaying succes message on succesfull submit, also after the submit the fields are not reloaded to blank fields.
JUnit tests not completed.
Documentation not completed.
