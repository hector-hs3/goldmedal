# Gold Medal Metrics Challenge Project

## Project Overview

This project is meant to practice Spring JPA (set-up & adding custom queries), H2 concepts (set-up & SQL practice).
The resulting application is a simple Olympics analytics web app.

---

## Running Aplication

For Linux based OS run the following in Terminal:

`./mvnw spring-boot:run`

For Windows run the following in cmd:

`mvnw spring-boot:run`

Then open preferred browser to `http://localhost:3001/`

---

## Accessing H2-Console:
In preferred browser, visit: `http://localhost:3001/h2-console/`

For the JDBC URL use the following: 

`jdbc:h2:mem:goldmedal-db`

Please refer to `application.properties` for login information.
