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



<h4>Zadání</h4>
·         Cílovou webovou aplikací by měl být jednoduchý kontaktní formulář viz wireframe (WF) níže

·         FE komponenty by měly obsáhnout jeden selectbox, jehož data (možnosti) se dotahují skrze BE z DB vrstvy

·         Input fieldy by měly obsahovat základní validace 

o    Policy number – alfanumerické znaky

o    Name + Surname – pouze písmena

o    Request field by měl omezovat délku (dle Vaší úvahy, nemusí být 5.000 jako je ve WF)

·         Submit formu má skrze BE uložit do DB

·         Aplikace půjde kompletně sestavit jedním příkazem s využitím libovolného nástroje pro sestavování aplikací (např. gradle, maven, … ).


Výběr technologií/frameworků je zcela na vás, jediný limit je Java backend. Předání kódu taktéž, ať už půjde o publikaci do repositáře, či předání „po staru“ v nějakém zip archivu. Kdyby něco z toho nebylo jasné, tak klidně dejte vědět, zavolejte nebo napište na tento email.
