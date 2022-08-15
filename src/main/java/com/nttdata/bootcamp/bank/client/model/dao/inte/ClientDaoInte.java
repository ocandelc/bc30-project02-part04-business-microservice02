package com.nttdata.bootcamp.bank.client.model.dao.inte;

import com.nttdata.bootcamp.bank.client.model.document.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface ClientDaoInte extends ReactiveMongoRepository<Client, String> {

    Mono<Client> findById(String codeProduct);
    Mono<Client> readByCodeClient(String codeClient);
}
