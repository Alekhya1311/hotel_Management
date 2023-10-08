# Hotel Management Application

## Documentation Links

### Sprint Documents <br/>

[Link to Sprint Journal](https://docs.google.com/spreadsheets/d/16BqCZ0bVYJwDssp8gsMDdGqSLah9oz8eij3ZgOSaOZg/edit#gid=1832506498)

## Scrum Meeting Days - Friday

## Technologies we used for the application.

ReactJS: Frontend <br/>
Java Spring Boot: Backend <br/>
MongoDB Atlas for Database <br/>
Deployment AWS EC2 with load balancing <br/>

## IDE

IntelliJ IDEA, VS Code

## Version control

Git

### XP Values <br/>

### Respect <br/>

1. During the development phase we pushed our changes to our particular branch and created pull requests. Once the code was approved by another team member, we pushed the changes to the master branch.
2. We made sure the code changes on the master branch was always stable and did not break the other team member’s code.
3. We tested code thoroughly and did not perpetrate mistakes that might break compilation, that fails integration tests or hampers the work of peers.

### Feedback <br/>

1. Continuous feedback helped us in aligning our goals and responsibilities.
2. Constructive feedback gave us a healthy environment for interaction and conveying our thoughts more transparently.
3. By giving and receiving regular feedbacks, adapted to the changes and avoid recurring mistakes.
4. This motivated us to perform more efficiently.

## Use Case Diagram

<img width="558" alt="Screen Shot 2022-05-14 at 11 35 11 PM" src="https://user-images.githubusercontent.com/95255376/168460506-225eea19-33a2-4cb9-a2fd-e8472db6f4c6.png">

## Architecture Diagram

<img width="849" alt="Architecture" src="https://user-images.githubusercontent.com/95255376/168460228-41556262-d649-46c7-8b72-d28e5eef0ca2.png">

## Component Diagram

![Component](https://user-images.githubusercontent.com/95255376/168460273-754f5a6a-bf9f-49f5-b369-5230aca369c0.png)

## Deployment Diagram

![deployment](https://user-images.githubusercontent.com/59953902/168516421-1b435494-682d-4e33-8bf8-ef0001981a17.jpeg)

# Design Decisions:

### Database

Why we choose NoSQL over SQL?

- We need not bother about inner workings of databases before using them.
- NoSQL databases, gives the flexibility to work on what is required rather than forcing the schema on the database.
- Our focus will not be on writing the data into the db if we are using NoSQL.
- We used MongoDb as our NOSQL database.

Why MongoDB ?

- Flexibility in the model due to the presence of secondary indexes.
- Mongo DB is schemaless and hence we not define the schema in the start.

## Rest Over GraphQL

- Managing errors is easier using Rest compared to that of Graphql.
- GraphQL also limits MongoDB's Flexible schema with its fixed schema.

## Why Spring Boot with React

- Performance and UI rendering.
  When it comes to UI layer abstraction, React JS is the finest. Because React is merely a library, you may construct the application and organize the code anyway you wish. As a result, it outperforms Angular in terms of UI rendering and speed.

- Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications. It’s a Java-based framework used to create a microservices. Spring Boot also provides auto configuration which removes the headache of manually configuration.

- Free and Open Source
  All of the technologies used are open-source. This feature enables a developer to obtain answers to issues that may arise during development from the accessible open sources.

## Hosting on Amazon EC2 with Load Balancer

- Automated Scaling : application can be automatically scaled up and down depending on its needs based on the web API's written
- RELIABLE: Amazon EC2 offers a highly reliable environment where replacement instances can be rapidly and predictably commissioned.
- INEXPENSIVE Amazon EC2 is very low rate for the compute capacity you actually consume.

# Feature Set

## Admin:

- Will be able to add new Peak price and set duration of season, edit Peak Price, delete Peak Price
- Will be able to view Hotels available.
- Will be able to view users.

## Customer:

- Login to the application
- New customers can register to our application
- Will be able to check available rooms for selected period of time
- Will be able to search for hotels in a particular location
- Select required amenities for the respective rooms.
- Will be able to earn reward points.
- Will be able to edit booking
- Will be able to cancel booking
