# Flatten the user hierarchy data
API server that does simple "User Hierarchy"

#### Prerequisite for this project:
1. Java JDK 8 (http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
2. Maven  (https://maven.apache.org/install.html)
3. Heroku Account for Deployment. (https://www.heroku.com/)


#### How to run project locally
```sh
$ git clone https://github.com/hlaingwintunn/team_hierarchy.git
$ cd team_hierarchy/
$ mvn clean package
$ java -jar target/*.jar

- After app is started, you can access the swagger Rest Api documentation with 
   http://localhost:8080/swagger-ui.html
- *Application run on port 8080.Make sure its not in use!*
```

#### Technologies Used
```sh
Java 8
Springboot
Spring Data JPA
Swagger RestApi Documentation
H2 inmemory Database
Junit (Testcase)
Heroku (Deployment)
```

#### User EndPoints
```sh
http://localhost:8080/api/createUser

```

#### Database Web Condole
The application's H2 database web console.
- `http://localhost:8080/console/`
```
 JDBC URL: `jdbc:h2:mem:userhierarchydb`
 User Name: `sa`
 Password:
 ```
