# API Sing-in players uol
## Uol Backend Challenge


![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

This project is an API built using **Java, Java Spring, AWS Simple Email Service.**

The Microservice was developed for my [Youtube Channel](https://youtu.be/eFgeO9M9lLw?si=uyhUXrR-NLEpBW6p), to demonstrate how to solve the [Uber Backend Challenge](https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md).

## Table of Contents

## Installation

1. Clone the repository:

```bash
git clone https://github.com/DiegoLeandro477/desafio-uol-java.git
```

2. Install dependencies with Maven
```bash
./mvnw clean install
```
The database in configurated with H2DB

##  Usage

1. Start the application with Maven
```bash
./mvnw spring-boot:run
```
2. The API will be accessible at http://localhost:8080

## API Endpoints
The API provides the following endpoints:

**GET USERS**
```markdown
GET /users - Get find All users.
```

**POST USER**
```markdown
POST /users - POST user in database
```
**BODY**
```json
{
  "name": "exemple",
  "email": "exemple@gmail.com",
  "phoneNumber": "98999999999",
  "legion": "VINGADORES",
}
```
Selected legoin: ```VINGADORES``` or ```LIGADAJUSTICA```

