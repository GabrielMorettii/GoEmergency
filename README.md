
<div align="center" style="display: inline_block"><br>
 <img align="center" src="https://github.com/GabrielMorettii/GoEmergency/blob/master/github/assets/logo.png" alt="logo">
</div>

## ⁉ What's GoEmergency ?

GoEmergency is a project that aims to help people make better decisions about
what to do when they have certain symptoms, but it in no way replaces the help of a qualified healthcare professional.

It was initially created in 2020 as a course conclusion work on how telemedicine can help 
in a chaotic environment as it was at the beginning of the coronavirus pandemic.

## Overview 

![Preview-Screens](https://github.com/GabrielMorettii/GoEmergency/blob/master/github/assets/preview.jpg)

## 🏗 Class Diagram

The system targets clinics in general. Each patient will have personal information registered such as CPF, e-mail, password, etc; being that each one will carry out consultations of diseases of the symptoms that he is feeling, being able to carry out several consultations. Each doctor will be registered as a person and also with their specialty and CRM. Each patient can open one or more chats with specialist doctors and each doctor can chat with one or more patients.

<div align="center" style="display: inline_block"><br>
 <img  align="center" width="80%" height="500" src="https://github.com/GabrielMorettii/GoEmergency/blob/master/github/assets/diagram.png">
</div>

## 🕴️ Actors

The "GoEmergency" system has as main actors: Patient, Doctor and Administrator, who inherit from Actor Pessoa, who is responsible for carrying the attributes in common among the other actors.

<div align="center" style="display: inline_block"><br>
 <img  align="center" src="https://github.com/GabrielMorettii/GoEmergency/blob/master/github/assets/actors.png">
</div>



## 📌 Project requeriments

All application business rules for the Admin actor can be found in this diagram. I just put this one up to exemplify what it's like for other actors.

<div align="center" style="display: inline_block"><br>
 <img  align="center" src="https://github.com/GabrielMorettii/GoEmergency/blob/master/github/assets/adm-usecases.png">
</div>

## 💻 Enviroment Setup <a name="enviroment-setup" />:

```
# Clone this repository
$ git clone https://github.com/GabrielMorettii/Amatronic.git
# Enter the repository:
$ cd Amatronic
# Install the dependencies:
$ yarn
# Create the app containers:
$ docker-compose up -d
# Run the migrations
$ yarn typeorm migration:run
# Run the application
$ yarn dev
# The server is running at port 3333 (http://localhost:3333/)
```

## 🧪 Run the tests <a name="tests" />:
```bash
# To run all tests and generate coverage reports:
$ yarn test
# The coverage reports can be seen by going to /coverage/lcov-report/index.html and opening this html file in your browser.
```

## 📚 Docs <a name="docs" />:

All API endpoints have been documented using Swagger. To view just access the URL below

Remember to start the server first

<a href="http//localhost:3333/docs">http//localhost:3333/docs</a>

## 🔧 Built With <a name="tools" />:

- [BCrypt](https://www.npmjs.com/package/bcrypt 'BCrypt') - For password-hashing
- [Cors](https://www.npmjs.com/package/cors 'Cors') - Enable the cross-origin acess
- [Docker](https://www.docker.com/ 'Docker') - Enables the containerization
- [ExpressJS Async Errors](https://www.npmjs.com/package/express-async-errors 'ExpressJS Async Errors') - Error handling support for express
- [JSONWebToken](https://www.npmjs.com/package/jsonwebtoken 'JSONWebToken') - For authentication
- [Swagger](https://swagger.io/ 'Swagger') - Helps on the RESTful API Design and documentation
- [TSConfig-Paths](https://www.npmjs.com/package/tsconfig-paths, 'TSConfig-Paths') -
Modules Mapping
- [TSyringe](https://github.com/microsoft/tsyringe 'TSyringe') - Dependency Injection
- [TypeORM](https://typeorm.io/#/ 'TypeORM') - ORM
- [TypeScript](https://www.typescriptlang.org/ 'TypeScript') - Javascript's superset
- [eslint](https://eslint.org/) - JS Linter and code style
- [JEST](https://jestjs.io/) - Tests
- [prettier](https://github.com/prettier/prettier) - Code formatter
- [super-test](https://github.com/visionmedia/supertest) - Test HTTP requests
- [NodeJS](https://nodejs.org/en/) - Build the server
- [AWS](https://aws.amazon.com/pt/) - IaaS used in the production
- [GitHub](https://github.com/GabrielMorettii/Amatronic/actions) - CI + CD
- [express](https://expressjs.com/) - Router of the Application
- [postgreSQL](https://www.postgresql.org/) - Relational Database
- [pm2](https://pm2.keymetrics.io/) - Process Manager used in the production
- [dotenv](https://github.com/motdotla/dotenv) - Environment loader
- [multer](https://github.com/expressjs/multer) - File Upload

---

## 🧰 Support tools <a name="ferramentas-suporte" />:

- [Amazon SES](https://aws.amazon.com/pt/ses/) - Email Provider
- [Amazon S3](https://aws.amazon.com/pt/s3/) - Storage Service

## 🧐 Contributing <a name="contributing" />:

You can send how many PR's do you want, I'll be glad to analyse and accept them! And if you have any question about the project...

Email-me: gabrielmorettisilva@gmail.com

Connect with me at [LinkedIn](https://www.linkedin.com/in/gabriel-morettii/)

Thank you!

## 🔑 License <a name="license" />:

This project is licensed under the MIT License - see the [LICENSE.md](https://github.com/GabrielMorettii/Amatronic/blob/main/LICENSE) file for details.
