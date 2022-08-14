package com.nttdata.bootcamp.bank.product.model.dao.inte;

import com.nttdata.bootcamp.bank.product.model.document.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface ProductDaoInte extends ReactiveMongoRepository<Client, String> {
    Mono<Client> findByCodeProduct(String codeProduct);
}
