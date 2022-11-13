# RestAssured TestNG Gradle Example

This repo contains a simple example on how to automate REST APIs using Rest-Assured

## Technologies
- [Rest-assured 5.2.0](https://rest-assured.io)
- [TestNG 7.6.1](https://testng.org/doc/)
- [Gradle 7.4](https://gradle.org)
- [Open JDK Corretto 17](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html)

## Project Structure
The project contains an ApiTest class to perform a couple of Rest-assured tests to validate the status code and the 
presence of certain fields in the response obtained when sending a GET to request to the https://reqres.in/api/users/2 endpoint.

The body of the response contains two nested json objects: data and support. Three entity classes were defined in order to deserialize
the response: the JsonResponse class to map the response, and the Data and Support classes to map the nested objects respectively.