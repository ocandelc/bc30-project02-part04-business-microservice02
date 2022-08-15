package com.nttdata.bootcamp.bank.product.model.dao.inte;

import com.nttdata.bootcamp.bank.product.model.document.Client;
import com.nttdata.bootcamp.bank.product.model.document.ClientType;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface ClientTypeDaoInte extends ReactiveMongoRepository<ClientType, String> {
    Mono<ClientType> findById(String Id);
}
