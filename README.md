<div style="display: flex; align-items: center; justify-content: center;">
  <img src="https://www.linkpicture.com/q/favicon_27.png" style="align-items: center;" alt="Icon" width="50" height="50">
</div>
  <h2 align="center">MAKS HR Management System</h2>

  <p align="center" >
MAKS created for commercial companies for managing their human resource processes from one platform
    <br/>
    <br/>
    <a href="https://keremturak.github.io/HR-Management-Documentation"><strong>Explore the docs »</strong></a>

## Table of Content

**[1. About This Project](#about-this-project)**

  * [1.1. What did we try to do++](#what-did-we-try-to-do)
  * [1.2. Tech stack](#tech-stack)

**[2. Getting Started](#getting-started)**

  * [2.1. Conditions In The Project](#condition-in-the-project)

      * [2.1.1. Dependencies](#dependencies)
      * [2.1.2. Requirements](#requirements)

**[3. Usage/Examples](#usage/examples)**

**[4. How To Run](#how-to-run)**

**[5. Work Flow](#screenshots)**

  * [5.1. Screenshots](#screenshots)
  * [5.2. Templates](#templates)
      * [5.2.1. Color Reference](#color-refference)

**[6. Contributing](#contributing)**

**[7. Authors](#authors)**

**[8. Acknowledgements](#acknowledgements)**

**[9. Documentation](#documentation)**

 


## About This Project  
This is a human resources application that includes four distinct roles: admin, company manager, employee, and guest. Each role is equipped with its own dashboard, profile, and pages tailored to their specific responsibilities.

When a company manager registers, their registration is subject to approval by the admin. Once approved, the company manager gains access to the system and can subsequently add employees to the system.

The Employee profile page encompasses personal information, salary details, and shift schedules. The employee dashboard also provides information about public holidays and details about the company they are employed by.

Employees have the option to submit comments regarding their company, but these comments will only be published after receiving approval from the admin.

For company managers, there is a dedicated page with comprehensive information about their company's financial status, including income, expenses, and profit and loss data.

Guests who register with the application can access information and comments pertaining to all companies that are registered within the application.

> :memo: **Note:** Sunrises are beautiful.





## What Did We Try To Do 

MAKS HR operates through a structured process designed to streamline HR management. Here's a breakdown of how it functions:

Company Registration and Approval:

Company managers start by registering their company on the platform.
The registration request is then reviewed and approved by the admin.
Additionally, a confirmation email is sent to the registered company manager. Clicking the link in the email activates their account.
Adding Employees:

After the company manager's account and company are approved, they can start adding employees to the system.
Each added employee receives an email containing their login information and account activation details.
Company Manager Dashboard:

Once set up, company managers gain access to a comprehensive dashboard.
They can monitor parameters such as total employee count, employees added in the last 24 hours, and the overall economic status of the company.
Employee Interaction:

Employees can log in to the system and edit their profile information, including profile pictures and personal details.
They also have the ability to provide feedback on their respective companies.
Admin Approval for Feedback:

Comments provided by employees are subject to admin approval.
Once approved, guests and other specified users can view these comments.
Monitoring Company Parameters:

Employees also have the capability to monitor various parameters related to their company, such as salary status, leave days, and more.
This structured approach ensures that both company managers and employees can efficiently manage their HR processes and stay updated on crucial company metrics.


## Tech Stack 

<div style="display: flex; align-items: center;">
  <strong>Client:</strong>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/react/react-original.svg" alt="HTML5" width="25" height="20">
  React,
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/javascript/javascript-original.svg" alt="HTML5" width="25" height="20">JavaScript,
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/html5/html5-original-wordmark.svg" alt="HTML5" width="25" height="20">Html
</div>

**Server:**<img src="https://cdn.iconscout.com/icon/free/png-512/free-java-59-1174952.png?f=avif&w=256" alt="HTML5" width="25" height="20"> Java,<img src="https://cdn.iconscout.com/icon/free/png-512/free-rabbitmq-282296.png?f=avif&w=256" alt="HTML5" width="25" height="20"> RabbitMq<img src="https://camo.githubusercontent.com/96e43701d83561899724a89d71187445b7b8f4fe84518a3ea5bec8f85bd207bf/68747470733a2f2f63646e2e737667706f726e2e636f6d2f6c6f676f732f737761676765722e737667" alt="HTML5" width="25" height="20"> Swagger<img src="https://cdn.iconscout.com/icon/free/png-512/free-spring-16-283031.png?f=avif&w=256" alt="HTML5" width="25" height="20">SpringBoot, <img src="https://cdn.iconscout.com/icon/free/png-512/free-gradle-2-1174969.png?f=avif&w=256" alt="HTML5" width="25" height="20">Gradle


**Cloud:**<img src="https://cdn.iconscout.com/icon/free/png-512/free-google-cloud-2038785-1721675.png?f=avif&w=256" alt="HTML5" width="25" height="20">Google Cloud,<img src="https://cdn.iconscout.com/icon/free/png-512/free-kubernets-283489.png?f=avif&w=256" alt="HTML5" width="25" height="20">Kubernetes,<img src="https://cdn.iconscout.com/icon/free/png-512/free-docker-226091.png?f=avif&w=256" alt="HTML5" width="25" height="20">Docker

**DataBases:**<img src="https://cdn.iconscout.com/icon/free/png-512/free-postgresql-8-1175119.png?f=avif&w=256" alt="HTML5" width="25" height="20">Postgre,<img src="https://cdn.iconscout.com/icon/free/png-512/free-mongodb-3521676-2945120.png?f=avif&w=256" alt="HTML5" width="25" height="20">MongoDB



## Getting Started
When it comes to evaluating the effectiveness of a new tool or system, the saying "kicking the tires" is quite fitting. It means taking a close look, testing things out, and getting a feel for how it works.

In the context of MAKS HR, here are a few ways you can start "kicking the tires":

- **Explore the Dashboard:** Begin by navigating through the dashboard. Familiarize yourself with the layout and the different sections available.

- **Add Test Employees:** Use the platform to add a few test employees. This will give you a sense of how employee data is managed.

- **Simulate HR Processes:** Test out various HR processes like onboarding, leave requests, and performance evaluations. See how smoothly they flow within the system.

- **Generate Reports:** Experiment with the reporting features to see how you can extract valuable insights from the data.

Remember, "kicking the tires" is all about getting hands-on experience and making sure the tool aligns with your needs and expectations. Enjoy exploring MAKS HR!

> :warning: **Warning:** Do not push the big red button.


## Condition In The Project
- Java 8 SE or newer versions are required.
- The application serves as a server for API file operations, saving multiple files to the image folder under resources.
- The application utilizes both PostgreSQL and MongoDB as databases.
- Docker must be installed to initialize both MongoDB and RabbitMQ.
- Exercise caution as numerous validation checks are in place when performing operations. Adhere to these validations for smooth operation.


### Dependencies
![Dependencies](https://github.com/keremturak/HR-Management-Documentation/blob/main/docs/img/Gradle_logo.png?raw=true)

|      | Tech     | Url |
|----| -------- | ------- |
|1| Spring Boot Data Jpa  | implementation 'org.springframework.boot:spring-boot-starter-data-jpa'    |
|2| tymelift | "org.thymeleaf:thymeleaf-spring5:3.0.11.RELEASE"    |
|3| springDataMongodb  | "org.springframework.boot:spring-boot-starter-data-mongodb:${versions.springBoot}"    |
|4| postgreSql  | "org.postgresql:postgresql:${versions.postgreSql}"    |
|5| springBootRabbitMQ  | "org.springframework.boot:spring-boot-starter-amqp:${versions.springBoot}"    |
|6| Spring Boot Web | implementation 'org.springframework.boot:spring-boot-starter-web'     |
|7| Lombok    |compileOnly 'org.projectlombok:lombok'-----annotationProcessor 'org.projectlombok:lombok'    |
|8| MySql  | implementation 'mysql:mysql-connector-java:8.0.33'    |
|9| Swagger Ui | implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:2.1.0'     |
|10| Mapstruct    | implementation 'org.mapstruct:mapstruct:1.5.5.Final'   |
|11| Spring Boot Starter Mail  | implementation 'org.springframework.boot:spring-boot-starter-mail:3.1.1'   |
|12| javaJWT  | "com.auth0:java-jwt:${versions.jwt}"    |
|13| springCloudConfigServer | 	"org.springframework.cloud:spring-cloud-config-server:${versions.springCloud}"    |
|14| springCloudConfigClient | 	"org.springframework.cloud:spring-cloud-config-client:${versions.springCloud}"    |
|15| springCloudConfigStarter | 	"org.springframework.cloud:spring-cloud-starter-config:${versions.springCloud}"    |
|16| Validator | 	implementation  'org.hibernate.validator:hibernate-validator:8.0.0.Final'    |
|17| springCloudStarterApiGateway | 	"org.springframework.cloud:spring-cloud-starter-gateway:${versions.springCloud}"    |
|18| springCloudCircuitBreaker | 	"org.springframework.cloud:spring-cloud-starter-circuitbreaker-resilience4j:${versions.circuitBreaker}"    |
|19| springCloudCircuitReactor | 	"org.springframework.cloud:spring-cloud-starter-circuitbreaker-reactor-resilience4j:${versions.circuitBreaker}"    |




### Requirements
- 👉  <a href="https://keremturak.github.io/HR-Management-Documentation"><strong>Explore the docs »</strong></a>

## Usage/Examples

The code block that copies and stores the profile picture selected by the user into our system as an example.

```java
    @Value("${IMAGE_SOURCE}")
    private String uploadPath;
    public String copyProfilePhoto(MultipartFile file, Long userAuthId) {
        try {
            User user = userRepository.findOptionalByAuthid(userAuthId).orElse(null);
            String fileName = userAuthId.toString()+".jpg";
            String filePath = uploadPath + File.separator + fileName;
            System.out.println("file path"+filePath);
            file.transferTo(new File(filePath));
            if (user != null) {
                user.setAvatar(fileName);
                userRepository.save(user);
            }
            return "success";
        } catch (IOException e) {
            e.printStackTrace();
            return "failed";
        }
    }
```

Example email sending

```java
    public String sendGuestActivationMail(GuestMailRegisterModel guestMailRegisterModel) throws MessagingException {
        String templateName = "authentication-email";
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(
                mimeMessage,
                MimeMessageHelper.MULTIPART_MODE_MIXED,
                StandardCharsets.UTF_8.name()
        );
        Map<String, Object> properties = new HashMap<>();
        properties.put("username", guestMailRegisterModel.getUsername());
        CONFIRMATION_URL = String.format(CONFIRMATION_URL);
        properties.put("confirmationUrl", CONFIRMATION_URL);
        Context context = new Context();
        context.setVariables(properties);
        helper.setTo(guestMailRegisterModel.getPersonalEmail());
        helper.setSubject("Welcome to our nice platform");
        String template = templateEngine.process(templateName, context);
        helper.setText(template, true);
        mailSender.send(mimeMessage);
        return "success";
    }
```


## How To Run

- 👉  <a href="https://keremturak.github.io/HR-Management-Documentation"><strong>Explore the docs »</strong></a>

## Screenshots



## Templates
mail sender:


succesful activation:



fail activation:



## Color Reference

| Color             | Hex                                                                |
| ----------------- | ------------------------------------------------------------------ |
| Example Color | ![#0a192f](https://via.placeholder.com/10/0a192f?text=+) #0a192f |
| Example Color | ![#f8f8f8](https://via.placeholder.com/10/f8f8f8?text=+) #f8f8f8 |
| Example Color | ![#00b48a](https://via.placeholder.com/10/00b48a?text=+) #00b48a |
| Example Color | ![#00d1a0](https://via.placeholder.com/10/00b48a?text=+) #00d1a0 |

## Contributing

Contributions are always welcome!

- 👉  <a href="https://keremturak.github.io/HR-Management-Documentation"><strong>Explore the docs »</strong></a>


## Authors

- [@keremturak](https://www.github.com/keremturak)
- [@Muhammetkarakurt](https://www.github.com/MuahammetKarakurt)


## Acknowledgements

 - [Awesome Readme Templates](https://awesomeopensource.com/project/elangosundar/awesome-README-templates)
 - [Awesome README](https://github.com/matiassingers/awesome-readme)
 - [How to write a Good readme](https://bulldogjob.com/news/449-how-to-write-a-good-readme-for-your-github-project)

## Documentation

- 👉  <a href="https://keremturak.github.io/HR-Management-Documentation"><strong>Explore the docs »</strong></a>

