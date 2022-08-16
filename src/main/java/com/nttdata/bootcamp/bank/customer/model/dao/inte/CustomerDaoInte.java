package com.nttdata.bootcamp.bank.customer.model.dao.inte;

import com.nttdata.bootcamp.bank.customer.model.document.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface CustomerDaoInte extends ReactiveMongoRepository<Customer, String> {

    Mono<Customer> readByCodeCustomer(String codeCustomer);
}
