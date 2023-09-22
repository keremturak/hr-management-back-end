package com.bilgeadam.config.rabbit;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    private final String exchange = "company-exchange";

    @Bean
    DirectExchange companyExchange(){
        return new DirectExchange(exchange);
    }
    //register producer
    private final String userCompanyRegisterQueue = "user-company-register-queue";
    private final String userCompanyRegisterBinding = "user-company-register-binding";

    @Bean
    Queue userRegisterQueue() {
        return new Queue(userCompanyRegisterQueue);
    }

    @Bean
    public Binding userRegisterBinding(final DirectExchange companyExchange,
                                       final Queue userRegisterQueue) {
        return BindingBuilder.bind(userRegisterQueue)
                .to(companyExchange)
                .with(userCompanyRegisterBinding);
    }
    // UserCompanyId producer

    private final String userCompanyIdQueue = "user-company-id-queue";
    private final String userCompanyIdBinding = "user-company-id-binding";
    @Bean
    Queue userCompanyIdQueue() {
        return new Queue(userCompanyIdQueue);
    }

    @Bean
    public Binding userCompanyIdBinding(final DirectExchange companyExchange,
                                       final Queue userCompanyIdQueue) {
        return BindingBuilder.bind(userCompanyIdQueue)
                .to(companyExchange)
                .with(userCompanyIdBinding);
    }

    //AddEmployeeCompanyProducer
    private String addEmployeeCompanyQueue = "add-employee-company-queue";
    private String addEmployeeCompanyBinding = "add-employee-company-binding";

    @Bean
    Queue addEmployeeCompanyQueue(){
        return new Queue(addEmployeeCompanyQueue);
    }
    @Bean
    public Binding addEmployeeCompanyBinding(final Queue addEmployeeCompanyQueue, final DirectExchange directExchange){
        return BindingBuilder.bind(addEmployeeCompanyQueue).to(directExchange).with(addEmployeeCompanyBinding);
    }

    //RegisterCompanyManager Producer
    private String registerCompanyManagerQueue = "register-company-manager-queue";
    private String registerCompanyManagerBinding = "register-company-manager-binding";

    @Bean
    Queue registerCompanyManagerQueue(){
        return new Queue(registerCompanyManagerQueue);
    }
    @Bean
    public Binding registerCompanyManagerBinding(final Queue registerCompanyManagerQueue, final DirectExchange directExchange){
        return BindingBuilder.bind(registerCompanyManagerQueue).to(directExchange).with(registerCompanyManagerBinding);
    }

    // add comment save comment producer
    private final String addCommentSaveCommentQueue = "add-comment-save-comment-queue";
    @Bean
    Queue addCommentSaveCommentQueue(){
        return new Queue(addCommentSaveCommentQueue);
    }
    private final String addCommentSaveCommentBinding = "add-comment-save-comment-binding";
    @Bean
    public Binding addCommentSaveCommentBinding(final DirectExchange companyExchange, final  Queue addCommentSaveCommentQueue){
        return BindingBuilder.bind(addCommentSaveCommentQueue).to(companyExchange).with(addCommentSaveCommentBinding);
    }

    // get company information producer (to user service)
    private final String getCompanyInformationQueue = "get-company-information-queue";
    @Bean
    Queue getCompanyInformationQueue(){
        return new Queue(getCompanyInformationQueue);
    }
    private final String getCompanyInformationBinding = "get-company-information-binding";
    @Bean
    public Binding getCompanyInformationBinding(final DirectExchange companyExchange, final Queue getCompanyInformationQueue){
        return BindingBuilder.bind(getCompanyInformationQueue).to(companyExchange).with(getCompanyInformationBinding);
    }

    // add comment get userid and companyid producer (to user service)
    private final String addCommentGetUserAndCompanyQueue = "add-comment-get-user-and-company-queue";
    @Bean
    Queue addCompanyGetUserAndCompanyQueue(){
        return new Queue(addCommentGetUserAndCompanyQueue);
    }
    private final String addCommentGetUserAndCompanyBinding = "add-comment-get-user-and-company-binding";
    @Bean
    public Binding addCommentGetUserAndCompanyBinding(final DirectExchange companyExchange, final Queue addCompanyGetUserAndCompanyQueue){
        return BindingBuilder.bind(addCompanyGetUserAndCompanyQueue).to(companyExchange).with(addCommentGetUserAndCompanyBinding);
    }

    // add employee get company id model producer (to user service)
    private final String addEmployeeGetCompanyIdQueue = "add-employee-get-company-id-queue";
    @Bean
    Queue addEmployeeGetCompanyIdQueue(){
        return new Queue(addEmployeeGetCompanyIdQueue);
    }
    private final String addEmployeeGetCompanyIdBinding = "add-employee-get-company-id-binding";
    @Bean
    public Binding addEmployeeGetCompanyIdBinding(final DirectExchange companyExchange, final Queue addEmployeeGetCompanyIdQueue){
        return BindingBuilder.bind(addEmployeeGetCompanyIdQueue).to(companyExchange).with(addEmployeeGetCompanyIdBinding);
    }

    // add employee save auth producer (to auth service)
    private final String addEmployeeSaveAuthQueue = "add-employee-save-auth-queue";
    @Bean
    Queue addEmployeeSaveAuthQueue(){
        return new Queue(addEmployeeSaveAuthQueue);
    }
    private final String addEmployeeSaveAuthBinding = "add-employee-save-auth-binding";
    @Bean
    public Binding addEmployeeSaveAuthBinding(final DirectExchange companyExchange, final Queue addEmployeeSaveAuthQueue){
        return BindingBuilder.bind(addEmployeeSaveAuthQueue).to(companyExchange).with(addEmployeeSaveAuthBinding);
    }

    // add employee save user producer (to user service)
    private final String addEmployeeSaveUserQueue = "add-employee-save-user-queue";
    @Bean
    Queue addEmployeeSaveUserQueue(){
        return new Queue(addEmployeeSaveUserQueue);
    }
    private final String addEmployeeSaveUserBinding = "add-employee-save-user-binding";
    @Bean
    public Binding addEmployeeSaveUserBinding(final DirectExchange companyExchange, final Queue addEmployeeSaveUserQueue){
        return BindingBuilder.bind(addEmployeeSaveUserQueue).to(companyExchange).with(addEmployeeSaveUserBinding);
    }

    //Consumer

    String userListCompanyQueue = "userList-company-queue";

    @Bean
    Queue userListCompanyQueue(){
        return new Queue(userListCompanyQueue);
    }

    // company register consumer
    String companyRegisterQueue = "company-register-queue";

    @Bean
    Queue companyRegisterQueue(){
        return new Queue(companyRegisterQueue);
    }

    // get pending comments company name consumer (to comment service)
    private final String getPendingCommentsCompanyNameQueue = "get-pending-comments-company-name-queue";
    @Bean
    Queue getPendingCommentsCompanyNameQueue(){
        return new Queue(getPendingCommentsCompanyNameQueue);
    }

}
