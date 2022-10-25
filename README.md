<h1 align="center">GoEmergency</h1>

<div align="center" style="display: inline_block"><br>
    <img align="center" alt="Gabriel-Node" height="40" width="40" src="https://github.com/devicons/devicon/blob/master/icons/nodejs/nodejs-original.svg">
</div>

## Summary

1. [About the project](#general-information)

2. [Class Diagram](#class-diagram)

3. [Application Requirements](#requirements)

4. [Enviroment Setup](#enviroment-setup)

5. [Tests](#tests)

6. [Docs](#docs)

7. [Tools](#tools)

8. [Providers](#providers)

9. [Contribution](#contributing)

10. [License](#license)

## ⁉ What's Amatronic? <a name="general-information" />

Amatronic is an RESTful API made for educational's purposes, it's a
personal project to contribute with my Career portfolio
and was built to serve as an Back-end of an E-commerce application,
whatever is the theme, it's functional 🔥🚀.

## 🏗 Class Diagram <a name="class-diagram" />
<img src="./public/diagram.png">

## 📌 Project requeriments <a name="requirements" />:

All business rules for this API can be found on this [link](./docs/business_rules.md).

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
