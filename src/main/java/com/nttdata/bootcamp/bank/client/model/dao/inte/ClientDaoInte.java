package com.nttdata.bootcamp.bank.client.model.dao.inte;

import com.nttdata.bootcamp.bank.client.model.document.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface ClientDaoInte extends ReactiveMongoRepository<Client, String> {
<<<<<<< HEAD
    Mono<Client> findById(String codeProduct);
=======
    Mono<Client> readByCodeClient(String codeClient);
>>>>>>> 0ed9a1e8f9d229e395e5b83e11fe951b5497e80d
}
