package com.nttdata.bootcamp.bank.customer.model.dao.inte;


import com.nttdata.bootcamp.bank.customer.model.document.Customer;
import com.nttdata.bootcamp.bank.customer.model.document.CustomerType;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface CustomerTypeDaoInte extends ReactiveMongoRepository<CustomerType, String> {

    Mono<CustomerType> readByCodeCustomerType(String codeCustomerType);

}
