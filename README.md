# Spring Cloud Config Basics

### Overview

This sample shows off how one can use Spring Cloud Config Server can externalize configuration of each application. It also showcases ways that one can create configurations that target different environments and overriding configuration values based on application profiles. 

### Run the Demo

* Fork https://github.com/ramya-sks/spring-cloud-config-basics-repo into your own Git repo on GitHub
* Edit to `config-server\src\main\resources\application.yml` to point to your fork from step 1
* Start kafka locally
* Run config-server application
* Run `billboard` application
* Run `greeter` application
 

### Things to try out 
* http://localhost:8080/actuator/refresh will trigger a property refresh for the "greeter" service
* http://localhost:8081/actuator/refresh will trigger a property refresh for the "billboard" service
* http://localhost:8888/monitor endpoint on the config-server will trigger a property refresh for "greeter" or "billboard" service
```
curl -X POST localhost:8888/monitor -H "X-Github-Event: push" -H "Content-Type: application/json" -d '{"commits": [{"modified": ["greeter.yml"] }]}'

curl -X POST localhost:8888/monitor -H "X-Github-Event: push" -H "Content-Type: application/json" -d '{"commits": [{"modified": ["billboard.yml"] }]}'
```
* Access the `/health` endpoint of each app. Notice how the configuration defined in `application.yml` applies to both applications.

 
### Resources to Learn More:
* https://cloud.spring.io/spring-cloud-config/
