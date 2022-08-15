package com.nttdata.bootcamp.bank.client.model.dao.inte;

import com.nttdata.bootcamp.bank.client.model.document.Client;
import com.nttdata.bootcamp.bank.client.model.document.ClientType;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface ClientTypeDaoInte extends ReactiveMongoRepository<ClientType, String> {
    Mono<ClientType> readByCodeClientType(String codeClientType);
}
